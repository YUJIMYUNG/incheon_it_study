package ex3_object;

public class CarMain {
	public static void main(String[] args) {
		
		Car car = new Car("소나타", "현대 ");
		
		System.out.println(car);//toString()이 생략 되어있는 것 
		System.out.println(car.toString());//객체입력하면 주소값 출력 
								// ex3_object.Car@7dc36524 골뱅이 기준 앞에는 어떤 타입인지, 골뱅이 뒤는 주소값 
		
		//부모클래스의 메서드 오버라이딩하고 나면 동적바인딩 영향으로 메서드 오버라이딩 먼저 호출이 됨 
		
	}
}
