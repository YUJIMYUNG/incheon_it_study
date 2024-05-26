package ex1_super;

public class SuperMain {
	public static void main(String[] args) {
		Parent p1 = new Parent(3);
		System.out.println(p1.n);
		
		Child c1 = new Child(4);
		System.out.println(c1.n);
	}
}
