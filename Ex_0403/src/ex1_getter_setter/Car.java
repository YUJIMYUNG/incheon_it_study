package ex1_getter_setter;

public class Car {
	private int speed;//접근제한자 부여    
	private boolean stop; //접근제한자부여  
	
	//getter & setter
	//객체 지향 프로그래밍에서 객체의 데이터는 객체 외부에서 직접적으로 접근하는것을 막는걸 기본으로 한다.
	//외부에서 읽고 변경 시 객체의 무결성이 깨질 수 있기 때문이다.
	//따라서 메서드를 통해 데이터를 변경하거나 조회하는것을 선호한다.
	//데이터는 외부에서 접근하지 않도록 막고, 메서드는 공개해서 외부에서 메서드를 통해 데이터에 접근하도록 유도한다.
	
	//setter
	//외부에서 메서드를 통해 데이터에 접근하고 검증할 수 있도록 유도하는 메서드를 의미한다.
	//set필드명을 메서드명으로 사용한다.(camel표기법 사용 많이함)
	
	public void setSpeed(int s) {
		if(s < 0) {
			speed = 0;
			return;
		}else {
			speed = s;
		}
	}
	
	//getter
	//private 필드를 외부에서 값을 불러오기 위해 구현하는 메서드
	//private 필드는 외부에서 접근이 불가능하지만, 필드가 선언된 클래스에성는 어디서든 접근이 가능하다.
	//따라서 메서드로 전달해서 외부로 값을 꺼낼 수 있다.	
	//get필드명을 메서드이름으로 사용한다.
	
	public int getSpeed() {
		return speed;
	}
	
	public void setStop(boolean s) {
		stop = s;
		speed = 0;
	}
	
	public boolean getStop() {
		return stop;
	}
	
	public boolean isStop() {
		return stop;
	}
	
	
}
