package ex3_OutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex2_OutputStream {
	public static void main(String[] args) {
		//FileInputStream과 FileOutputStream을 이용하여 이미지 복사하기 
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("/Users/jimyung/img2.jpg");//이미지를 input 
			fos = new FileOutputStream("/Users/jimyung/img2_copy2.jpg");//이미지를 output 
			
			//속도 상향 
			byte[] buffer = new byte[512];
			
			
			
			//현재 시간을 m/s단위로 나타낸다. 
			long start = System.currentTimeMillis();
			
			System.out.println("이미지 읽기 시작 ");
			int read = 0;
			while((read = fis.read(buffer)) != -1) {
				fos.write(buffer,0,read);
			}
			
			System.out.println("이미지 읽기 종료 ");
			
			long end = System.currentTimeMillis();
			
			double time = (double)(end-start)/ 1000; //얼마나 걸렸ㄴ는지 계산하기 
			System.out.println(time + "초");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {//역순으로 닫아야됨
				//쓰는게 끝나면 읽는것도 마침
				if(fos != null) {
					fos.close();
				}
				if(fis != null) {
					fis.close();
				}
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}	
