package ex1_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

//finally : 예외 발생 유무와 상관 없이 실행되는 구문이며 생략할 수 있다.
//예외처리를 할 때, 예외와 상관없이 반드시 처리해야 하는 구문들을 작성할 때 사용된다.
//보통 외부 연동이나 예외가 발생해도 정상 종료되어야 할 구문들에서 발생한다.

public class Ex3_finally {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
	
		try {
		
			
			if(score >= 60) {
				System.out.println("합격입니다. ");
			}else {
				System.out.println("불합격입니다. ");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("키보드의 입력이 올바르지 않습니다. ");
		} finally {
			System.out.println("파이널리 실행 ");
		}
		
		System.out.println("프로그램 종료 ");
	}	
}

