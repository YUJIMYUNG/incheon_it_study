package ex2_Thread;


//스레드의 생성과 실행
//자바에서 스레드를 생성하는 방법

//1. Thread클래스를 상속받는다. 
class ThreadTest extends Thread{
	@Override
	public void run() {
		//main과 별개로 동작하고자 하는 명령 
		for(int i = 1; i <= 10; i++) {
			System.out.println("Thread클래스 상속 : " + i );
		}
	}
}

//2. Runnable인터페이스를 구현한다. 
class RunnableTest implements Runnable{
	@Override
	public void run() {
		//main과 별개로 동작하고자 하는 명령 
		for(int i = 1; i <= 10; i++) {
			System.out.println("Runnable구현  : " + i );
		}
		
	}
}



public class Ex1_Thread  {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		tt.start();//run()메서드를 호출해주는 메서드 
		RunnableTest rt = new RunnableTest();
		Thread t1 = new Thread(rt);
		t1.start();//run()메서드를 호출해주는 메서드 , start()는 독립적으로 실행 
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("메인함수 실행중  : " + i );
		}
		
		
		
		
		
	}
}
