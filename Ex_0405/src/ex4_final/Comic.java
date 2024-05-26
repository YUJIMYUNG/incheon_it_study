package ex4_final;

public class Comic extends Book{
	boolean isColor;
	
	public Comic(String title, String author, boolean isColor) {
		super(title,author);
		this.isColor = isColor;
	}
	
	
	//info_title(){//오버라이딩 불가능 Book에서 final이 선언되어있어서.
	//	
	//}
	
	@Override
	public void info_author() {
		// TODO Auto-generated method stub
		System.out.println("이 만화책의 저자는 "+ super.getAuthor());
	}
	
	public void info_color() {
		if(isColor) {
			System.out.println("이 만화책은 컬러입니다. ");
		}else {
			System.out.println("이 만화책은 흑백입니다. ");
		}
	}
	
	
	
	
	
}
