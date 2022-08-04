package ja_0804;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Calc_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("계산기");
		TextField tf = new TextField("0");
		tf.setEnabled(false);
		
		ff.setSize(210, 180);
		ff.setLocation(400, 300);
		
		ff.add("North", tf);
		Panel numPanel = new Panel();
		Button[] numButtons = null;
		numPanel.setLayout(new GridLayout(4, 5, 5, 5));
		numPanel.setBackground(Color.LIGHT_GRAY);
		
		ff.add("Center", numPanel);
		
		String[] numStr = { "7", "8", "9", "/",	"CE", 
							"4", "5", "6", "*", "BS",
							"1", "2", "3", "-", "1/x",
							"0","+/-", ".", "+", "="};
		
		numButtons = new Button[numStr.length];
		
		for (int i = 0; i < numStr.length; i++) 
		{
		numButtons[i] = new Button(numStr[i]);
		numButtons[i].setForeground(Color.blue);
		numPanel.add(numButtons[i]);
		}
		
		ff.setResizable(true); //false이면 사이즈가 늘어나거나 줄어들지 않는다. 기본값이 true
		ff.setVisible(true);
		}
	}
