package ex2_work;

import java.util.Scanner;

public class StartMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Start start = new Start();
		
		while(true) {
			System.out.print("정수를 입력하세요 :");
			int answer = sc.nextInt();
			
			
			start.check(answer);
			
			if(start.rnum == answer) {
				break;
			}
		}
		
		
		
		
	
		
		
	}
}
