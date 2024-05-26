package ex2_Thread;




public class Ex2_Thread {
	public static void main(String[] args) {
		//Runnable인터페이스를 람다식을 통해 구현하기 
		Runnable run = () -> {
			for(int i = 1 ; i <=10 ; i++) {
				System.out.println("람다식 구현 : " +i );
			}
		};
		
		
		Thread t = new Thread(run);
		t.start();
		
		for(int i = 1 ; i <=10 ; i++) {
			System.out.println("main 함수 : " +i );
		}
		
		//순차적으로 실행 되지 않고 동시처럼 보이게 실행 (독립적으로 실행) 
		//멀티태스킹 
		
	}
}
