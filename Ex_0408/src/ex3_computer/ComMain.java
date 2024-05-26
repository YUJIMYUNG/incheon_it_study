package ex3_computer;

public class ComMain {
	public static void main(String[] args) {
		
		
		ComputerRoom cr = new ComputerRoom();
		
		
		
		cr.com1 = new LG(); //부모타입으로 변환이 모두 가능하다. 다향성 --> samsung, mac 필요한 클래스를 불러서 사용할 수 있음. 수정 부분 최소화 
		cr.com2 = new LG();
		cr.com3 = new Samsung();
		cr.com4 = new Mac();
		
		
		cr.allPowerOn();
		cr.allPowerOff();
	}
}
