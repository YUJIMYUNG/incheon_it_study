package ex3_object;


//toString()메서드
//객체의 문자 정보를 반환해주는 메서드
//print()문을 사용해 객체를 출력할 경우, 해당 메서드가 자동으로 실행되어 객체의 정보를 반환해주고 출력이 된다.
//따라서 해당 메서드를 재정의해서 사용하면 원하는 객체의 정보를 쉽게 출력할 수 있다. 

public class Car {
	private String carName;
	private String company;
	
	public Car(String carName, String company) {
		this.carName = carName;
		this.company = company;
	}
	
	@Override
	public String toString() {
		String str = "차량 이름 : " + this.carName + ", 제조사 : " + this.company ;
		return str; 
	}
}
