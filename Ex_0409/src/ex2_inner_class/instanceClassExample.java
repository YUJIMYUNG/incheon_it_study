package ex2_inner_class;

class Calculator{
	private int val1;//프로그램에서 가능한 멤버에 직접 접근하게 두지않는다. 
	private int val2;
	
	public Calculator(int val1,int val2) {//초기화 
		this.val1 = val1;
		this.val2 = val2;
	}
	//인스턴스 클래스 
	public class Calc{
		public int add() { //메서드 정의 
			return val1 + val2;
		}
	}
	
	
}

public class instanceClassExample { //public은 클래스 당 하나를 붙일 수 있따. 
	public static void main(String[] args) {
		//객체 지향 프로그래밍(OOP - Object Oriented Programming) 
		//객체를 통해서 데이터를 처리
		
		Calculator cal =  new Calculator(10, 11);
		
		//인스턴스 클래스의 객체(인스턴스)화 
		//Outer out = new Outer(); 
		//Outer.Inner 변수명 = outer.new Inner();
		
		//바깥 패키지 안에서 해당 클래스를 볼 수 없다는 장점이 있다. 
		Calculator.Calc c = cal.new Calc();
		
		System.out.println("합 : " + c.add() );
	}
}
