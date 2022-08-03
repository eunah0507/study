package ja_0803;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Panel_3 extends Frame {
	
	Panel n,w,e,c,s;
	
	public Panel_3(String title)
	{
		n = new Panel();
		w = new Panel();
		e = new Panel();
		c = new Panel();
		s = new Panel();
		
		n.setBackground(new Color(120, 180, 233));
		w.setBackground(new Color(150, 230, 133));
		e.setBackground(new Color(180, 110, 150));
		c.setBackground(new Color(200, 140, 80));
		s.setBackground(new Color(250, 100, 63));
		
		n.add(new Button("패널1"));
		w.add(new Button("패널2"));
		e.add(new Button("패널3"));
		c.add(new Button("패널4"));
		s.add(new Button("패널5"));
		
		add("North", n);
		add("West", w);
		add("East", e);
		add("Center", s);
		add("South", c);
		
		setSize(500,500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Panel_3("Panel Test!");
	}
}
