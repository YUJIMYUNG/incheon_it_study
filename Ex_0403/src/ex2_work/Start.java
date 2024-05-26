package ex2_work;

import java.util.Random;

public class Start {
	
	Random random = new Random();
	
	
	int rnum = random.nextInt(50)+1;
	int count = 1;
	
	public void check(int number) {
		
		
		
		if(number == rnum) {
			System.out.println(count + "회 만에 정답!");
		}else if(number > rnum) {
			System.out.println("Down!");
			count++;
		}else {
			System.out.println("Up!");
			count++;
		}
//		for(int i=0; i < ???; i++ ) {
//			if(nan[i] < su) {
//				System.out.println("Down!");
//			}else if(nan[i] > su) {
//				System.out.println("Up!");
//			}else if(nan[i] == su) {
//				System.out.println("정답입니다!");
//			}
//		}
//		
//		count++;
//		
//		System.out.println(count);
	}
}
