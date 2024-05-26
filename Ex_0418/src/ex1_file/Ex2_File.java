package ex1_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = "/Users/jimyung";
		
		File f = new File(path);
		
		//isDirectory()
		//최종 목적지가 폴더면 true, 아니면 false 
		if(f.isDirectory()) {
			//list()
			//경로 하위에 있는 목록의 이름을 문자열 배열로 반환 
			String[] list = f.list();
			
			for(String s : list) {
				System.out.println(s);
			}
		}
		
	}
}
