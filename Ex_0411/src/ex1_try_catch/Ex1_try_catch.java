package ex1_try_catch;

import java.util.Scanner;

public class Ex1_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		
		String str = "";
		
		
		try {
			str = sc.next();//정수로 입력받으나, 문자열로 입력받으나 문제가 없다. 
			int num  = Integer.parseInt(str);///NumberFormatException
			System.out.println("결과 : " + num );
		} catch (NumberFormatException e) {
			System.out.println(str + "은(는) 정수가 아닙니다. ");
		}
	}
}
