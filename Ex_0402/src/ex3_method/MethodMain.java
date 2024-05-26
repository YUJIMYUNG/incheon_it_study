package ex3_method;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요 : ");
		int su1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		int su2 = sc.nextInt();
		
		mt.add(su1, su2);
		
		
		mt.onToN(10);
		
		mt.multi(9);
		
		System.out.println("----------------------------------------------");
		
		int[] arr = {1,6,9,2,5,3,7,4};
		
		mt.maxFinder(arr);
		
		double area = mt.circleArea(8);
		mt.circleRound(20);
	}
}
