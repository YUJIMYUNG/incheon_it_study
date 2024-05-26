package ex4_exception;

public class Ex2_Exception {
	public static void main(String[] args) {
		
		//NumberFormatException
		//잘못된 문자열을 숫자로 형변환할 때 발생
		//"111" -> 정수로 변환 가능
		//"11.11"->>  정수로 변환이 불가능 
		
		
		String str01 = "11";
		String str02 = "11.2";
		
		int num01 = Integer.parseInt(str01);
		System.out.println("String to int : " + num01 ); 
		
		int num02 = Integer.parseInt(str02);
		System.out.println("String to int : " + num02 );//예외 발생 
		
	}
}
