package Ex7_adapter;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JSlider;

import ex2_Frame.JFrameTest;

//어탭터를 이용한 이벤트 처리
//리스너 인터페이스를 구현하기 위해서는 메서드를 반드시 오버라이딩 해야한다. 
//마우스리스너의 경우 메서드가 6개이다. 필요 없어도 구현해야하는 번거로움이 있다. 
//이러한 문제를 해결 해 주는것이 어탭터 클래스이다. 
//어탭터 클래스는 리스너가 가지고 있는 메서드 중 필요한것만 재정의하면 된다. 
//KeyListener -> KeyAdpater
//MouseListener -> MouseAdapter, MousMotionAdapter
//WindowListener -> WindowAdapter

//원하는 어댑터가 없는 경우 직접 만들어서 사용할 수도 있다. 

public class JSliderEvent {
		
	public static void main(String[] args) {
		JSlider jsl = new JSlider();
		
		
		JLabel colorLabel;
		colorLabel = new JLabel("     SLIDER EXAMPLE      ");
		jsl = new JSlider(JSlider.HORIZONTAL,0,255,0);
		jsl.setPaintLabels(true);
		jsl.setPaintTicks(true);
		jsl.setPaintTrack(true);
		jsl.setMajorTickSpacing(50);//큰 눈금
		jsl.setMinorTickSpacing(10);//작은 눈금 
		
		//jsl.addChangeListener(new ChangeListener);
		
		jsl.setForeground(Color.RED);
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(0,jsl.getValue(),0));
		
		JFrameTest f = new JFrameTest();
		f.setLayout(null);
		f.add(jsl);
		f.add(colorLabel);
		
	}
	
	class MyChangeListener implements ChangeListener{
		
	}
}
