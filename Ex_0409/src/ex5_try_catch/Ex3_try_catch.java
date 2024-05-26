package ex5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3_try_catch {
	public static void main(String[] args) {
		//정수 : 100
		//결과 : 100
		
		//정수 : aab
		//결과 : aab은(는) 정수가 아닙니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		try {
			System.out.println("정수 : " + num1);
			System.out.println("결과  : "+ num1 );
		
			
		} catch (InputMismatchException e) {
			System.out.println("정수 : " + num1);
			System.out.println( num1 + "은(는) 정수가 아닙니다.");
		}
	}
}
