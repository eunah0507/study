package ja_0801;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Button_1_1 {
	public static void main(String[] args) {
		
		Button btn1, btn2, btn3;
		
		Frame ff = new Frame("가위바위보");
	
			ff.setLayout(new FlowLayout());
			
			btn1 = new Button("가위");
			btn2 = new Button("바위");
			btn3 = new Button("보");
			
			ff.add(btn1);
			ff.add(btn2);
			ff.add(btn3);
			
			ff.setSize(300, 300);
			ff.setVisible(true);
		
	}
}
