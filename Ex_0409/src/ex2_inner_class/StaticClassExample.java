package ex2_inner_class;

class PrintOut{
	public static class Out{
		
		private int val1; //	일반멤버 
		private static int val2 = 1; //클래스 변수 
		
		
		
		
		
		
		public void println(String str) {
			System.out.println(str);
			System.out.println(val1);//일반 멤버는 사용 불가능
			System.out.println(val2); // 클래스변수는 사용가능 
		}
	}
}

public class StaticClassExample {
	public static void main(String[] args) {
		//정적 내부클래스는 외부 클래스 객체 생성을 하지 않고 객체화 할 수 있다.
		String str = "정적 내부 클래스 테스트 ";
		PrintOut.Out out = new PrintOut.Out();
		out.println(str);
		
	}
}
