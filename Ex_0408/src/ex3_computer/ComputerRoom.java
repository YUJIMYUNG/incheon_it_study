package ex3_computer;

public class ComputerRoom {
	//Samsung com1;
	//Samsung com2;
	
	
	Computer com1;
	Computer com2;
	Computer com3;
	Computer com4;
	
	public void allPowerOn() {
		com1.powerOn(); //메서드 안에서 메서드 호출 -> allPowerOn만 호출하면 그 안에 메서드를 모두 호출할 수 있어서편리함 
		com2.powerOn();
		com3.powerOn();
		com4.powerOn();
	}
	
	public void allPowerOff() {
		com1.powerOff();
		com2.powerOff();
		com3.powerOff();
		com4.powerOff();
	}
}
