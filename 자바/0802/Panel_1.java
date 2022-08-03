package ja_0802;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Panel_1 {
	public static void main(String[] args) {
	
	Frame ff = new Frame("Panel Test~~");
	
	ff.setSize(600,700);
	ff.setLayout(null);
	
	Panel p1 = new Panel();
	p1.setBackground(new Color(255,178,217));
	p1.setSize(150,100);
	p1.setLocation(50,50);
	
	Panel p2 = new Panel();
	p2.setBackground(new Color(255,178,245));
	p2.setSize(150,100);
	p2.setLocation(50,170);
	
	Panel p3 = new Panel();
	p3.setBackground(new Color(181,178,255));
	p3.setSize(150,100);
	p3.setLocation(50,290);
	
	Panel p4 = new Panel();
	p4.setBackground(new Color(120,150,235));
	p4.setSize(150,100);
	p4.setLocation(220,170);
	
	Button ok = new Button("OK~");
	Label cancel = new Label("CENCLE", Label.CENTER);
	
	p1.add(ok);
	p2.add(new Button("나 버튼"));
	p3.add(new Button("1번"));
	p3.add(new Button("2번"));
	p3.add(new Button("3번"));
	p4.add(new Button("순간이동!"));
	
	ff.add(p1);
	ff.add(p2);
	ff.add(p3);
	ff.add(p4);
	
	ff.setVisible(true);
	}
}
