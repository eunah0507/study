package ja_0816;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ball_1 extends JPanel{

	static final int BOARD_WIDTH = 600;
	static final int BOARD_HEIGHT= 300;
	private Ball ball = new Ball();
	private Ball2 ball2 = new Ball2();
	private Ball3 ball3 = new Ball3();
	
	public Ball_1() {
		this.setBackground(Color.yellow);
		Runnable task = ()-> {
			while(true) {
				ball.update();
				ball2.update();
				ball3.update();
				
				/*
				 * 람다식을 이용하여서 Runnable 객체를 생성한다.
				 * 무한루프를 돌면서 공의 위치를 변경하고 화면에 다시 그린다. 50밀리초 동안 쉰다.				 			 
				 */
				
				repaint();
				try {
					Thread.sleep(50);
				} catch (InterruptedException ignore) {
					
				}
			}
		};
		new Thread(task).start();
		}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		ball.draw(g);
		ball2.draw(g);
		ball3.draw(g);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(Ball_1.BOARD_WIDTH, Ball_1.BOARD_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Ball_1());
		frame.setVisible(true);
		
	}		
	
}
class Ball{
	//공의 속성은 위치,크기,속도이다.
	
	private int x = 100;
	private int y = 100;
	private int size = 30;
	private int xspeed = 10;
	private int yspeed = 10;
	
	//공을 화면에 그려주는 메소드이다.
	
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(x, y, size, size);
	}
	
	public void update() {
		x += xspeed;
		y += yspeed;
		if ((x+size)>Ball_1.BOARD_WIDTH -size || x<0)
		{
			xspeed = -xspeed;
			
		}
		if ((y+size)>Ball_1.BOARD_HEIGHT -(size+15) || y<0)
		{
			yspeed = -yspeed;
			
		}
	}
}
class Ball2{
	//공의 속성은 위치,크기,속도이다.
	
	private int x = 250;
	private int y = 170;
	private int size = 20;
	private int xspeed = 15;
	private int yspeed = 8;
	
	//공을 화면에 그려주는 메소드이다.
	
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(x, y, size, size);
	}
	
	public void update() {
		x += xspeed;
		y += yspeed;
		if ((x+size)>Ball_1.BOARD_WIDTH -size || x<0)
		{
			xspeed = -xspeed;
			
		}
		if ((y+size)>Ball_1.BOARD_HEIGHT -(size+10) || y<0)
		{
			yspeed = -yspeed;
			
		}
	}
}
class Ball3{
	//공의 속성은 위치,크기,속도이다.
	
	private int x = 200;
	private int y = 160;
	private int size = 30;
	private int xspeed = 8;
	private int yspeed = 20;
	
	//공을 화면에 그려주는 메소드이다.
	
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval(x, y, size, size);
	}
	
	public void update() {
		x += xspeed;
		y += yspeed;
		if ((x+size)>Ball_1.BOARD_WIDTH -size || x<0)
		{
			xspeed = -xspeed;
			
		}
		if ((y+size)>Ball_1.BOARD_HEIGHT -(size+10) || y<0)
		{
			yspeed = -yspeed;
			
		}
	}
}
/*
 * package ja_0816;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ball_1 extends JPanel {
   static final int BOARD_WIDTH = 600;
   static final int BOARD_HEIGHT = 400;
   private Ball ball = new Ball();
   private Ball2 ball2 = new Ball2();

   public Ball_1() {
      this.setBackground(Color.YELLOW);
      Runnable task = () -> {
         while (true) {
            ball.update();
            ball2.update();

       //   람다식을 이용하여서 Runnable 객체를 생성한다.
      //   무한루프를 돌면서 공의 위치를 변경하고 화면에 다시 그린다. 50 밀리초 동안 쉰다. 
      
            repaint();
            try {
               Thread.sleep(50);
            } catch (InterruptedException ignore) {
            }
         }
      };
      new Thread(task).start();
   }

   @Override
   protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      ball.draw(g);
      ball2.draw(g);

   }

   public static void main(String[] args) {
      JFrame frame = new JFrame();
      frame.setSize(Ball_1.BOARD_WIDTH, Ball_1.BOARD_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.add(new Ball_1());
   }
}

class Ball {

   // 공의 속성은 위치, 크기, 속도이다.
   private int x = 100;
   private int y = 100;
   private int size = 30;
   private int xSpeed = 10;
   private int ySpeed = 10;

   // 공을 화면에 그려주는 메소드이다.

   public void draw(Graphics g) {
      g.setColor(Color.RED);
      g.fillOval(x, y, size, size);
   }

   public void update() {
      x += xSpeed;
      y += ySpeed;
      if ((x + size) > Ball_1.BOARD_WIDTH - size || x < 0) {
         xSpeed = -xSpeed;
      }
      if ((y + size) > Ball_1.BOARD_HEIGHT - (size + 15) || y < 0) {
         ySpeed = -ySpeed;
      }
   }
}

class Ball2 {

   // 공의 속성은 위치, 크기, 속도이다.
   private int x = 250;
   private int y = 170;
   private int size = 20;
   private int xSpeed = 15;
   private int ySpeed = 8;

   // 공을 화면에 그려주는 메소드이다.

   public void draw(Graphics g) {
      g.setColor(Color.green);
      g.fillOval(x, y, size, size);
   }

   public void update() {
      x += xSpeed;
      y += ySpeed;
      if ((x + size) > Ball_1.BOARD_WIDTH - size || x < 0) {
         xSpeed = -xSpeed;
      }
      if ((y + size) > Ball_1.BOARD_HEIGHT - (size + 10) || y < 0) {
         ySpeed = -ySpeed;
      }
   }
}


*/
