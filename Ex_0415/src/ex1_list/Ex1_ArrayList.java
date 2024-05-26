package ex1_list;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();//새롭게 만든 클래스 <>안에 내용 생략 가능
		
		//add(E e)
		list.add(100);
		list.add(100); //값의 중복 추가가 됨 
		list.add(20);
		
		System.out.println(list);
		
		//size()
		System.out.println("list의 크기 : " + list.size());
		
		//get(int index)
		//특정 값만 가져오기
		
		int res = list.get(2);
		
		System.out.println("List의 2번 index의 값 : " + res);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("----------------------------");
		
		for(int i : list) {//향상된 for
			System.out.println(i);
		}
		
		System.out.println("----------------------------");
		
		//list.forEach(x->System.out.println(x ));
	}
}
