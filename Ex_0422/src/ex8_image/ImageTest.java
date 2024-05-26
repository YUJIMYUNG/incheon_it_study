package ex8_image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import ex2_Frame.JFrameTest;

public class ImageTest {	
	public static void main(String[] args) {
		
		ImageIcon back = new ImageIcon("src/img/i1.jpeg");
		JLabel ji_back = new JLabel(back);
		ji_back.setBounds(0,0,100,100);
		
		JFrameTest f = new JFrameTest();
		f.setLayout(null);
		f.add(ji_back);
		
	}
}
