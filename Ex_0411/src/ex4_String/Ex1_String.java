package ex4_String;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		
		String str = "Kim Mal Ddong ";
		//문자열의 길이 - length();
		System.out.println("문자열의 길이 : "+ str.length());
		
		//indexOf(char ch);
		//해당 문자의 index 번호를 반환
		//탐색 방향은 왼쪽에서 오른쪽
		//매개변수로 문자열도 가능 
		System.out.println("a의 index 번호 : " + str.indexOf('a'));//a를 찾고 바로 빠져나옴
		
		
		//charAt(int index);
		//해당 index에 값을 반환
		System.out.println("5번 index의 값은 : " + str.charAt(5)); 
		
		
		//substring(int start, int end);
		//시작 index부터, end index 전까지 값을 문자열로 반환 
		System.out.println("0부터 3까지 잘라내기 : " + str.substring(0,4));
		
		
		//split(String str)
		//매개변수에 들어간 글자를 기준으로 문자열을  잘ㅈ라 배열로 반환한다.
		String[] arr = str.split(" "); //띄어쓰기를 기준으로 잘라내기 
		System.out.println("split " + Arrays.toString(arr));
		
		//문자열을 다른 타입으로 바꾸는 방법
		String n = "1004";
		int number = Integer.parseInt(n);
		
		System.out.println(number+1);
		
		
		//대소문자를 구별하지 않음 
		String str2 = "kim mal ddong";
		System.out.println("비교 : " + str.equalsIgnoreCase(str));
		
		
		//앞뒤의 공백 제거   
		String str3 = "      trim     ";
		System.out.println(str3);
		System.out.println(str3.trim());
		
		
		//replace(char old, char new); old를 new로 치환 
		System.out.println(str.replace(" ", "/"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
