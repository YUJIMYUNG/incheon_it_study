package Ex01_for;

public class ex01_for {
	public static void main(String[] args) {
		
		//중첩for문을 사용하기
		
		//12345
		//12345
		//12345
		
		
		for(int i = 1; i < 4 ; i++) {
			
			for(int j = 1; j< 5 ; j++) {
				System.out.print(j+" ");
			}
		System.out.println("");
		}
		
		//1 2 3 4 5 6 7 8 9 10
		//2 3 4 5 6 7 8 9 10 1
		//3 4 5 6 7 8 9 10 1 2
		//4 5 6 7 8 9 10 1 2 3 
		//5 6 7 8 9 10 1 2 3 4
		//6 7 8 9 10 1 2 3 4 5
		//7 8 9 10 1 2 3 4 5 6
		//8 9 10 1 2 3 4 5 6 7
		//9 10 1 2 3 4 5 6 7 8
		//10 1 2 3 4 5 6 7 8 9
		
		//별찍기
		
		for(int i = 1; i < 6 ; i++) {
			for(int j = 1; j < 11; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
