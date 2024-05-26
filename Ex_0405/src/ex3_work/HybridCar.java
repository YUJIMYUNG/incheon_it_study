package ex3_work;

public class HybridCar extends Car {//car클래스를 부모로한다.
	
	int electicGauge;
	
	
	public HybridCar(int gasGauge, int electicGauge) {
		super(gasGauge);
		this.electicGauge = electicGauge;
		
	}
	
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("전기량 : " + electicGauge);
	}
	
	
	
	
}
