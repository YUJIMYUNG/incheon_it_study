package action;

import java.io.IOException;

import dao.BoardDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.BoardVO;

@WebServlet("/reply")
public class BoardReplyAction extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//파라미터 받기
		int idx = Integer.parseInt(request.getParameter("idx"));//기준글의 idx
		String name = request.getParameter("name");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		String pwd = request.getParameter("pwd");
		String ip = request.getRemoteAddr();
		
		BoardDAO dao = BoardDAO.getInstance();
		
		//기준글의 idx를 이용해서 기준글의 정보를 먼저 가져온다.
		BoardVO base_vo = dao.selectOne(idx);
		
		//같은 ref를 갖고 있는 게시글 중 내가 추가하려고 하는 step보다 큰
		//게시글의 step을 +1을 먼저 한다.
		//id : board_update_step
		int res = dao.update_step(base_vo);
		System.out.println("step 수정됨 : " + res);
		
		//나머지 파라미터를 새로운 vo객체에 setting한다.
		//ref,step,depth를 결정한다.
		BoardVO vo = new BoardVO();
		
		vo.setName(name);
		vo.setSubject(subject);
		vo.setContent(content);
		vo.setPwd(pwd);
		vo.setIp(ip);
		
		vo.setRef(base_vo.getRef());
		vo.setStep(base_vo.getStep()+1);
		vo.setDepth(base_vo.getDepth()+1);
		
		//답글 등록(insert)
		res = dao.reply(vo);
		
		
		
		
		
	}
}
