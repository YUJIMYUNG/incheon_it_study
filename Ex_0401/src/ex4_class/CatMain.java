package ex4_class;

public class CatMain {
	public static void main(String[] args) {
		//객체를 담을 수 있는 객체변수 선언하기
		
		Cat c;//선
		
		//변수에 객체 대입하기
		//변수명 = new 클래스명();
		//new는 메모리에 공간을 확보해주는 키워드
		//클래스명() -> 메모리에 객체를 올려주는 키워
		
		
		
		c = new Cat();//new Cat(); -->객체의 생
		
		
		
		//객체 초기화하기
		Dog d = new Dog();
		
		//코드를 컴파일한 결과물은 코드 파일을 각각 작성한것과 동일하게
		//class별로 도출되어 2개가 생성된다.
		//파일 분리 여부와 상관 없이 결과물이 같기 때문에, 분리 여부는 개발자가 원하는대로 해도 된다.
		//그러나 추후 유지보수의 편리성과 클래스 재사용성을 고려해 하나의 파일에 한개의 클래스를 작성하는것을 추천
		
		
	}
}
