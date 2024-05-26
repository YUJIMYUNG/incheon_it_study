package ex1_bike;

public class Bike {
	String riderName;
	int wheel = 2;
	
	public Bike(String riderName) {//기본생성자 만들기 
		this.riderName = riderName;
		
	}
	
	public void info() { //메서드 생성 
		System.out.println(riderName +"의 자전거는 " + wheel + "발 자전거 입니다. ");
	}
	
	public void ride() { // 메서드 생성 
		System.out.println("씽씽 ");
	}
	
	
	
	
	
	
}
