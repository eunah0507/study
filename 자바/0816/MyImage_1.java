package ja_0816;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImage_1 extends JFrame implements ActionListener{

	private int pieces = 5;	//여기서 나눠지는 수 정하는 건가봐~
	private int totalPieces = pieces * pieces;
	private int[] pieceNumber;
	private BufferedImage img;
	
	public MyImage_1() {
		setTitle("Image Draw Test");
		try {
			img = ImageIO.read(new File("src/images/flo_6644_1.jpg"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		pieceNumber = new int[totalPieces];
		for (int i = 0; i < totalPieces; i++) 
		{
			pieceNumber[i]=i;
			
		}
		add(new MyPanel(), BorderLayout.CENTER);
		JButton button = new JButton("DIVIDE");
		
		button.addActionListener(this);
		add(button, BorderLayout.SOUTH);
		setSize(img.getWidth(null)+ 10, img.getHeight(null)+62);
		setVisible(true);
	}
	
	void divide() 
	{
		Random rand = new Random();
		int ri;
		for (int i = 0; i < totalPieces; i++)
		{
			ri= rand.nextInt(totalPieces);
			System.out.println(ri);
			
			int tmp = pieceNumber[i];
			pieceNumber[i]=pieceNumber[ri];
			pieceNumber[ri]=tmp;
			
		}
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			int pieceWidth = img.getWidth(null)/pieces;
			int pieceHeight = img.getHeight(null)/pieces;
			
			for (int x = 0; x < pieces; x++)
			{
				
				int sx = x*pieceWidth; //s= start
				
				for (int y = 0; y < pieces; y++) {
					int sy = y*pieceHeight; 
					int number = pieceNumber[x*pieces +y];
					int dx = (number/pieces)*pieceWidth; //d는 방향 여기에 가져오라는 의미..?
					int dy = (number%pieces)*pieceHeight;
					g.drawImage(img, dx, dy, dx+pieceWidth, dy+pieceHeight,
                                sx, sy, sx+pieceWidth, sy+pieceHeight, null); 
					/*
					 * 이미지 일부분의 크기를 조절하여 그리기
					 * ImageObserver 이미지가 그려지면, 홍보를 받는 객체를 지정하는 매개변수
					 * 주로 this를 사용하거나 null로 통보를 받지 않을 수 있다.
					 */
					
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		new MyImage_1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		divide();
		repaint();
		
	}
	
}
