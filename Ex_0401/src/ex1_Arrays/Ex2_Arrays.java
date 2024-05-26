package ex1_Arrays;

import java.util.Arrays;

public class Ex2_Arrays {
	
	public static void main(String[] args) {
		
		//배열의 복사
		//자바에서 배열은 한 번 생성하면 그 길이를 변경할 수 없다.
		//따라서 더 많은 데이터를 저장하거나 기존의 배열과 똑같은 배열을 새로 만들으려면
		//배열을 복사해야 한다.
		
		//복사의 방법
		//얕은 복사(Shallow Copy)
		//복사된 배열이나 원본 배열이 변경될 때 서로간의 값이 께 변경된다.
		//깊은 복사(Deep Copy)
		//복사된 배열이나 원본 배열이 변경될 때 서로 간의 값은 바뀌 않는다.
		
		int[] arr01 = {1,2,3};
		
		int[] arr02 = arr01;//얕은 복
		
		arr02[1] = 10;
		System.out.println("arr01배열 : " + Arrays.toString(arr01));
		System.out.println("arr02배열 : " + Arrays.toString(arr02));
		
		
		System.out.println("-----------------------------------");
		
		//배열의 깊은 복사는 반복문을 이용해 새로운 배열에 값을 직접 넣어주거나
		//Arrays클래스의 copyOf()메서드 System클래스의 arratCppy()메서드를 이용한다.
		
		int[] cards = {1,6,5,4,3,2};
		
		//반복문을 이용한 깊은 복사
		int[] cards2 = new int[cards.length];
		
		for(int i = 0; i <cards2.length; i++) {
			cards2[i] = cards[i];
		}
		
		cards2[1] = 10;
		
		System.out.println("cards 배열 : " + Arrays.toString(cards));
		System.out.println("cards2 배열 : " + Arrays.toString(cards2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
