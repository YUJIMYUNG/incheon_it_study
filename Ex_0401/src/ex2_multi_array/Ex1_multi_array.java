package ex2_multi_array;

import java.util.Scanner;

public class Ex1_multi_array {
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}};
		
		//배열 arr에 들어있는 모든 데이터의 합과 평균(float)을 구하세요.
		
		int sum = 0;
		int count = 0;
		
		
		for(int i = 0; i <arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				
				sum += arr[i][j];
				count++;
			}
		
			}
		
		float ave = (float)sum/count;
		System.out.println("arr에 들어있는 데이터의 합 : " + sum);
		System.out.println("arr에 들어있는 데이터의 평균 : " + ave );
		
		
	System.out.println("------------------------------------");
	
	
	//학생들의 수학과 영어
	
	//등록학 인원 수 :2
	//이름 : 제임스
	//수학 : 83
	//영어 : 81
	//----------------
	//이름 : 스미스
	//수학 : 28
	//영어 : 100
	//------------------
	//2명 등록 완료
	//제임스 83 81
	//스미스 28 100
	
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("등록할 인원 수 : ");
	int n = sc.nextInt();
	
	String[][] str = new String[n][3];
	
	for(int i = 0; i <str.length ; i++) {
		System.out.println("이름  : ");
		str[i][0] = sc.next();
		
		System.out.print("수학  : ");
		str[i][1] = sc.next();
		
		System.out.print("영어 : ");
		str[i][2] = sc.next();
		System.out.println("---------------");
		
		System.out.println(str.length + "명 등록 완료!!");
		
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
