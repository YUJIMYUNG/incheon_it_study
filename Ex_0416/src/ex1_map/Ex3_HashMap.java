package ex1_map;

import java.util.HashMap;
import java.util.Scanner;
//id : aaa
//pw : 1111
//아이디가 존재하지 않습니다.
//id : lee
//pw : 3333
//비밀번호 불일치 
//id : park
//pw : 3333
//로그인 성공 

public class Ex3_HashMap {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("kim",1111);
		map.put("lee",2222);
		map.put("park",3333);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id : ");
		String id = sc.next();
		
		System.out.print("pw : ");
		int pw = sc.nextInt();
		
			
		//1. 아이디가 존재하는가?
		if(!map.containsKey(id)) {
			System.out.println("아이디가 존재하지 않습니다. ");
		} else {
			//2. 아이디가 존재하면 비밀번호가 일치하는가?
			if(pw != map.get(id)) {
				System.out.println("비밀번호가 틀립니다. ");
			}else {
				//3. 일치하다면 로그인 성공 
				System.out.println("로그인 성공 ");
			}
			
		}
	}
}
