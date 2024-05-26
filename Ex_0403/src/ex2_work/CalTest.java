package ex2_work;
	

public class CalTest {
	
//	private int su1;
//	private int su2;
//	private int operator;
//	
//	public int getSu1() {
//		return su1;
//	}
//	public int getSu2() {
//		return su2;
//	}
//	public char getOperator() {
//		return(char)operator;
//	}
//	
//	
//	
//	
//	public int getResult(int result) {
//		
//		if(operator == '+') {
//			result = su1 +su2;
//		}else if(operator == '-'){
//			result = su1 - su2;
//		}else if(operator == '*') {
//			result = su1 * su2;
//		}else if(operator == '/') {
//			result = su1 / su2 ;
//		}
//		
//		
//		return result;
//	}
	
	public int getResult(int su1, int su2, String op) {
		int result = 0;
		switch(op) {
		case "+":
			result = su1+su2;
			break;
		case "-":
			result = su1-su2;
			break;
		case "*":
			result = su1*su2;
			break;
		case "/":
			result = su1/su2;
			break;
			
		}
		
		return result;
	}
	
}
