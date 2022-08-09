package ja_0808;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Focus_1 extends Frame implements FocusListener{
	
	Button btn_1, btn_2;
	TextArea txt_info;
	
	public Focus_1(String title)
	{
		super(title);
		
		txt_info = new TextArea();
		btn_1 = new Button("왼쪽 버튼");
		btn_2 = new Button("오른쪽 버튼");
		
		btn_1.addFocusListener(this);
		btn_2.addFocusListener(this);
		
		Panel panel = new Panel();
		panel.add(btn_1);
		panel.add(btn_2);
		
		add("Center", txt_info);
		add("South", panel);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Focus_1("Focus Event Test");
	}
	@Override
	public void focusGained(FocusEvent e)
	{
		Button obj = (Button) e.getSource();
		
		if (obj == btn_1) 
		{
			txt_info.append(btn_1.getLabel() + "포커스 얻음 \n");
		}
		else
		{
			txt_info.append(btn_2.getLabel() + "포커스 얻음 ~~ \n");
		}
	}

	@Override
	public void focusLost(FocusEvent e) 
	{
		Button obj = (Button)e.getSource();
		
		if (obj == btn_1) 
		{
			txt_info.append(btn_1.getLabel() + "포커스 잃음 \n");
		}
		else
		{
			txt_info.append(btn_2.getLabel() + "포커스 잃음 !! \n");
		}
	}
	

}
