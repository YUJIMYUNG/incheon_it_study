package ex2_lamda;

public class Calculator implements MyCalculator{
	
	//추상메서드를 모버라이딩 
	@Override
	public int plus(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
}
