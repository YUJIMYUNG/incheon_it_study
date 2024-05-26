package ex2_lamda;

@FunctionalInterface
interface Iadd{
	int add(int x, int y);
}

public class Calculator2 {
	public static void main(String[] args) {
		//람다식을 매개변수로도 활용할 수 있다. 활용이 많이 된다! 
//		Iadd add = (x, y) -> x+y;
//		int res= result(add);
		
		//람다식을 매개변수로 직접 넣을 수 있다.
		
		int res = result((x,y)->x+y);
		
		System.out.println("람다식 매개변수로 활용 : " + res );
	}
	
	
	//main 밖에서 함수를 정의 
	public static int result(Iadd lamda) {
		return lamda.add(1, 2);
	}
}
