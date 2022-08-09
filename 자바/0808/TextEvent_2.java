package ja_0808;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextEvent_2 extends Frame {
	
	TextField txt;
	TextArea txt_area;
	
	public TextEvent_2(String title)
	{
		super(title);
		
		addWindowListener(new Handler_2());
		
		txt_area = new TextArea();
		txt = new TextField("", 20);
		
		txt.addTextListener(new Handler());
		txt.addActionListener(new Handler());
		
		txt_area.setFocusable(false); //이건 뭐지?
		
		txt_area.setEditable(false); // 이건 뭐지?
		
		add("North", new Label("글자를 입력하고 Enter"));
		add("Center", txt_area);
		add("South", txt);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextEvent_2("Text Event Test");
	}
	
	class Handler_2 extends WindowAdapter
	{
		public void windowClosing(WindowEvent e) //x창 누르면 꺼지게끔 만든거
		{
			System.out.println("윈도우 닫기");
			System.exit(0); //프로그램 종료 // 숫자는 아무거나 써도 된다. 왜?
		}
	}
	
	class Handler implements ActionListener, TextListener
	{

		@Override
		public void actionPerformed(ActionEvent e) //엔터키를 누르면 ActionEvent가 호출된다.
		{
			txt.setText(""); //초기화
			txt_area.append("\n");
		}

		@Override
		public void textValueChanged(TextEvent e) //글자를 쓰는 순간
		{
			try
			{
				int i = txt.getText().length();
				if (i == 0) 
				{
					return; //메소드 끝낸다
				}
				txt_area.append(" " + txt.getText().charAt(i - 1));
			}
			catch(Exception e2)
			{
				System.out.println(e2.getMessage());
			}
		}
	}
}
