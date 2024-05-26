package ex2_inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_FileInputStream {
	public static void main(String[] args) {
		//FileInputStream은 파일에서 바이트 단위로 자료를 읽어들일 때 사용하는 스트림
		//1byte씩 읽어옴 
		//이미지, 동영상, 텍스트 등 모든 타입의 파일을 읽어올 수 있다. 
		//한글은 1byte가 아니라서 제대로 읽어오지 못함 
		
		String path = "/Users/jimyung/test.txt";
		
		File f = new File(path);
		
		FileInputStream fis = null;
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);//try& catch를 필요로함 
				
				int code = 0;
				//fis에서 읽어온 파일이 -1과 같지 않은지 비교 
				while((code = fis.read()) != -1) {
					System.out.println((char)code + " ");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					fis.close(); //file을 읽어 실행 시킨 후에는 무조건 닫아줘야하고 이 또한 try/catch가 필요함 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		}
	}
}
