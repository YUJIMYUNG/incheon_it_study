package ex6_abstract;

public abstract class AbsParent {// 추상메서드가 존재하여 추상 클래스가 됨 
	
	int value = 100;
	
	public int getValue() {
		return value; 
	}
	
	
	abstract public void setValue(int n);//매개변수를 가질 수 있지만 몸체가 없음 
}
