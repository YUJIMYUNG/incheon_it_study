package Work;

public class CalculatorMain {
	public static void main(String[] args) {
		CalPlus cp = new CalPlus();
		CalMinum cm = new CalMinum();
		
		
		System.out.println("CalPlus : " + cp.getResult(10,7));
		System.out.println("CalMinus : " +cm.getResult(10,7));
		
	}
	
	
	
}
