package ex2_multi_array;

public class Ex2_multi_array {
	public static void main(String[] args) {
		
		//2차원배열은 요소로서 1차원 배열을 가지고,
		//3차원 배열은 요소로서 2차원 배열을 가지게된다.
		
		
		
		//다차원 배열
		//2차원 배열의 선언
		//1차원 배열과 근본적으로 동일합니다.
		//다만 대괄호가 하나 더 추가됩니다.
		
		
		//자료형[][] 배열명 = new 자료형[1차원 배열의 개수][1차원 배열에 들어갈 데이터의 개수]
		int[][] arr = new int[2][3];
		
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 300;
		arr[1][0] = 400;
		arr[1][1] = 500;
		arr[1][2] = 600;
		
		//2차원 배열의 출력1
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		
		//2차원 배열의 출력2
		
	for(int i=0; i<2; i++) {
		for(int j =0; j<3; j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
	//2차원배열의 요소인 1차원배열에 들어가는데이터 개수가 다를 수 있다.
	
	int[][] arr2 = new int[2][];
	
	arr2[0] = new int[2];
	arr2[1] = new int[3];
	
	int n = 0;
	
	for(int i = 0; i < arr2.length; i++) {
		for(int j = 0; j < arr2[i].length; j++) {
			System.out.print((arr2[i][j] = n+=100)+ " ");
		}
		System.out.println(" ");
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
