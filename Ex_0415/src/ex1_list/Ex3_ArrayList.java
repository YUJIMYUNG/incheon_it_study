package ex1_list;

import java.util.ArrayList;

public class Ex3_ArrayList {
	public static void main(String[] args) {
		//회원가입 프로그램
		//id, 이름, 비밀번호, 핸드폰번호 저장 
		// 저장하려고
		
//		ArrayList<String> namelist = new ArrayList<String>();
//		ArrayList<Integer> agelist = new ArrayList<Integer>();
//		
//		namelist.add("제임스");
//		agelist.add(20);
//		namelist.add("스미스");
//		agelist.add(30);
//		namelist.add("심슨");
//		agelist.add(40);

		//person 객체를 담는 List
		ArrayList<Person> list = new ArrayList<>();
		
		Person p1 = new Person();
		p1.name = "홍길동 ";
		p1.age = 30;
		
		Person p2 = new Person();
		p2.name = "김개똥 ";
		p2.age = 40;
		
		
		//list에 추가
		list.add(p1);
		list.add(p2);
		
		
//		System.out.println(list.get(0).name);//문자열 x, 숫자 x p1그 자체 
//		System.out.println(list.get(0).age);//문자열 x, 숫자 x p1그 자체 
//		System.out.println(list.get(1).name); 
//		System.out.println(list.get(1).age);
		
		//위 내용을 반복문을 통해 간단히 출력
		for(Person p : list) {
			System.out.println(p.name);
			System.out.println(p.age);
			System.out.println("---------------------");
		}
		
		
		
		
	}
}	
