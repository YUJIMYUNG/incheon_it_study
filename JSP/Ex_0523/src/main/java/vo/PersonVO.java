package vo;

public class PersonVO {
	private String name;//이름
	private int age; //나이 
	private String tel; //전화번호 
	
	public PersonVO(String name, int age, String tel) {
		this.age = age;
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name, int age, String tel) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
