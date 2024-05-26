package ex7_interface;
//interface를 연결하는 키워드 -> implements
public class ApplePhone implements Phone{//클래스명에 마우스 올리고 클릭하면 자동으로 오버라이딩 가능 
	
	int batteryCapacity = 40;//기본값 지정 
	boolean isOn = false;//기본값지정 

	@Override
	public void powerOn() { 
		if(batteryCapacity > 30) { //배터리 용량이 30보다 크면 
			System.out.println("@@@Power On!!!@@@@"); //파워온 문구를  출력하고 
			isOn = true;// 전원을 켜기 
		}else {
			System.out.println("Low Battery ..... ");
		}
		
	}

	@Override
	public void powerOff() {
		System.out.println("@@@2Power off@@@@\n");
		isOn = false;
	}

	@Override
	public boolean isOn() {
		if(isOn)return true; //휴대폰이 켜져있다면 그대로두고 
		else return false; // 아니면 끄기 
	}

	@Override
	public void watchUtube() {
		if(batteryCapacity > 10) { //배터리 용량이 10보다 크면 
			System.out.println("-----watching Utube---------"); //유튜브 본다는 문구를 출력하고 
			batteryCapacity -= 10; //유튭을 보면 배터리가 10씩 감소하게끔 만든다 
			System.out.println("battery is ...." + batteryCapacity + "%\n"); //감소해서현재 배터리 문구 출력 
		}else {
			System.out.println("Low battery....");//10보다 작으면 배터리 부족 문구 출력 
			powerOff();
		}
		
	}

	@Override
	public void charge() {
		if(batteryCapacity < Phone.MAX_BATTERY_CAPACITY - 20) { //상수 사용가능 
			System.out.println("------ charging-----");
			batteryCapacity += 5;
			System.out.println("Charged.... " + batteryCapacity);
		}else {
			System.out.println("You don't have to charge...... ");
			System.out.println("It's enough ....."+ batteryCapacity + "%" );
		}
	}

}
