package ex1_book;

public class Book {
	String title = "제목 없음";
	int series = 1;
	int page = 100;
	
	public Book() {//기본생성자 정의  
		// TODO Auto-generated constructor stub
	}
	//	매개변수의 개수가 다른경우 
	public Book(String t) {
		title = t;
		
	}
	
	public Book(String  t, int p) {
		title = t;
		page = p;
		
	}
	
	//매개변수의 개수가 같지만 순서가 다른 경우 
	public Book(int s, String t) {
		series = s;
		title = t;
	}
	
	
	public void bookInfo() {
		System.out.println("title : " + title);
		System.out.println("series : " + series);
		System.out.println("page : " + page);
		System.out.println("-----------------------------------------------");
	}
	
}
