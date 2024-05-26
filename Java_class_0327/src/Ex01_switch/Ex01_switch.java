package Ex01_switch;

import java.util.Scanner;

public class Ex01_switch {
	
	public static void main(String[] args) {
		
		//1. 키보드로 두 수의 값 받아온다.
		//2. 키보드로 연산자를 받아온다.
		//3. 받은 두 수와 연산자를 통해 값의 결과가 나오도록 출력한다.
		
		//수1 :2
		//수2 :5
		//연산자 : +
		
		//결과값 : 2 + 5 = 7
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요. :");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수를 입력하세요. :");
		int num2 = scan.nextInt();
		System.out.print("연산자를 입력하세요. : ");
		String operator = scan.next();
		
		switch(operator) {
		case "+":
			System.out.printf("%d + %d = %d\n",num1, num2, num1+num2);
			break;
		case "-":
			System.out.printf("%d - %d = %d\n",num1, num2, num1-num2);
			break;
		case "*":
			System.out.printf("%d * %d = %d\n",num1, num2, num1*num2);
			break;
		case "/":
			System.out.printf("%d / %d = %d\n",num1, num2, num1/num2);
			break;
			
		}
		
		//변수 month에 정수를 하나 입력받고 해당 달이 몇일까지 있는지 switch문으로 작성하세요.
		// 단, break를 3번만 쓰세.
		
		
		System.out.print("1월~12월 중 하나를 입력하세요. : ");
		int month = scan.nextInt();
		
		//1월 3월 5월 7월 8월 10월 12월 : 31일
		//4월 6월 9월 11월 30일
		//2월 28일
		
		switch(month) {
		case 1:
		case 3:
		case 5: 
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.printf("%d월은 31일까지 있습니다.",month);
			break;
		case 2:
			System.out.printf("%d월은 28일까지 있습니다.",month);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.printf("%d월은 30일까지 있습니다.",month);
			break;
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
