package ex1_buffered;
//문자 입력받을 때 스캐너보다 빠르다! 
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex3_BufferedReader {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//문자열 입력 

		System.out.print("문자 입력 : ");
		String str = br.readLine();
		System.out.println("입력 받은 값 : " +str);
		
		//정수 입력
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(br.readLine());
		System.out.println("정수 : "+ num);
	}
}
