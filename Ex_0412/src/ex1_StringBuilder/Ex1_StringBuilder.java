package ex1_StringBuilder;

public class Ex1_StringBuilder {
	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("Hello");
		
		//기존 문자열 뒤에 새 문자열 삽입 
		//append() 
		str.append(" Wrold" );
		System.out.println(str );
		
		//문자열 삭제 
		//delete(int start, int end ) start/end는 인덱스를 뜻하며  보통 start는 이상, end는 미만까지 나타냄 
		str.delete(0, 6);//0번 부터 5번 인덱스까지 삭제 
		System.out.println(str);
		
		
		//원하는 위치에 문자열 삽입
		//insert(시작위치 index, 삽입하고자 하는 문자열)
		str.insert(0,"Hello ");
		System.out.println(str );
		
		//강의 21:20까지
	}
}
