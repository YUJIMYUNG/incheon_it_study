package ex1_calendar;

public class DestCalendar extends Calendar{
	public DestCalendar(String color, int months) {//생성자 만들기 
		super(color, months);//부모한테 전달하는 키워드 super   
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
	}
	
	@Override
	public void hanging() { //메서드 생성 
		// TODO Auto-generated method stub
		System.out.println(color + "달력을 벽에 걸기 위해 고리가 추가로 필요합니다.");
	}
	
	
	public void oneTheDesk() { // 메서드 생성 
		System.out.println("책상에 세울 수 있습니다.");
	}
}
