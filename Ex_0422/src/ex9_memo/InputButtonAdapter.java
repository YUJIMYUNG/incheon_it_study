package ex9_memo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InputButtonAdapter implements ActionListener{
	
	JTextField tf;
	JTextArea ta;
	
	public InputButtonAdapter(JTextField tf, JTextArea ta) {
		this.tf = tf;
		this.ta = ta;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//TextField의 내용을 getText()해서 
		String tfStr = tf.getText();
		
		
		//TextArea로 setText()를 해준다. 
		
		//ta.setText(tfStr);
		
		//텍스트가 이어지게 저장하고싶으면 
		ta.append(tfStr+"\n");
		
		//보내지고 나면 TextField의 내용은 비운다. 
		
		tf.setText("");
		
	}
	
	
	
	
}
