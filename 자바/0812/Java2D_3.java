package ja_0812;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Java2D_3 extends Frame{

	GradientPaint grd;
	Ellipse2D.Double circle;
	
	public Java2D_3 (String title) {
		super(title);
//		
		grd= new  GradientPaint(100, 50, new Color(220,220,255),50,100, Color.black,true);
		//                     시작좌표     시작색                   끝좌표    끝색
		//그라데이션 효과는 시작 좌표의 색이 끝좌표의 색으로 서서히 번지는 효과
		
		circle = new Ellipse2D.Double(50,50,500,500);
		
		setSize(600,600);
		setVisible(true);
		
		
	}
	
	public void paint (Graphics g)
	{
		Graphics2D g2 =(Graphics2D) g;
		
		g2.setPaint(grd);
		g2.fill(circle);
	}
	public static void main(String[] args) {
		new Java2D_3(("2D Test!!!!"));
	}
}
