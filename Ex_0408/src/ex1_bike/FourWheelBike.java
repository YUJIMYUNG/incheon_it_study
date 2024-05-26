package ex1_bike;

public class FourWheelBike extends Bike{
	
	public FourWheelBike(String riderName) { //riderName받아와서 super로 부모클래스에 보내
		super(riderName);
	}
	
	
	@Override
	public void info() { //info오버라이드 
		
		super.info();
	}
	
	public void addWheel() {
		if(wheel == 2) {
			wheel = 4;
			System.out.println(riderName + "의 자전거에 보조바퀴를 부착하였습니다.");
		}else {
			System.out.println(riderName + "의 자전거에 이미 보조 바퀴가 부착되어 있습니다.");
		}
	}
}
