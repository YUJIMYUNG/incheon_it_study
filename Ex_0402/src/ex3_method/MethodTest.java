package ex3_method;

public class MethodTest {
	//두 수를 더하여 반환하는 add함수를 만들고 main에서 값을 두개 받아 출력하기
	public void add(int a, int b) {
		System.out.println("두 수의 합은 : " +(a+b));
		
	}
	
	//1~n까자ㅣ의 총합을 출력하는 onToN메서드 만들기
	public void onToN(int n) {
		int total =0;
		for(int i = 1;i < n; i++) {
			total += i;
		}
		
		System.out.printf("1부터 %d까지의 합 : %d\n",n, total);
	}
	
	//dan을 받아와서 구구단을 출력하는 multi()메서드 작성하기
	public void multi(int dan) {
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, (dan*i));
		}
	}
	
	
	//배열의 최대값을 찾아 출력하는 maxFinder메서드 만들기   
	public void maxFinder(int[] arr) {
		int max = arr[0];
		
//		for(int i = 0; i< arr.length; i++) {
//			if(max < arr[i]) {//배열의 i번째 수를 차례대로 비교해서 큰 값을 출력하기 
//				max = arr[i];
//			}
//		
//		}

		
		for(int x :arr) {
				if(x > max) max = x;
		}
		System.out.println("최대값 : " +max);
	}
	
	//원의 넓이를 구하는 circleArea메서드를 만들고
	//원의 둘레를 구하는 circlRound메서드를 만든다.
	//main으로부터 반지름을 넘겨받고
	//원의 넓이는 반환받고, 원의 둘레는 함수안에서 출력핫에ㅛ.
	//원의 넓이 : 3.14 * 반지름  * 반지름
	//원의 둘레 : 2* 3.14 * 반지름
	public double circleArea(double radius) {
		double area = radius * radius *3.14;
		
		System.out.println("원의 넓이 : "+ area);
		return area;
	}
	public void circleRound(double radius) {
		double round = radius * 2 * 3.14;
		
		System.out.println("원의 둘레 : "+round);
		
	}
	
	
	
	
}
