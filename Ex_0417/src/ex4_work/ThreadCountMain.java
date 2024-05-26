package ex4_work;

import java.util.Scanner;

//스캐너를 이용하여 키보드에서 숫자를 입력받고
//스레드에서 입력받은 숫자부터 1씩 감소하다 0이 되었을 때
//"종료"라는 메세지와 함께 스레드를 빠져나오도록 만들어보자. 

class Threadminus extends Thread{
	
	private int num;
	
	public Threadminus(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		
		for(int i = num; i >= 0; i--) {
			try {
				System.out.println(i);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		
		
	}
}

public class ThreadCountMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		//하나의 클래스에서 다른 클래스로 데이터를 가져가는 법
		//1. 생성자의 파라미터로 전달 
		//2. 메서드의 파라미터로 전달 
		
		Threadminus tm = new Threadminus(sc.nextInt());
		tm.start();
		
		
	}
}
