package ex1_map;

import java.util.HashMap;

public class Ex1_HashMap {
	public static void main(String[] args) {
		
		HashMap<Integer, Character> map = new HashMap<>();
		//put(K key, V value);
		//hashmap에 데이터 추가하기 
		map.put(5, 'A');
		map.put(3, 'B');
		map.put(1, 'C');
		
		System.out.println(map);
		
		//map에 저장되는 value는 중복될 수 있다. 
		map.put(4,'A');
		System.out.println(map);
		
		
		//map의 key값은 중복이 될 수 없다.
		//이미 있ㅇ는 key를 사용하면 value가 갱신이 된다. 
		map.put(1,'F');
		System.out.println(map); //1key에 F가 들어갔을 뿐 에러가 나지는 않는다. 
		
		//remove(K key)
		//key를 통해 요소를 삭제 
		map.remove(1);//1이라는 key값을 가지고있는 데이터를 삭제해라 
		System.out.println(map);
		
		//size()
		//map 의 크기를 반환
		System.out.println("map 의 크기 : " + map.size());
		
		//get(K key)
		//key 를 통해 value를 반환
		char res = map.get(1);
		System.out.println(res);
	}
}
