package ex4_static;

public class BankMain {
	public static void main(String[] args) {
		Bank b1 = new Bank("강남 ","02-222-2222 ");
		Bank b2 = new Bank("대전 ", "042-333-3333");
		Bank b3 = new Bank("부산 ", "052-444-4444 ");
		
		//static은 필요할 때만 사용하는게 좋음.메모리문제
		Bank.interest = 1f;//static은 객체 생성 없이 바로 호출 가능  
		
		
		b1.printBank();
		b2.printBank();
		b3.printBank();
	}
}
