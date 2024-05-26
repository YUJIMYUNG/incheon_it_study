package work;

public class Bread {
	int n ;
	String name;
	
	
	public Bread() {
		System.out.println("빵을 만들었습니다.");
	}
	
	public Bread(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n", n);
	}
	
	public Bread(int n, String name) {
		for(int i= 0; i < n; i++) {
			System.out.printf("%s 빵을 만들었습니다.\n", name);
		}
		System.out.printf("요청하신 %s빵을 %d개 만들었습니다.", name, n);
	}
}
