package ja_0803;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;

public class ScrollPane_1 extends Frame{
	
	public ScrollPane_1(String title)
	//축소할 때 스크롤바가 나타나는 역할 = scrollPane
	{
		super(title);
		
		ScrollPane srp = new ScrollPane();
		
		srp.setSize(220, 200);
		
		Panel panel = new Panel();
		panel.setLayout(new BorderLayout());
		
		TextArea txt = new TextArea("텍스트 에어리어");
		txt.setBackground(Color.green);
		txt.setForeground(Color.red);
		
		Panel panel2 = new Panel();
		panel2.setLayout(new BorderLayout());
		
		TextArea txt2 = new TextArea("텍스트 에어리어222");
		txt2.setBackground(Color.blue);
		txt2.setForeground(Color.cyan);
		
		panel.add("North", new Button("버튼"));
		panel.add("Center", txt);
		panel.add("South", new Button("확인"));
		
		panel2.add("North", new Button("버튼"));
		panel2.add("Center", new TextArea("삼번째방법"));
		panel2.add("South", new Button("확인"));
		
		//srp.add(panel2);
		srp.add(panel);
		//한개만 할 수 있다. 두개를 하면 앞서 했던 것이 사라진다. 
		
		add("Center", srp);
		
		setSize(200, 200);
		setVisible(true);
	}
	
	/*
	 * ScrollPane(스크롤펜)
	 *   : 스크롤펜은 하나의 자식 컴포넌트만을 가질 수 있다.
	 *     따라서 스크롤팬에 여러개의 컴포넌트를 포함시키기 위해서는
	 *     패널에 스크롤팬을 붙이고, 패널 위에 컴포넌트를 붙이는 것이 좋다.*/
	public static void main(String[] args) {
		new ScrollPane_1("test");
	}
}
