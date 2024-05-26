package ex4_work;

import java.util.Random;
import java.util.Scanner;

//QuizThread클래스를 만든다. 
//startGame()메서드를 만들고 1~100 사이 난수를 두개 뽑아
//더하여 맞추는 문제를 출제
//카보드에서 답을 입력하여 5문제가 정답이 될 때까자ㅣ 로직을 반복한다. 
//정답을 맞추고 난 후 모든 문제를 맞추는데 몇초가 걸렸는지 화면에 출력하며 프로그램 종료


class QuizThread extends Thread{
	
	int su1, su2;
	int timer = 0;
	int playCount =0;
	boolean isCheck = true;
	final int FINISH = 5;
	
	public void startGame() {
		Scanner sc = new Scanner(System.in);
		while(isCheck) {
			try {
				su1 = new Random().nextInt(100)+1;
				su2 = new Random().nextInt(100)+1;
				System.out.print(su1+ " + " + su2 +"=" );
				int result = sc.nextInt();
				
				if(result == (su1 + su2)) {
					System.out.println("정답 ");
				}else {
					System.out.println("오답 ");
					continue;
				}
				playCount++;
				
				if(playCount == FINISH) {
					System.out.println("결과 : " + timer + "초... ");
					isCheck = false;
				}
				
			} catch (Exception e) {
				System.out.println("정답은 정수로 입력하세요. ");
				
			}
		}
	}
	
	@Override
	public void run() {
		while(isCheck) {
			try {
				Thread.sleep(1000);
				timer++;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
	
	
}

public class QuizMain {
	public static void main(String[] args) {
		QuizThread qt = new QuizThread();
		qt.start();
		qt.startGame();
		
	}
}
