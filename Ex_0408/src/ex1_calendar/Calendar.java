package ex1_calendar;

public class Calendar {
	String color;
	int months;
	
	//각각의 필드를 생성자를 통해 초기화
	public Calendar(String color, int months) {
		this.color = color; //각각의 필드 매개변수를 통해 값을 받고 초기화하는 단
		this.months = months;
		
	}
	
	
	//메서드-몇월까지 있는
	public void info() {//메서드  
		System.out.println(color + "달력은  " + months + "월까지 있습니다.");
	}
	
	//메서드-걸 수있는지  
	public void hanging() {//메서드 
		System.out.println(color + "달력을 벽에 걸 수 있습니다.  ");
	}


	
}
