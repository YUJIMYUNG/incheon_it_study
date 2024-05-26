package Lotto;

import java.util.Random;

public class lotto {
	
	public static void main(String[] args) {
		
		
		int lotto[] = {}; 
		
		
		Random random = new Random();
		
	
		outer:for(int i = 0;i <= 6;) {
			lotto[i] = random.nextInt(45)+1;
			
			
			//중복값을 비교하는 방복
			for(int j = 0; j <i; j++) {
				if(lotto[i]==lotto[j]) {
					continue outer;
				}
			}
			System.out.println(lotto[i]+" ");
			i++;
		}
		
		
	}
}
