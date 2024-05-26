package ex2_work;

import java.util.Scanner;

//CarTest클래스를 생성하고 getResult()라는 메서드를 정의한다

//main에서 두개의 숫자와 산술연산자를 키보드에서 받은뒤
//getResult()메서드를 통해 연산을 한 결과를 출력하기

//출력은 main에서 한다.

public class CalMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CalTest ct = new CalTest();
		
//		System.out.print("첫번째 수를 입력하세요 : ");
//		cal.setSu1 = System.in;
//		
//		System.out.println();
		
		System.out.print("첫번째 수를 입력하세요.");
		int n1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요.");
		int n2 = sc.nextInt();
		
		System.out.print("연산를 입력하세요.");
		String str = sc.next();
		
		
		
		ct.getResult(n1, n2, str);
		
		int result = ct.getResult(n1, n2, str);
		
		System.out.println("결과 : "+result);
		
		
		
	}
}
