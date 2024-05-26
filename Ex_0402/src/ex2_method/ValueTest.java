package ex2_method;

public class ValueTest {
	public int test(int su) {//int su (매개변수)는 함수가 끝나면 메모리가 사라진다.(return이 없으면..)
		su++;
		System.out.println("su : " + su);
		return su;
	}
}
