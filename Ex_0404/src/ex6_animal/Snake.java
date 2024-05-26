package ex6_animal;

public class Snake extends Animal{
	
	
	String sensor = " 감각이 좋다. ";
	
	
	//메서드의 오버라이딩 
	//메서드의 재정의 
	//상속관계의 객체에서 부모의 메서드를 가져와 사용하되 이름, 매개변수는 놔두고 내용만 자식의 상황에 맞게 재정의해야한다.\
	
	@Override
	public int getLeg() {
		// TODO Auto-generated method stub
		return 0;
	}
}
