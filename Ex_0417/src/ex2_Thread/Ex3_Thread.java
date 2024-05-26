package ex2_Thread;


class ThreadInfo extends Thread{
	@Override
	public void run() {
		this.setName("ThreadInfo");
		System.out.println("현재 실행되고 있는 스레드의 이름 : " + Thread.currentThread().getName());
		System.out.println("현재 실행되고 있는 스레드의 상태  : " + Thread.currentThread().getState());
		System.out.println("현재 실행되고 있는 스레드의 우선순위 : " + Thread.currentThread().getPriority());
		
	}
}
public class Ex3_Thread {
	public static void main(String[] args) {
		ThreadInfo ti = new ThreadInfo();
		ti.start();
		
		System.out.println("현재 실행되고 있는 스레드의 이름 : " + Thread.currentThread().getName());
		System.out.println("현재 실행되고 있는 스레드의 상태  : " + Thread.currentThread().getState());
		System.out.println("현재 실행되고 있는 스레드의 우선순위 : " + Thread.currentThread().getPriority());
		//우선순위는 1~10 이며 5가defalt값임 (1낮음, 10높음) 
		
		
		
	}

}
