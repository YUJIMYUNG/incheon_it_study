package action;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import dao.BoardDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.Page;
import util.Common.Board;
import vo.BoardVO;

@WebServlet("/board_list")
public class BoardListAction extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int nowPage = 1;
		//start등부터 end등까지만 조회해라 
		String page = request.getParameter("page");
		
		if(page != null && !page.isEmpty()) {
			nowPage = Integer.parseInt(page);
		}
		
		//page가 1이면 등수 1~10까지 조회 
		//page가 2이면 등수 11~20까지 조회 되어야 함 
		int start = (nowPage -1) * Board.BLOCKLIST+1;
		int end = start + Board.BLOCKLIST -1;
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("start", start);
		map.put("end", end);
		
		
		//전체 목록 가져오기
		List<BoardVO> list = BoardDAO.getInstance().selectList(map);
		
		//전체 게시물 수 조회 
		int rowTotal = BoardDAO.getInstance().getRowTotal();
		
		//페이지 메뉴 생성하기 
		String pageMenu = Page.getPaging("board_list", nowPage, rowTotal, Board.BLOCKLIST, Board.BLOCKPAGE);
		
		request.getSession().removeAttribute("show");
		
		request.setAttribute("list", list);
		request.setAttribute("pageMenu", pageMenu);
		
		RequestDispatcher disp = request.getRequestDispatcher("board_list.jsp");
		disp.forward(request, response);
	}
	
}








