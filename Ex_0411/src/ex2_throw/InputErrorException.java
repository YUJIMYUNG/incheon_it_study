package ex2_throw;
//사용자 정의 예외처
//자바가 제공하는 예외 객체 외에도 개발자의 목적에 의해서 예외 객체를 만들 수 있다.
//자바가 제공하는 예외 객체는 다양하지만 모든 예외를 처리하기는 어렵다. 
//목적에 따라 공통기능을 지니는 예외처리도 필요하기 때문에 개발자가 예외를 생성하여 처리해야 한다.

//체크예외 생성하기 
public class InputErrorException extends Exception {
	public InputErrorException(String message) {
		super(message);
	}

}

//비체크 예외 생성하기
//public class InpuErrorException extends RuntimeException{
//	
//}