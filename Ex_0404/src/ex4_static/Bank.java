package ex4_static;

public class Bank {
	String name = "우리은행";	
	String point;
	String tel;
	static float interest = 10f;//static변수는 이태리체로 변함
	
	
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
		
	}
	
	public void printBank() {
		System.out.println("이름  : " +name);
		System.out.println("위치  : " +point);
		System.out.println("번호  : " +tel);
		System.out.println("이자율  : " +interest + "%");
		System.out.println("------------------------------------------------");
	}
	
}
