package ja_0805;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_3 extends Frame implements ActionListener{
	
	Label lbl_info;
	Button[] btn = new Button[9];
	Color[] color = {Color.red, Color.orange, Color.yellow,
					 Color.green, Color.magenta, Color.cyan, Color.gray,
					 new Color(0,0,0), new Color(255, 255, 255)};
	String[] string = {"Red", "Orange", "Yellow", "Green", "Magenta", "Cyan", "Gray"
						, "Black", "White"};
	
	
	public ActionEvent_3(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		
		for (int i = 0; i < 9; i++) 
		{
			btn[i] = new Button(string[i]);
			btn[i].setForeground(color[i]);
			btn[i].addActionListener(this);
			
			add(btn[i]);
		}
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionEvent_3("Action Event Test~~");
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//Button obj = (Button)e.getSource();
		
		Object obj = e.getSource();
		
		for (int i = 0; i < 9; i++) 
		{
			if(obj == btn[i])
			{
				this.setBackground(color[i]);
			}
			System.out.println(e.getActionCommand() + "눌렸습니다.\n");
		}
	}

}
