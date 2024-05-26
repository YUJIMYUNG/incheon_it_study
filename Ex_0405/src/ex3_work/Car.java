package ex3_work;

public class Car {
	
	
	int gasGague;
	
	public Car(int gasGauge) {
		this.gasGague = gasGauge;
	}
	
	public void showCurrentGauge() {
		System.out.println("가스량 : " + gasGague);
	}
}
