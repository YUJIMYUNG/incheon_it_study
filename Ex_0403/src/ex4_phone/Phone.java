package ex4_phone;

public class Phone {
	String brand;
	int series;
	String color = "검정색"; //기본값 설정
	
	public Phone(String b, int s) {
		brand = b;
		series = s;
	}
	
	public Phone(String b, int s, String c) {
		brand = b;
		series = s;
		color = c;
	}
	
	
	//오버로딩(overloading)
	//메서드의 재정의
	//하나의 메서드명으로 여러 기능을 구현할 수 있다.
	
	//오버로딩 조건
	//메서드의 이름은 같아야한다.
	//매개변수의 개수가 달라야한다.
	//개수가 같아도 타입이 달라야한다.
	//개수가 같아도 순서가 달라야한다.
	
	
	
	
	public void phoneInfo() {
		System.out.println(color + "" + brand+" " +series);
	}
}
