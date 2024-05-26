package homework0_0403;


public class PrintGraph {
	
	//그래프를 그리는 기능 -> 함수(메서드)
	public String print(char ch, int num) {//넘겨받은 num숫자만큼 ch의 문자로 그림을 그리겠다
		char[] val = new char[num];
		String str = "";
		for(int i = 0; i < val.length; i++) {
			str += val[i] = ch;
		}
		
		return str;
	}
}
