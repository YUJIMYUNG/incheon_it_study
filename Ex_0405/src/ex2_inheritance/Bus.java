package ex2_inheritance;

public class Bus extends Car{
	int peopleNum;
	
	public Bus(int peopleNum) {
		this.peopleNum = peopleNum;
		
	}
	
	public void takePerson() {
		System.out.println("승객이 버스에 탔습니다. ");
		peopleNum++;
		System.out.println(peopleNum+"명이 있습니다. ");
	}

	
	
}
