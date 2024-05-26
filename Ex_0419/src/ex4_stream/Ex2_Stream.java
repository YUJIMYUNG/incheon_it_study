package ex4_stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Ex2_Stream {
	public static void main(String[] args) {
		//컬렉션 스트림 
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("김길동");
		set.add("박길동");
		
		
		//컬렉션의 경우 인터페이스에 추가된 디폴트 메서드인 stream()을 입력해
		//스트림 객체를 만들 수 있다. 
		Stream<String> setStream = set.stream();
		setStream.forEach(System.out::println);
		
		
		ArrayList<String> list = new ArrayList<String>(set);
		
		Stream<String> listStream = list.stream();

	}
}
