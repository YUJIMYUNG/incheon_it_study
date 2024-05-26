package ex7_interface;

public class PhoneMain {
	public static void main(String[] args) {
		Person jimin = new Person(new ApplePhone());
		
		jimin.turnOnPhone();
		
		
		for(int i = 1; i < 6; i++) {
			jimin.watchUtube();//5번 호
			
			if(i % 3 == 0) {
				jimin.chargePhone();
			}
		}
		
		jimin.buyNewPhone(new SamsungPhone());
		
		jimin.turnOnPhone();
		
		for(int i = 1; i < 6; i++) {
			jimin.watchUtube();//5번 호출 
			
			if(i % 3 == 0) {
				jimin.chargePhone();
			}
		}
		
		//인터페이스의 장점
		//정보은닉 : 실제 구현 클래스들의 내용을 전혀 보지 않고도 개발 코드로 객체를 사용할 수 있다.
		//모듈화 : 구현 클래스들이 독립적으로 구현되고 사용될 수 있다.
		//개발 코드에서 객체 변경이 필요할 때, 개발코드의 수정을 최소화 할 수 있다.
		
		
		
		
		
	}
}
