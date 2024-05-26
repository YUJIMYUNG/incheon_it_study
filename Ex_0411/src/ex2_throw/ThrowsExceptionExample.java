package ex2_throw;

import java.util.InputMismatchException;
import java.util.Scanner;

//예외 던지기
//메서드 내부에서 예외를 처리하지 않고, 해당 메서드를 호출한쪽에서
//예외를 처리하는 방법을 '예외 던지기'라고 한다.
//직접 처리하는 것보다 해당 메서드를 사용한 곳에서 처리하도록 하는 것이 효율적일 때가 있다.

//throws (예외를 다른 곳으로 보내려고 할 떄...?) 
//예외 던지기는 throws 키워드를 사용한다.
//메서드 뒤에 throws키워드를 사용하여 던지기를 할 예외 객체를 붙여주면 된다.
//예외 객체는 여러 개를 던질 수 있으며, 여러개를 던질 시에는 콤마(,)로 구분하여 나열해준다.


public class ThrowsExceptionExample {
	
	public static void checkYourSelf(Scanner scan) throws InputMismatchException{
		System.out.println("1. 사람고 어울리는것이 좋다. 2. 혼자있는게 좋다. ");
		System.out.println("선택 : ");
		int check = scan.nextInt();//예외 발생 가능 
		
		if(check == 1) {
			System.out.println("당신은  E 입니다. ");
		}else {
			System.out.println("당신은 I 입니다. ");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("성격 유형 검사를 시작합니다.");
			
			ThrowsExceptionExample.checkYourSelf(sc);
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력해주세요. ");
		}finally {
			System.out.println("프로그램 종료 ");
		}
	}
}
