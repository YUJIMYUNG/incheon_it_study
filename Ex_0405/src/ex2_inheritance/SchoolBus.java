package ex2_inheritance;

public class SchoolBus extends Bus {
	public SchoolBus(int peopleNum) {
		super(peopleNum);
	}
	
	//부모의 메서드 오버라이
	@Override
	public void takePerson() {
		// TODO Auto-generated method stub
		super.takePerson();//부모클래스의 메서드 호출
		System.out.println("학생들이 자리에 모두 착석하고 출발합니다.");
		
		
	}
	
	//조상의 메서드 오버라이딩도 가능
	@Override
	public void ride() {
		System.out.println("시속 50km/h로 천천히 달립니다.");
	}
	
}
