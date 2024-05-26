package ex1_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

//다중 catch 사용하기
//프로그램을 구동할 때 하나의 예외만 발생한다면 처리하기 어렵지 않다.
//하지만 try구문 안에서 여러가지 예외가 발생할 수도 있다.
//만약 기존과 같은 방법으로 처리한다면 하나의 예외를 제외하고는 제대로 처리할 수 없다.
public class Ex2_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int[] cards = {4,5,1,2,7,8};
			System.out.print("몇 번째 카드를 뽑으시겠습까?? ");
			int cardIndex = sc.nextInt();
			System.out.println("뽑은 카드 번호는 : " + cards[cardIndex]);
		}catch (InputMismatchException e) {
			System.out.println("잘못 입력하셨습니다. 숫자만 가능합니다. ");
		}catch(ArrayIndexOutOfBoundsException e) {//배열의 인덱스가 잘못들어왓을 때 예외처리 
			System.out.println("해당 번호의 카드가 없습니다. ");
		}
	}
}
