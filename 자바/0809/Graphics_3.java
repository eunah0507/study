package ja_0809;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Graphics_3 extends Frame {
	
	public Graphics_3(String title)
	{
		super(title);
		XCanvas grr = new XCanvas();
		
		grr.setSize(300, 300);
		add("Center", grr);
		
		setSize(350, 350);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Graphics_3("Grahics Test");
	}
}

class XCanvas extends Canvas //그래픽을 그릴 수 있는 클래스
{
	int[] point_x1 = {10, 20, 50, 10, 100};
	int[] point_y1 = {20, 70, 100, 150, 100};
	
	int[] point_x2 = {100, 10, 190};
	int[] point_y2 = {110, 200, 200};
	
	int[] point_x3 = {150, 200, 200, 150}; 
	int[] point_y3 = {150, 150, 200, 200};
	// 순서 잘 파악해서 그리기!
	
	public void paint(Graphics g)
	{
		g.drawPolygon(point_x1, point_y1, 5); //꼭짓점이 5개인 도형
		g.fillPolygon(point_x2, point_y2, 3);
		g.fillPolygon(point_x3, point_y3, 4);
		
		g.setColor(new Color(100, 120, 245));
		g.fillPolygon(point_x3, point_y3, 4);
	}
}
