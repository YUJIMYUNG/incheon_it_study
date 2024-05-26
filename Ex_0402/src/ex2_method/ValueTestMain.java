package ex2_method;

public class ValueTestMain {
	public static void main(String[] args) {
		
		int su = 100;
		
		ValueTest vt = new ValueTest();
		su = vt.test(su);
		
		System.out.println("su : " + su);//출력 101
		
		
	}
}
