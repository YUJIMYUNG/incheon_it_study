package ex2_lamda;

@FunctionalInterface
public interface MyCalculator {
	int plus(int num1, int num2);
	//int minus(int num1, int num2); 람다식을 사용하라면 함수식은 하나만존재해야한다. 
}
