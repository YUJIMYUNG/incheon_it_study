package ex1_file;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		String path = "/Users/jimyung/test.txt";
		File f = new File(path);
		//exists()
		//목적지가 존재하면 true, 없으면 false 
		
		if(!f.exists()) {
			System.out.println("폴더 생성 ");
			//mkdir() -> 폴더 하나만 생성 
			//mkdirs() -> 폴더 한개 또는 여러개 생성 가능 
			//makedirectory 
			f.mkdirs();
			
		}
	}
}
