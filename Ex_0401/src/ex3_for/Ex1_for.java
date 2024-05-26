package ex3_for;

public class Ex1_for {
	public static void main(String[] args) {
		
		
		//향상된 for문
		//JDK 1.5부터 새롭게 추가된 기능으로 배열과 컬렉션의 모든 요소를 참조하기 위 반복문이다.
		//for(변수 : 반복가능객체  ){
		// 반복하고자 하는 명령   
		//}
		
		int[] score = {90, 92, 93};
		
		int sum = 0;
		double avg = 0.0;
		
		for(int val : score) {
			sum += val;
		}
		
		avg = (double)sum/3;
		System.out.println("총점 : "+sum + "평균 : "+avg);
		
		
		int[][] iArr = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int[] val : iArr) {
			for(int v : val) {
				System.out.println(v);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
