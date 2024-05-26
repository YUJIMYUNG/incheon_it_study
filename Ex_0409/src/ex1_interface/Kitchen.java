package ex1_interface;

public class Kitchen implements Menu1/*Menu2, Menu3 생략가*/{

	@Override
	public String tangsuyuck() {
		// TODO Auto-generated method stub
		return "돼지고기 + 당근 + 양념";
	}

	@Override
	public String boggembab() {
		// TODO Auto-generated method stub
		return "밥 + 고기 + 야채 ";
	}

	@Override
	public String jajang() {
		// TODO Auto-generated method stub
		return "중면 + 춘장 + 완두콩 " ;
	}
	
}
