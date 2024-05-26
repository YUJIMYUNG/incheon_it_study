package ex1_list;

import java.util.ArrayList;
import java.util.List;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		

		list.add(10);//0번 index에 저장 
		list.add(10);//1번 index에 저장 (2	번 index로 밀림) 
		System.out.println(list );
		list.add(1,50); //1번 index에 새로 50을 넣겠다.
						//기존의 1번 index부터 하나씩 뒤로 밀
		System.out.println(list );
		list.set(2, 100); //치환 -> 	2번 index에 100을 세팅하겠음 
		System.out.println(list );
		list.add(55);
		System.out.println(list );
		
		if(list.contains(55)) {
			System.out.println("list에 55의 값이 존재합니다.");
		}
		
		list.remove(1); //1번 index의 값을 삭제하고 삭제한 값을 반환한다.
		
		//삭제 하고나면 삭제한 인덱스보다 크거나 같은곳에서 인덱스가 1씩 당겨진다.
		
		list.clear();//리스트는 남아있고 안에 있던 모든 요소들을 삭제 
		System.out.println(list);
		
		
	
		
		
		
	}
}
