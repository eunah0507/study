package ja_0810;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Image_1 extends Frame {
	
	Image img;
	
	String ss = "src/images/flower2.jpg";
	
	public Image_1(String title)
	{
		super(title);
		
		img = Toolkit.getDefaultToolkit().getImage(ss);
		
		addWindowListener(new Handler());
		
		setSize(450, 550);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(img, 0, 0, this);
	}
	
	class Handler extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new Image_1("Image TEST");
	}
}
