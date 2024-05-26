package ex6_abstract;

public class AbsMain {
	public static void main(String[] args) {
		
		//추상클래스는 객체를 직접 생성할 수 없다.
		//AbsParent ap = new AbsParent();
		
		//자식클래스를 통해서 객체 생성 
		AbsCild ac = new AbsCild();
		ac.setValue(20);
		System.out.println(ac.getValue());
	}
}
