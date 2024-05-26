package ex2_this;

public class StudentMain {
	public static void main(String[] args) {
		Students s = new Students("제임스", 20,240404001);
		System.out.println("이름 : " + s.name );
		System.out.println("나이  : " + s.age );
		System.out.println("학번  : " + s.studentID );
	}
}
