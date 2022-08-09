package ja_0809;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Applet_1 extends Applet {
	
	public void paint(Graphics g)
	{
		for (int i = 0; i < 400; i++) 
		{
			g.setColor(new Color((int)(Math.random()*256),
							    (int)(Math.random()*256),
			      				(int)(Math.random()*256)));
			g.drawOval(10, 10, i, i);
			
			g.drawOval(400-i, 30, i, i);
		}
	}
}
