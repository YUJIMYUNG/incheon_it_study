package ex2_inputStream;

import java.io.File;
import java.io.FileInputStream;

public class Ex2_FileInputStream {
	public static void main(String[] args) {
		//바이트 기반 스트림으로 한글도 읽어올 수 있게 만들기 
		
		String path = "/Users/jimyung/test.txt";
		
		File f = new File(path);
		
		byte[] b = new byte[(int)f.length()];//[]안에는 int형자료까지 들어갈 수 있음 -> int 로 형변환
		
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				
				fis.read(b);//배열 전달  
				
				String msg = new String(b);//바이트 배열을 담기 
				
				System.out.println(msg);
				
			} catch (Exception e) {
				
			} finally {
				try {
					if(fis != null) {
						fis.close();
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
}
}