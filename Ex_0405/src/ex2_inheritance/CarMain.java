package ex2_inheritance;

public class CarMain {
	public static void main(String[] args) {
		SchoolBus sb = new SchoolBus(10);
		
		//학생이 버스에 탐
		sb.takePerson();
		//버스가 출발함
		sb.ride();
		
	}
}
