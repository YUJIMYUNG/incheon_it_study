package ex4_String;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_String {
	public static void main(String[] args) {
		
		String s = "    H  e   l    l   o  " ; 
	//공백을 모두 제거하여 출력해주세요
		
		String s1 = s.trim();
		
		System.out.println(s1.replace(" ",""));
		
		//키보드에서 무작위로 입력을 받고 입력받은 문자열에서 소문자 a가 몇개인지 구하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String x = sc.next();
		
		//소문자a를 판별하기위한 각 문자를 하나씩 뽑아낸다. 
		int count = 0; //갯수를 담아줄 변수를 만들고
		for(int i = 0; i < x.length(); i++) {
			if(x.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("a의 갯수 : " + count );
	
		
		
		
		
		//키보드에서 세글자 이상의 단어를 입력받은 뒤 회문인지 아닌지 아닌지 판별하는 코드 작성하기
		//회문은 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 단어, 문장입니다. 
		System.out.print("입력 : ");
		String ori = sc.next();
		
		//거꾸로 잘라서 객체에 담기 
		String rev = "";
		
		for(int i = ori.length()-1; i >= 0; i--) {
			rev +=  ori.charAt(i);//반복문 돌아가면 거꾸로 한 자씩 담긴다. 
			
		}
		
		
		if(ori.equals(rev)) {
			System.out.println(ori + "은(는) 회문입니다. ");
		}else {
			
			System.out.println(ori + "은(는) 회문이 아닙니다. ");
		}
		
		
		
		
		
	}

	private static int findCharacter(String result, char c) {
		// TODO Auto-generated method stub
		return 0;
	}
}
