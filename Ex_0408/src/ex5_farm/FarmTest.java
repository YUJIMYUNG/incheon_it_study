package ex5_farm;

import ex5_farm.Animal;
import ex5_farm.Cow;
import ex5_farm.Farm;
import ex5_farm.Pig;

//추상클래스 : 하나 이상의 추상메서드를 포함하는 클래스 , 공통적인 요소를 모아 상위클래스를 만들어냄 
abstract class Animal{
	//몸체는 있는데 내용은 아무것도 없는것 - 추상메서드 
	public abstract void cry();//오버라이딩용 내용을 정의할 필요가 없음 
};
class Pig extends Animal{
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("꿀꿀 ");
	}
};
class Cow extends Animal{
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("음메 ");
	}
};

class Farm{
	public void sound(Animal animal) {
		animal.cry();
	}
}


public class FarmTest {

	public static void main(String[] arxgs) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		
		f.sound(p);
		f.sound(c);
	}

	
	
	

}
