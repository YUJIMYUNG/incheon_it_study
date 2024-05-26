package homework0_0403;
	//graph라는 이름의 메인클스를 만들어 0~9사이의 난수를 100개 저장하는 배열을 만들고,
	//해당 배열이 가지고있는 각 방의 난수를 판별하여 그래프화 해보자
	//단, 발생한 난수의 그래프화 작업은 PrintGraph클래스가 하도록 한다.

import java.util.Random;

public class Graph {
	public static void main(String[] args) {
		
		
		int[] num = new int[100];
		
		Random rnd = new Random();
		
		int[] count = new int[10];
		
		
		for(int i = 0 ; i <num.length; i++) {
			num[i] = rnd.nextInt(10);
			System.out.print(num[i] +" ");
		}
		System.out.println();
		
		//0~9까지 각 난수가 몇개씩 ㄴㅏ왔나 카운트
		for(int i = 0; i < num.length; i++){
			count[num[i]]++;//0~9
		}
		
		PrintGraph pg = new PrintGraph();
		for(int i = 0; i < count.length; i++) {
			System.out.println(i+"의 개수 : " + pg.print('#', count[i]));
		}
		
		
	}

}
