package ex6_item;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class JTableTest {
	public static void main(String[] args) {
		//JTable
		//데이터를 테이블 형태인 행과 열로 나타내고자 할 때 사용한다. 
		
		String[] title = {"사번", "이름", "부서"};
		String[][] data = {{"1","홍길동","전산부"},
				{"1","홍길동","전산부"},
				{"1","홍길동","전산부"}};
		
		JTable table = new JTable(data,title);
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane js =  new JScrollPane(table,v,h);
		
		JFrameTest f = new JFrameTest();
		
		f.add(js);
		
	}
}
