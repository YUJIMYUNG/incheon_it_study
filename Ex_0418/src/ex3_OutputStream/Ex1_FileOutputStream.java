package ex3_OutputStream;

import java.io.FileOutputStream;

public class Ex1_FileOutputStream {
	public static void main(String[] args) {
		
		//FileOutputStream
		//작성한 내용을 외부로 출력할 때 사용
		//write()메서드 사용
		
		FileOutputStream fos = null;
		
		try {
			//경로에 파일이 없으면 만들어준다. 
			//계속 실행하면 덮어쓰기가 됨 
			//경로 옆에 boolean형태로 작성하면 이어쓰기가 가능하다. 
			//확장자를 마음대로 지정할 수 있다. 
			
			
			fos = new FileOutputStream("/Users/jimyung/fileOut.html",true);
			
			fos.write('f');
			fos.write('i');
			fos.write('l');
			fos.write('e');
			
			String msg = "fileOutput 예제입니다.\n";
			String msg2 = "여러줄도 가능";
			
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(fos != null) {
				try {
					fos.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
}
