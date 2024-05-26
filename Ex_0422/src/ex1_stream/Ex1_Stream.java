package ex1_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1_Stream {
	public static void main(String[] args) {
		Integer[] nums = {1,6,7,8,99,7,5,4,23,42,5,7,457,79,3,3,3,4};
		
		//1. 스트림 객체 생성 
		Stream<Integer> stream = Arrays.stream(nums);
		
		//2. 스트림에 중간연산 - 
		stream.distinct().sorted().limit(5).forEach(System.out::println);
		//      중복제거 - 정렬    -  앞에서부터5개  - 출력 
		
		//skip()
		//rangeClosed() : 	정수 범위를 생성 
		IntStream intStream = IntStream.rangeClosed(1, 10);
		intStream.skip(3).limit(5).forEach(x -> System.out.print(x +" "));
		//   1,2,3 건너뛰고-앞에서부터5개 - 		출력
		
		System.out.println("\n---------------------------");
		
		//filter()
		IntStream intStream2 = IntStream.of(1,2,2,3,4,5,6,7,8,8,9,10);
		intStream2.distinct().filter(y -> y % 2==0).forEach(y -> System.out.print(y +" "));//
		//         중복제거   - 필터링조건(boolean)    - 출력
		
		System.out.println("\n---------------------------");
	
		//문자열의 길이가 3이상인 문자열만 출력 
		Stream.of("ab","a","abc","abcdef","abcdefg")
			.filter(x -> x.length() >2)
			.forEach(x -> System.out.println(x + " "));
		
		
		
		
		
	}
}
