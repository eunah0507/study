package ja_0816;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyCarTest_1 extends JFrame{

	public MyCarTest_1() {
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x눌렀을 때 창 닫게 하는 것
		add(new MyPanel());
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		MyCarTest_1 s = new MyCarTest_1();
		
	}
	
	
}

class MyPanel extends JPanel{
	
	BufferedImage img = null;
	int img_x =100, img_y = 100;
	
	public MyPanel() {
		try {
			img = ImageIO.read(new File("src/images/car_2.jpg"));
		} catch (IOException e) {
			System.out.println("no Image");//이미지 없으면 "no Image" 이 메세지가 뜸
			System.exit(1);
		}
		
		addKeyListener(new KeyListener() {

			
			@Override
			public void keyPressed(KeyEvent e) {//키보드 눌린 걸 감지하겠다
				int keycode = e.getKeyCode();
				switch(keycode) {
				case KeyEvent.VK_UP: 
				img_y -= 10; // y축이 -라면 : 아래에서 위로 이동 //숫자를 20으로 바꾸면 10일 때 보다 빠르게 움직임
				break;
				case KeyEvent.VK_DOWN://KeyEvent. 얘 찍었을 때 나오는 많은 '상수값'들이 있음
				img_y += 10;
				break;	
				case KeyEvent.VK_LEFT: // x값과 y값을 같이 움직여주면 대각선 방향으로 이동도 가능하겠지
				img_x -= 10;
				break;		
				case KeyEvent.VK_RIGHT:
				img_x += 10;
				break;
				}
				
				repaint();
				
			}
			@Override
			public void keyReleased(KeyEvent e) {
		
				
			}
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
		});
		
		this.requestFocus(); 
		setFocusable(true);
	}
	
	public void paintComponent(Graphics g) {
		/*
		 * 스윙 컴포넌트가 자신의 모양을 그리는 메소드
		 * 컴포넌트가 그려져야 하는 시점마다 호출**
		 * 크기가 변경되거나, 위치가 변경되거나, 컴포넌트가 가려졌던 것이 사라지는 등 이때 paintComponent가 호출되면서 그림이 그려지는 것
		 */
		super.paintComponent(g);
		g.drawImage(img, img_x,  img_y,null);//사진이 움직이는 게 아니라 달라진 위치에 계속 생기는 것(**)ㅇ0ㅇ...소희씨 천재
	}
}
