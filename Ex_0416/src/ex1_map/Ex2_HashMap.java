package ex1_map;

import java.util.HashMap;

public class Ex2_HashMap {
	public static void main(String[] args) {
		HashMap<String, Float> map = new HashMap<>();
		
		map.put("k1",100.0f);
		map.put("k2",3.14f);
		map.put("k3",4.15f);
		
		//자료구조가 비어있으면 true, 아니면 false 
		if(!map.isEmpty()) {
			System.out.println("map은 비어있지 않습니다. ");
		}
		
		//containskey(K key)
		//map 객체에 해당 key가 존재하면 true, 아니면 false 
		
		if(map.containsKey("k3")) {
			System.out.println("k3라는 key가 존재합니다. ");
		}
		
		//containsvalue(V value)
		//map 객체에 해당 value가 존재하면 true,없으면 false 
		
		if(map.containsValue(3.14f)) {
			System.out.println("map은 3.14 값을 가지고 있습니다. ");
		}
		
		
		
		
		
	}
}
