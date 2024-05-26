package ex3_computer;

public class Samsung extends Computer{  //computer상속받고 

		@Override
		public void powerOn() { //poweron 오버라이드 
			// TODO Auto-generated method stub
			super.powerOn(); 
			System.out.println("아이 러브 샘송 ");
		}
}
