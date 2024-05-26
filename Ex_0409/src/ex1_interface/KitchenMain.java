package ex1_interface;

public class KitchenMain {
	public static void main(String[] args) {
		Kitchen k = new Kitchen();
		
		
		Menu1 im1 = k;
		
		System.out.println(im1.jajang());
		System.out.println(im1.tangsuyuck());
		System.out.println(im1.boggembab());
		
		
		Menu2 im2 = k;
		
		//System.out.println(im2.jajang());불가능 
		//System.out.println(im2.tangsuyuck()); 불가능 
		System.out.println(im2.boggembab());
		
		Menu3 im3 = k;
		
		//System.out.println(im3.jajang());불가능 
		System.out.println(im3.tangsuyuck());
		//System.out.println(im3.boggembab()); 불가능 
	}
}
