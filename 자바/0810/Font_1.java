package ja_0810;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class Font_1 {
	public static void main(String[] args) {
		
		XCanvas canvas = new XCanvas();
		
		Frame ff = new Frame("Font Test~`");
		ff.add(canvas);
		
		ff.setSize(400, 300);
		ff.setVisible(true);
		
	}
}

class XCanvas extends Canvas
{
	Font font = null;
	
	public void paint(Graphics g)
	{
		font = new Font("Timesroman", Font.BOLD, 23);
		g.setFont(font);
		g.drawString("비오는 수요일~", 50, 50);
		
		font = new Font("궁서", Font.BOLD | Font.ITALIC, 17);
		g.setFont(font);
		g.setColor(Color.green);
		g.drawString("시원한 강바람을 찾아서~", 50, 120);
		
		font = new Font("돋움", Font.BOLD | Font.ITALIC, 25);
		g.setFont(font);
		g.setColor(new Color(120, 130, 245));
		g.drawString("돌아오는 휴일을 그리면서", 50, 190);
	}
}