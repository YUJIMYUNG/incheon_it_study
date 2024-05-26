package ex4_exception;

public class Ex3_Exception {
	public static void main(String[] args) {
		//ArrayIndexOutOfBoundsException
		//배열에서 인덱스(index)범위를 초과하여 사용할 때 발생
		
		int[] arr = {1,2,3,4,5};
		System.out.println(arr[6]);
	}
	
}
