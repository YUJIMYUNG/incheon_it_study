package ex4_Writer;

import java.io.FileWriter;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		//FileWriter
		//문자 기반의 출력스트림 
		//텍스트 작업할 때 매우 유용함 
		
		
		
		try {
			FileWriter fw = new FileWriter("/Users/jimyung/fileWriter예제.txt",true);
			
			fw.write("첫번째 줄 작성합니다.\n");
			fw.write("번째 줄도 문제없지!\n");
			System.out.println("작성완료");
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
