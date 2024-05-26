package ex9_memo;

import java.util.function.DoubleConsumer;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextAdapter implements DocumentListener{
	JTextField tf;
	JButton btn_input;
	
	//데이터 정보 다른 클래스로 가져오는 법 
	//1. 생성자의 파라미터로 넘긴다. 
	public TextAdapter(JTextField tf, JButton btn_input) {
		this.tf = tf;
		this.btn_input = btn_input;
	}
	//2. 메서드의 파라미터로 넘긴다. 
	
	
	
	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		change();
	}
	
	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		change();
	}
	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		change();
	}
	
	
	public void change() {
		if(tf.getText().length() == 0) btn_input.setEnabled(false);
		else btn_input.setEnabled(true);
	}
}
