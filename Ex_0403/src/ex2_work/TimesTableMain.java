package ex2_work;

import java.util.Scanner;

//main에서 키보드를 통해 받은 값을 전달   
//TimesTable클래스를 만들고
//showTable()메서드를 정의한다.
//showTable()에서는 전달받은 값에 대한 구구단을 출력하는코드를 작성
public class TimesTableMain {
	public static void main(String[] args) {
		TimesTable tt = new TimesTable();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단 n 단 : ");
		int n = sc.nextInt();
		
		tt.showTable(n);
		
		
		
		
		
		
	}
	
}
