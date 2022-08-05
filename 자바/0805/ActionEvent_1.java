package ja_0805;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_1 extends Frame implements ActionListener {
	
	Label lbl_info;
	Button btn1, btn2, btn3;
	
	public ActionEvent_1(String title)
	{
		super(title);
		
		lbl_info = new Label("버튼을 눌러주세요.");
		btn1 = new Button("◀ Button");
		btn2 = new Button("●");
		btn3 = new Button("▶ Button");
		
		btn1.addActionListener(this); // 이 버튼에서 이벤트가 발생하면 처리하겠다.
		btn2.addActionListener(this);
		btn3.addActionListener(this); 
		
		Panel panel = new Panel(); //패널은 기본적으로 flowlayout이라 왼쪽으로 정렬배치된다.
		
		panel.add(btn1);
		panel.add(btn2); //동그라미를 가운데에 넣을거니까 두번째로 넣어줘야한다.
		panel.add(btn3);
		
		add("Center", panel);
		add("South", lbl_info);
		
		setSize(300, 200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ActionEvent_1("ActionEvent test~");
	}
	@Override //ActionListener implements 해서 나온 오버라이딩
	public void actionPerformed(ActionEvent e) 
	{
		Object obj = e.getSource();  // 이벤트가 발생한 개체
		
		if ((Button) obj == btn1) 
		{
			lbl_info.setText("왼쪽 버튼이 눌렸습니다.");
			System.out.println("왼쪽 버튼이 눌렸습니다.");
		}
		else if((Button) obj == btn2)
		{
			lbl_info.setText("가운데 버튼이 눌렸습니다.");
			System.out.println("가운데 버튼이 눌렸습니다.");
		}
		else 
		{
			lbl_info.setText("오른쪽 버튼이 눌렸습니다.");
			System.out.println("오른쪽 버튼이 눌렸습니다.");
		}
	}

}
