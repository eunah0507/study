package ja_0809;

import java.awt.Frame;
import java.awt.Graphics;

public class Graphics_1 extends Frame {
	
	public Graphics_1(String title)
	{
		super(title);
		
		setSize(300, 250);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		g.drawLine(10, 10, 190, 190);
		g.drawRect(10, 35, 100, 100);
		g.drawOval(50, 50, 100, 100); //50,50에 위치해서 100, 100에 맞는 사각형 안에 들어가있는 원을 그리겠다
		g.drawArc(100, 100, 80, 80, 0, 180); //원호를 그리겠다.
	}
	
	public static void main(String[] args) {
		new Graphics_1("Graphics Test");
	}
}
