package ex1_calendar;

public class CalendarMain {

	
	public static void main(String[] args) {
		
		DestCalendar dc = new DestCalendar("보라색 ", 6);
		dc.info();// 오버라이딩 된 메서드 호출 
		dc.hanging();
		dc.oneTheDesk();
		System.out.println("----------------------");
		
		//자동타입변환 (부모타입으로 이루어짐)   
		Calendar c = new DestCalendar("검은색 ", 12);
		
		c.info();//부모클래스에 있는 메서드
		c.hanging();//오버라이딩 된 메서드가 호출
		//c.onTheDesk(); 	자식클래스에 선언된 메서드는 사용 불가능
		
		
		
	}
}
