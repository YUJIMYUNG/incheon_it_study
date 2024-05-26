package ex2_inner_class;

public class LocalClassExample {
	private int speed = 10;
	
	public void getCar(String carName) {//소나타가 이쪽으로 전달 
		//carName = carName + "차";----> 내부에서 선언할때 내용 변경 불가능  
		class Car{
			public void move() {
				System.out.println(carName + "이 " + speed + "속도로 달립니다. ");
			}
		}
		Car car  = new Car(); //move를 사용하기 위해서 객체생성 
		car.move();
	}
	
	public static void main(String[] args) {
		LocalClassExample local = new LocalClassExample();
		local.getCar("소나타 ");
	}
}
