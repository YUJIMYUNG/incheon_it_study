package com.korea.board;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.MemberDAO;
import lombok.RequiredArgsConstructor;
import util.Common;
import vo.MemberVO;

@Controller
@RequiredArgsConstructor
public class MemberController {

	final MemberDAO memberDAO;
	
	@Autowired
	HttpSession session;
	
	//로그인페이지
	@RequestMapping("login_form")
	public String login_form() {
		return Common.MEMBER_PATH+"login_form.jsp";
	}
	
	@RequestMapping("login")
	@ResponseBody
	public String login(String id, String pwd) {
		MemberVO vo = memberDAO.loginCheck(id);
		
		if(vo == null || vo.getPwd().equals(pwd)) {
			return "{\"param\":\"no\"}";
		}
		
		//아이디와 비밀번호에 문제가 없다면 세션에 바인딩한다. 
		session.getMaxInactiveInterval();//세션이1시간 단위로 유
		session.setAttribute("id", vo);
		
		return "{\"param\":\"yes\"}";
	}
	
	//로그아웃페이지
	@RequestMapping("logout")
	public String logout() {
		//세션에서 제거 후 board_list로 돌아간다. 
		session.removeAttribute("id");
		return "redirect:board_list";
	}
	
	
	@RequestMapping("register_form")
	public String register_form() {
		return Common.MEMBER_PATH+"register_form.jsp";
	}
	
	@RequestMapping("member_insert")
	public String member_insert(MemberVO vo) {
		int res = memberDAO.insert(vo);
		if(res > 0) {
			return "redirect:board_list";
		}
		return null;
	}
}
