package ja_0803;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class TextField_2 extends Frame {

	public TextField_2(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		
		TextArea txt1 = new TextArea(10, 30);
		TextField txt2 = new TextField("안녕하세요" , 20);
		
		txt1.setText("문자열 입력~");
		txt1.setBackground(new Color(60, 120, 210));
		txt1.setFont(new Font("궁서체", Font.ITALIC| Font.BOLD, 17));
		txt1.setForeground(new Color(150,150,150));
		
		txt2.setEchoChar('*');
		txt2.setForeground(new Color (150, 150, 150));
		
		add(txt1);
		add(txt2);
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TextField_2("TextArea test~~");
	}
}
