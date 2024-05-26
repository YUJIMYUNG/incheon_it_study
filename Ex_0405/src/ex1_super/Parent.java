package ex1_super;

public class Parent {
	
	int n; //main -> chile(1)-> child(int 1)-> Parent (int 1)-> this.n = 1; -> int 1;
	
	public Parent(int n) {//기본생성자 - 생성자명은 클래스명과동일하게 
		this.n = n;
	}
	
	public int getN() {
		return n;
	}
}
