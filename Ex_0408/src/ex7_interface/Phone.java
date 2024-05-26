package ex7_interface;

public interface Phone {
	//인터페이스에는 상수(바뀔 수 없는 수 ) 와 추상메서드만 가질 수 있다.
	
	//public static final int MAX_BATTERY_CAPACITY = 100;//상수
	public static int MAX_BATTERY_CAPACITY = 100;
	
	
	//인터페이스에서는 어차피 상수, 추상메서드만 들어간다는걸 알기때문에 
	//final 과 abstract 를 생략할 수 있다.
	
	//abstract void powerOn();//추상메서드 
	// ==  void powerOn();
	
	
	void powerOn();
	void powerOff();
	boolean isOn();
	void watchUtube();
	void charge();
	
}
