package action;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class FileUploadAction
 */
@WebServlet("/upload.do")
public class FileUploadAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(javax.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//매핑으로 호출이 잘 된다면 아래의 출력물 실행 
		System.out.println("서블릿 접속됨");
		
		//post로 보냈을 때 한글이 깨지지 않게 하기 위한 인코딩
		request.setCharacterEncoding("utf-8");
		
		//파일 업로드 
		String path = "/upload2/";
		
		//현재 프로젝트에 대한 정보를 관리하는 클래스
		ServletContext application = request.getServletContext();
		
		String real_path = application.getRealPath(path);
		System.out.println(path);
		
		int max_size = 1024 * 1024 * 100; //	100mb
		
		//파일을 포함한 파라미터를 수신하기 위한 객체 
		MultipartRequest mr = new MultipartRequest(request,//request객체
													real_path, //경로 
													max_size, //최대크기
													"utf-8", //인코딩타입
													new DefaultFileRenamePolicy()); //중복된 파일명 변경
	
	
		String filename = "no_file";
	
		//업로드가 완료된 파일의 정보 얻어오기 
		File f = new File("photo");
	
		if(f != null) {
		filename = f.getName();
		}
		
		//파일 이외의 일반 파라미터
		String title = mr.getParameter("title");
	
		//파일명과 제목을 requestdp wjwkd 
		request.setAttribute("title", title);
		request.setAttribute("filename", filename);		
	
		//request영역에 바인딩 해놓은 정보를 다른 페이지에서 가져다가 사용할 수 있다. (포워딩)
		RequestDispatcher disp = request.getRequestDispatcher("result.jsp");
		disp.forward(request, response);
		
	}
}
