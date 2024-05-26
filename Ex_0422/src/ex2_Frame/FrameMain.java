package ex2_Frame;

import javax.swing.JFrame;

public class FrameMain {
	public static void main(String[] args) {
		//방법1
		//JFrameTest f = new JFrameTest(); 
		
		//방법2
		JFrameTest f = new JFrameTest();
		
		
		f.setBounds(300,300,300,200);
		f.setVisible(true);
	}
}
