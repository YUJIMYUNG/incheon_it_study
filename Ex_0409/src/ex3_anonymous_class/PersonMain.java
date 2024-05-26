package ex3_anonymous_class;

public class PersonMain {
	public static void main(String[] args) {
		Student s = new Student();
		s.mySelf();
		
		//익명클래스 - 사용빈도 높음 
		Person p1 = new Person() {// 이름 없는 클래스 - 생성자 정의 불가능, 둘 이상의인터페이스 구현 불가 
			
			@Override
			public void mySelf() {
				// TODO Auto-generated method stub
				System.out.println("저는 직장인입니다. ");
			}
		}; //코드블럭이 student 클래스와 같은 역할을 함
		
		p1.mySelf();
		
		
		//익명클래스를 사용하면 클래스를 하나 더 만들 필요는 없다.
		//하지만 생성자를 만들 수 없기때문에 주의  ! 
		//이 클래스에서 한 번만 사용하기 위해서 만든 클래스 
		Person p2 = new Person() {
			@Override
			public void mySelf() {
				// TODO Auto-generated method stub
				System.out.println("저는 자영업자 겸 학생입니다. ");
			}
		};
		
		p2.mySelf();
	}
}
