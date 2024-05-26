package ex3_anonymous_class;

//버튼, 클릭 메서드가 정해져있음

interface buttonClickListener{
	public void click();
}

public class ButtomExample {
	public class Button{//버튼에 대해서 정의 
		private buttonClickListener listener;
		
		public void setListener(buttonClickListener listener) {
			this.listener = listener;
		}
		
		//버튼 클릭 기능
		public void click() {
			if(listener != null) {
				//인터페이스를 구현한 클래스에 오버라이딩 된 메서드를 호출 하겠다는 의미
				this.listener.click();
			}
		}
	}
	
	
	public static void main(String[] args) {
		ButtomExample exam = new ButtomExample();
		
		//버튼 객체 
		ButtomExample.Button button = exam.new Button();
		
		//{내용};  -> 버튼의 기능 , 익명클래스이기때문에 다른 곳에서 사용할 수 없음.
		button.setListener(new buttonClickListener() {
			@Override
			public void click() {
				// TODO Auto-generated method stub
				System.out.println("버튼을 눌렀습니다. ");
			}
		});
		
		button.click();
	}
}
