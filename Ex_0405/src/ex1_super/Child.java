package ex1_super;

public class Child extends Parent{
	public Child(int n) {
		//super();//부모클래스의 생성자 호출, 생략 가능 
		//부모의생성자가 매개변수를 갖는 순간자식의 생성자에서 super()를 생략하는것은 불가능하다.
		super(n);
		System.out.println("Child 클래스의 생성자 호출 ");
		
	}
	@Override
	public int getN() {
		return super.getN(); //Parent.getN();
	}
}
