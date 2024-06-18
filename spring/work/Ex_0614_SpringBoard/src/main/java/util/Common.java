package util;

public class Common {

	public static final String VIEW_PATH = "/WEB-INF/views/board/";
	public static final String MEMBER_PATH = "/WEB-INF/views/member/";
	
	
	
	
	//게시판마다 보여지는 게시글의 개수와 페이지의 개수가 다를 수 있다.
	
	public static class Board{
		//한 페이지에 보여줄 게시물 수
		public final static int BLOCKLIST = 10;
		
		//페이지 메뉴 개수
		// <- 1 2 3 ->
		public final static int BLOCKPAGE = 3;
	}
	
	public static class Notice{
		//한 페이지에 보여줄 게시물 수
		public final static int BLOCKLIST = 5;
		
		//페이지 메뉴 개수
		// <- 1 2 3 ->
		public final static int BLOCKPAGE = 5;
	}
	
	
	
	
	
	
	
	
	
}
