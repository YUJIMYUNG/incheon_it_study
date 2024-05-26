package ex2_lamda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Calculator5 {
	public static void main(String[] args) {
		//MyCalculator 인터페이스와 역할이 같음 
		Consumer<String> c1 = t-> System.out.println("입력값 : " + t);
		c1.accept("홍길동");
		
		BiConsumer<String, Integer> c2 = (x,y) -> System.out.println("입력값 1 : " +x + ", 입력값 2 : " + y );
		c2.accept("제임스", 200);
		
		
		Supplier<Object> s1 = () -> new Object();
		System.out.println(s1.get());//Object객체의 주소가 나온다... 
		
		Function<Integer, String> f1 = x -> String.valueOf(x);
		String str = f1.apply(100);
		System.out.println("문자열 str : " + str );
		
		BiFunction<String, String, Boolean> f2 = (x,y) -> x.equals(y);
		if(f2.apply("토마토", "토마토")) {
			System.out.println("두 문자열의 값은 같습니다. ");
			
		}
		
		
		Predicate<Integer> p1 = t -> t>=60; 
		
		int score = 65;
		
		boolean pass = p1.test(score);
		
		if(pass) {
			System.out.println("홍길동님의 점수는 : " + score + "이고 합격입니다. ");
		}else {
			System.out.println("홍길동님의 점수는 : " + score + "이고 불합격입니다. ");
			
		}
		
	}
}
