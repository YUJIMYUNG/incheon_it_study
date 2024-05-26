package ex4_phone;

public class PhoneMain {
	public static void main(String[] args) {
		Phone p1 = new Phone("갤럭시", 24, "흰색 ");
		Phone p2 = new Phone("아이폰", 15);//기본값을 주고싶어도 데이터는 전달해야된다.
		
		//생성자에 전달할 매개변수가 부족하면, 객체를 생성할 수 없다.
		//선언된 생성자의 형태에 맞게 매개변수를 전달해줘야 하기 때문이다.
		//클래스 내부에 선언된 필드의 기본값을 사용하고 싶다면 매개변수가 부족하다고 생성하지 못할 이유가 없어야한다.
		
		//자바는 메서드를 여러개 선언하는 것을 허용하고 있다.
		
		
		p1.phoneInfo();
		p2.phoneInfo();
		
		
	}
}
