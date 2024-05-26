package ex5_buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex1_BufferedInput {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream("/Users/jimyung/test.txt");
			bis = new BufferedInputStream(fis);
			
			int read = 0;
			
			while((read = bis.read()) != -1) {
				System.out.print((char)read);
			}
			//역순으로 닫기 
			bis.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
