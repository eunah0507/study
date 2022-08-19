package ja_0816;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Fractal_1 extends JFrame{

	public Fractal_1() {
		setSize(800,700);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	/*
	 * 고사리의 잎 윤곽이나 나무가 가지를 뻗는 양상,
	 * 리아스식 해안선의 모양 등 많은 것들이 자기유사성을 가지고 있다.
	 * 심지어 주식의 변동 곡선도 하루 동안의 변화, 한 주 사이의 변화,
	 * 한 달, 1년 사이의 변화가 비슷한 형태로 나타나는 자기 유사성을 띄고 있다.
	 * 이러한 프랙탈의 자기복제적인 특징들은 아주 간단한 법칙도 되먹임하면
	 * 복잡한 양상을 이끌어낼 수 있음을 보여주고 있다.
	 */
	int aal = 0;
	
	private void drawTree(Graphics g, int x1, int y1, double angle, int depth) 
	{
		if (depth==0) 		
			return;
			
			
		int xx1 = (int) (Math.random()*25 +1);
		int yy1 = (int) (Math.random()*25 +1);
//		aal = (int) (Math.random()*180+1);
		int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth *xx1);
		int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth *yy1);
		g.drawLine(x1, y1, x2, y2);
		drawTree(g, x2, y2, angle-20, depth-1);
		drawTree(g, x2, y2, angle+20, depth-1);
		drawTree(g, x2, y2, angle+20, depth-1);		
		
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		drawTree(g, 500, 600, -90, 10);
		
	}
	public static void main(String[] args) {
		new Fractal_1();
	}
}
