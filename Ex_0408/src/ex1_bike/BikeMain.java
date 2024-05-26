package ex1_bike;

public class BikeMain {
	public static void main(String[] args) {
		
		Bike b = new FourWheelBike("윤기");
		b.info();
		b.ride();
		//b.addWheel();   ->부모타입으로는 호출이 불가능하다. (addWheel메서드는 FourWheelBike)
		
		//1. 일시적 변환 
		((FourWheelBike)b).addWheel();
		
		
		//2. 변환하여 자식타입에 대입(다회성 ) 
		FourWheelBike fwb = (FourWheelBike)b;//자식클래스에 있는 모든 멤버를 사용할 수 있게됨 
		
		fwb.addWheel();
	}
}
