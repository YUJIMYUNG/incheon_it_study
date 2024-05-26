package ex1_getter_setter;

public class CarMain {
 public static void main(String[] args) {
	 Car car = new Car();
	//car.speed = 50; //접근불가   
	 car.setSpeed(50);//car객체에 speed가 50으로 설정
	 System.out.println("현재속도 : "+ car.getSpeed());//접근 권한을 부여한 get메서드를 호출하여 출
	 
	 car.setSpeed(-50);//car객체에 speed가 50으로 설정
	 System.out.println("현재속도 : "+ car.getSpeed());
	 
	 //차를 멈추려고 한다.
	 //멈춰있지 않으면 멈춰
	 if(!car.isStop()) {//멈춰있지 않으면->!not연산
		 car.setStop(true);
	 }
	 
	 System.out.println("현재 속도 : " + car.getSpeed());
	 //car.setStop(0);
	 //System.out.println("현재 차량의 상태 : "+ car.getStop());
	 
 }
}
