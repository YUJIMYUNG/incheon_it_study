package reWork;

public class CalcultorMain {
	public static void main(String[] args) {
		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();
		
		System.out.println(cp.getResult(3, 5));
		System.out.println(cm.getResult(10, 7));
		
		
	}
}
