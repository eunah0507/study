package ja_0803;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextField_3 {
	public static void main(String[] args) {
		
	

	Frame ff = new Frame("Login");
	
	ff.setSize(400,80);
	ff.setLayout(new FlowLayout());
	
	Label lid = new Label("ID" , Label.RIGHT);
	Label lqwd = new Label("Pawword : ", Label.RIGHT);
	
	TextField id = new TextField(10);
	TextField pwd = new TextField(10);
	
	pwd.setEchoChar('*');
	
	lid.setBackground(new Color(150, 150, 150));
	id.setBackground(new Color(150, 150, 115));
	
	ff.add(lid);
	ff.add(id);
	ff.add(lqwd);
	ff.add(pwd);
	
	ff.setVisible(true);
}
}