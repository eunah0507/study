package ja_0804;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class GridLayout_2 extends Frame {

	public GridLayout_2(String title)
	{
		super(title);
		
		setLayout(new GridLayout(3,2));
		
		List list = new List(4,true);
		
		list.add("우면산");
		list.add("지리산");
		list.add("백두산");
		list.add("무등산");
		
		Choice choice = new Choice();
		
		choice.add("튤립");
		choice.add("장미");
		choice.add("해바라기");
		choice.add("백일몽");
		
		add(new Button("Button1"));
		add(list);
		add(choice);
		add(new TextArea("아름다운 사람", 5, 15));
		add(new TextField("TextField"));
		add(new Panel());
		
		
		setSize(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new GridLayout_2("GridLayout Test");
		
	}
}
