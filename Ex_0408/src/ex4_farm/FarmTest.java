package ex4_farm;




class Animal{};
class Pig extends Animal{};
class Cow extends Animal{};

class Farm{
	public void sound(Animal animal) {
		//instanceof연산자
		//타입이 변환되어 저장된 변수는 안에 어떤 객체가 담겨있는지 직접 확인하지 않는 이상 내부객체를 알기 쉽지않다.

		//A instanceof B : A객체가 생성될 때 B타입으로 만들었냐 
		if(animal instanceof Pig) {//pig타입이면 true 아니면 false
			System.out.println("꿀꿀 ");
		}else {
			System.out.println("음메 ");
		}
	}
}


public class FarmTest {

	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		
		f.sound(p);
		f.sound(c);
	}

	
	

}
