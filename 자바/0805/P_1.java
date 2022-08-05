package ja_0805;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P_1 extends Frame implements ActionListener{
	
	Label lbl_info;
	Button[] btn = new Button[9];
	Color[] color = {Color.red, Color.orange, Color.yellow,
					 Color.green, Color.magenta, Color.cyan, Color.gray,
					 new Color(0,0,0), new Color(255, 255, 255)};
	
	String[] string = {"Red", "Orange", "Yellow", "Green", "Magenta", "Cyan", "Gray"
						, "Black", "White"};
	
	Panel panel1, panel2, panel3, panel4, panel5;
	
	public P_1(String title)
	{
		super(title);
		
		panel1 = new Panel();
		panel2 = new Panel();
		panel3 = new Panel();
		panel4 = new Panel();
		panel5 = new Panel();
		
		panel4.setLayout(new GridLayout(1,3));
		
		for (int i = 0; i < 9; i++) 
		{
			btn[i] = new Button(string[i]);
			btn[i].setForeground(color[i]);
			btn[i].addActionListener(this);
			
			panel5.add(btn[i]);
		}
		
		panel4.add(panel1);
		panel4.add(panel2);
		panel4.add(panel3);
		
		add("North", panel5);
		add(panel4);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new P_1("Action Event Test~~");
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
				panel1.setBackground(color[i]);
				panel2.setBackground(color[(i+1)%9]);
				panel3.setBackground(color[(i+2)%9]);
			}
			System.out.println(e.getActionCommand() + "눌렸습니다.\n");
		}
	}

}
