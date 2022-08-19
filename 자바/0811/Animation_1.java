package ja_0811;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Animation_1 extends Frame {
	
	Image[] img = new Image[8];
	int num = 0;
	
	int xx = 10;
	int yy = 30;
	boolean flog = true;
	
	public Animation_1(String title)
	{
		super(title);
		
		for (int i = 0; i < 8; i++) 
		{
			img[i] = Toolkit.getDefaultToolkit().getImage("src/images/bttrfly" + (i +1) + ".jpg");
		}
		
		addWindowListener(new WindowHandler());
		setSize(450, 350);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		if (num > 7) 
		{
			num = 0;
		}
		
		if(flog)
		{
			g.drawImage(img[num++], xx +=10, 100, this);
			
			if (xx > getWidth() -40 ) 
				flog =! flog;
		}
			else
			{
				g.drawImage(img[num++], xx-= 10, 100, this);
				if (xx < 0) 
				flog = !flog;	
				
			}
		
		if(flog)
		{
			g.drawImage(img[num++], 100, yy+=10, this);
			
			if (xx > getWidth() -40 ) 
				flog =! flog;
		}
			else
			{
				g.drawImage(img[num++], 100, yy-=10, this);
				if (xx < 0) 
				flog = !flog;	
				
			}
		
		if(flog)
		{
			g.drawImage(img[num++], xx+=20, yy+=20, this);
			
			if (xx > getWidth() -40 ) 
				flog =! flog;
		}
			else
			{
				g.drawImage(img[num++], xx-=20 , yy-=10, this);
				if (xx < 0) 
				flog = !flog;	
				
			}
		
		}
	
	class WindowHandler extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		Animation_1 ani = new Animation_1("fly~~~~~");
		
		while(true)
		{
			try 
			{
				Thread.sleep(70);
				ani.repaint();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
				break;
			}
		}
	}
}
