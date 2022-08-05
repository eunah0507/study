package ja_0805;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_2 extends Frame implements ActionListener{
	
	TextArea txt_info;
	Button btn1, btn2, btn3;
	
	public ActionEvent_2(String title)
	{
		super(title);
		
		txt_info = new TextArea("--버튼을 눌러주세요");
		btn1 = new Button("◀ 버튼");
		btn2 = new Button("▶ 버튼");
		btn3 = new Button("$ 버튼");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		//this = 리스너를 처리하는 것을 자기자신이 가지고 있다. this가 아닐경우에는 Handler 방식 적용
		
		Panel panel = new Panel();
		panel.add(btn1);
		panel.add(btn3);
		panel.add(btn2);
		
		add("Center", txt_info);
		add("South", panel);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionEvent_2("Action Event Test~~");
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		txt_info.append(e.getActionCommand() + "눌렸습니다. \n");
		//e.getActionCommand = 내용 출력되는 것
		System.out.println(e.getActionCommand() + "눌렸습니다.");
	}
}
