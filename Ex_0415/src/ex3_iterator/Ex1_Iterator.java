package ex3_iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//반복자(Iterator)
//컬렉션의 요소를 순회하여 하나씩 추출하는데 사용한다.
//Iterator 객체는 선언된 컬렉션 객체에서 가져와 사용한다.

//메서드
//boolean hasNext()		다음에 순회할 데이터 유무 확인
//E Next()				다음 위치의 데이터로 이동하여 반환 
//
public class Ex1_Iterator {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Iterator<Integer> iter =  list.iterator(); //iterator 메서드 호출 
		
		while(iter.hasNext()) { //hasNext -> 다음에 순회할데이터가 있으면 
			int val = iter.next();
			System.out.print(val + "  ");
		}
	}
}
