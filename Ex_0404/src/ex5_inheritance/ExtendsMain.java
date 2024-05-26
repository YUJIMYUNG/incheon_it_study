package ex5_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		Child c1 = new Child();
		
		System.out.println(c1.car);
		System.out.println(c1.money);
		System.out.println(c1.str);
		
		
		Parent p1 = new Parent();
		System.out.println(p1.money);
		System.out.println(p1.str);
		//상속관계라고 할지라도 부모클래스는 자식의 재산을 마음대로 가져다 사용할 수 없다.
		//System.out.println(p1.car);//자식 클래스의 내용은 쓸 수 없다. 
		
		
		//상속의 특징
		//하나의 자식 클래스가 여러개의 부모클래스를 상속받는것이 불가능하다.
		//모든 클래스는 object라는 클래스를상속받고 있다.
		//ocject는 모든 타입을 받을 수 있는 최상위 객체이다.
	}
}
