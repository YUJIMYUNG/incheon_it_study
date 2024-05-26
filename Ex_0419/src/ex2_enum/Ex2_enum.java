package ex2_enum;

public class Ex2_enum {
	public static void main(String[] args) {
		//Item item = new Item();  >생성자를 외부에서 호출하는게 불가능하다. 
		
		Item start = Item.START;
		String str = start.getItemStr();
		System.out.println(str);
		
		String str2 = start.getSymbol();
		System.out.println(str + ", " + str2);
	}
}
