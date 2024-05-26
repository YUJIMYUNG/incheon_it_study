package ex7_interface;

public class Person {
	Phone p; //어떤 폰을 갖고있을지 모르니 매개체 역할을 할 수 있는p 를 생
	
	public Person(Phone p){
		this.p = p;
	}
	
	public void turnOnPhone() {
		p.powerOn();
	}
	
	public void turnOffPhone() {
		p.powerOff();
	}
	
	public void watchUtube() {
		if(p.isOn()) {
			p.watchUtube();
			
		}else {
			System.out.println("폰이 꺼져있기 때문에 유튜브를 볼 수 없습니다. ");
		}
		
	}
	
	
	public void chargePhone() {
		p.charge();
	}
	
	public void buyNewPhone(Phone p) {
		this.p = p;
		System.out.println(" = = = = = = = = = = ");
		System.out.println("새 폰을 샀습니다. ");
	}
}
