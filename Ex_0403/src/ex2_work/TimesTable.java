package ex2_work;

public class TimesTable {
	
	public void showTable(int n) {
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", n, i, (n*i));
		}
	}
	
}
