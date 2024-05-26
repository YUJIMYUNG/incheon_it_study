package ex3_JButton;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import ex2_Frame.JFrameTest;

public class Ex1_JButton {
	public static void main(String[] args) {
		
		//JButton jbtn1, jbtn2, jbtn3, jbtn4;
//		jbtn1 = new JButton("입력");
//		jbtn1 = new JButton("확인");
//		jbtn1 = new JButton("옵션");
//		jbtn1 = new JButton("메시지");
		
		
		String[] msg = {"입력", "확인", "옵션", "메시지"};
		JButton[] btn = new JButton[4];
		
		
		//버튼생성 
		//버튼의 갯수가 많아질수록 버튼 생성하는데 편함
		for(int i = 0; i<btn.length ; i++) {
			btn[i] = new JButton(msg[i]);
		}
		//프레임 생성 
		JFrameTest f = new JFrameTest();
		
		for(int i = 0; i < btn.length ; i++) {
			f.add(btn[i]);
		}
		
		//이벤트 생성 
		ActionListener al = new ActionListener() { //인터페이스라서 객체 생성 불가
			
			@Override
			public void actionPerformed(ActionEvent e) { //익명클래스 만들기
				//getActionCommand()
				//버튼에 쓰여져있는 문자열을 반환 
				
				switch(e.getActionCommand()) {
				case "입력":
					String name = JOptionPane.showInputDialog(f,"이름을 입력하세요.");
					System.out.println(name);
					break;
				case "확인":
					int con = JOptionPane.showConfirmDialog(f, "확인?");
					System.out.println(con);
					break;
				case "옵션":
					String[] option = {"검색", "추가", "취소"};
					JOptionPane.showOptionDialog(f, e, name, con, con, null, option, e)
					
					break;
				case "메시지":
					
					break;
				}
				
			}
		};
		
		
		
		
		//버튼에 이벤트를 부착
		for(int i = 0; i <btn.length ; i++) {
			btn[i].addActionListener(al);
		}
		
		//각 버튼마다 이벤트 부여도 가능 
//		btn[0].addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		
		
		
		
	}
}
