package com.korea.board;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.BoardDAO;
import lombok.RequiredArgsConstructor;
import util.Common;
import util.Common.Board;
import util.Page;
import vo.BoardVO;
import vo.MemberVO;

@Controller
@RequiredArgsConstructor
public class BoardController {
	
	final BoardDAO boardDAO;
	
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	HttpSession session;
	
	//조회하기 
	@RequestMapping(value= {"/","board_list"})
	public String board_list(Model model, @RequestParam(required=false)String page) {
		//페이지별로 10개의 게시물이 보이도록 코드를 작성
		
		
		int nowPage = 1;
		
		//page가 null이 아니고 empty상태가 아닐 때 page에 들어있는 값을 nowPage에 대입하기 
		if(page != null && !page.isEmpty()) {
			nowPage = Integer.parseInt(page);
		}
		
		//select * from~ 
		//게시글 전체에 등수를 매기고 10개씩 잘라서 한 페이지 보여줬음 
		int start = (nowPage -1) * Board.BLOCKLIST +1;
		int end = start + Board.BLOCKLIST -1;
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", start);
		map.put("end", end);
		
		//페이지 번호에 따른 전체 게시글 조회 
		List<BoardVO> list = boardDAO.selectList(map);
		
		//전체 게시물 수 조회 
		int rowTotal = boardDAO.getRowTotal();
		
		//페이지 메뉴 그리는 메서드 
		String pageMenu = Page.getPaging("board_list", nowPage, rowTotal, Board.BLOCKLIST, Board.BLOCKPAGE);
		
		request.getSession().removeAttribute("show");
		
		model.addAttribute("list", list);
		model.addAttribute("pageMenu", pageMenu);
		
		return Common.VIEW_PATH+"board_list.jsp?page="+nowPage;
	}
	
	//상세페이지
	@RequestMapping("view")
	public String board_view(Model model,int idx, @RequestParam(required=false, defaultValue="1") int page) {
		
		BoardVO boardVO = boardDAO.selectPost(idx);
		
		//조회수 증가 
		HttpSession session = request.getSession();
		String show = (String)session.getAttribute("show");
		
		if(show == null) {
			int res = boardDAO.update_readhit(idx);
			session.setAttribute("show", "1");
		}
		
		model.addAttribute("vo", boardVO);
		
		return Common.VIEW_PATH+"board_view.jsp";
	}
	
	
	//게시물 등록
	//스프링은 jsp에서 jsp로 가는것이 불가능하다.
	//insert_form -> BoardController -> DAO -> DB(insert)
	@RequestMapping("insert_form")
	public String insert_form(@RequestParam(required=false, defaultValue = "1")int page) {
		
		MemberVO vo = (MemberVO)session.getAttribute("id");
		if(vo == null) {
			return Common.MEMBER_PATH+"login_form.jsp";
		}
		
		return Common.VIEW_PATH+"insert_form.jsp?page="+page;
	}
	
	@RequestMapping("insert.do")
	public String insert(BoardVO vo) {
		String ip = request.getRemoteAddr();
		
		vo.setIp(ip);
		
		int res = boardDAO.insert(vo);
		
		if (res > 0) {
			return "redirect:board_list"; //board_list를 가진 mapping으로 간다 
		}
		return null;
		
	}
	
	//게시물 삭제
	@RequestMapping("del")
	@ResponseBody
	public HashMap<String, String> del(BoardVO vo) {
		System.out.println(vo);
		vo.setName("unknown");
		vo.setSubject("삭제된 글입니다.");
		
		
		int rs = boardDAO.delete(vo);
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		
		if(rs > 0) {
			map.put("param", "yes");
			return map;
		}else {
			map.put("param", "no");
			return map;
		}
	}
	
	//게시물에 답글 달기
	@RequestMapping("reply_form")
	public String reply_form(int idx, int page){
		return Common.VIEW_PATH+"reply_form.jsp?idx="+idx+"&page="+page;
	}
	@RequestMapping("reply")
	public String reply(BoardVO vo, int idx, int page) {
		String ip = request.getRemoteAddr();
		
		//idx를 가지고 게시글 한 건 
		BoardVO base_vo = boardDAO.selectPost(idx);
		
		//기준글에 step값 보다 큰애들 증가 
		int res = boardDAO.update_step(base_vo);
		
		vo.setIp(ip);
		
		//답글이 들어갈 위치 선정 
		vo.setRef(base_vo.getRef());
		vo.setStep(base_vo.getStep()+1);
		vo.setDepth(base_vo.getDepth()+1);
		
		res = boardDAO.reply(vo);
		
		if(res > 0) {
			return "redirect:board_list?page="+page;
		}
		return null;
	}
	

	
}
