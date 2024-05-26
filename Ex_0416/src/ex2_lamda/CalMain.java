package ex2_lamda;

public class CalMain {
	public static void main(String[] args) {
		
		//클래스를 직접 생성하고 구현하여 기능 만들기 
		MyCalculator cal1 = new Calculator();
		int res = cal1.plus(10, 20);
		
		System.out.println("cal1 : " +res);
		
		
		//익명 클래스를 통한 구현 
		MyCalculator cal2 = new MyCalculator() {
			@Override
			public int plus(int num1, int num2) {
				return num1 + num2;
			}
		};
		res = cal2.plus(10, 20);
		
		System.out.println("cal2 :" + res);
		
		//람다식을 통한 구현
		MyCalculator cal3 = (num1, num2)->num1 +num2;
		
		res = cal3.plus(10,20);
		System.out.println("cal3 : " + res );
		
		//::(이중콜론) : 메서드 참조 연산자 
		//람다식을 보다 간결하게 사용할 수 있도록 해준다. 
		MyFunction mf = System.out::println;
		mf.method(5);
		
		
	}
	
	

}
