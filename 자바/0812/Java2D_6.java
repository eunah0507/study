package ja_0812;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class Java2D_6 extends Frame {

	TexturePaint texture;
	BufferedImage bImg;
	Rectangle2D.Double rect;
	
	public Java2D_6(String title)
	{
		super(title);
		
		Image img = Toolkit.getDefaultToolkit().getImage("src/images/flower1.jpg");
		MediaTracker mt = new MediaTracker(this);
		
		mt.addImage(img, 0); // 이미지가 로드될 때 까지 기다린다.
		
		try 
		{
			mt.waitForAll(); // 각각의 이미지에 대한 로딩 보장
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		bImg = new BufferedImage(img.getWidth(this),
								 img.getHeight(this), BufferedImage.TYPE_3BYTE_BGR);
		
		Graphics2D g2 = bImg.createGraphics();
		
		g2.drawImage(img, 0, 0, this);
		
		Rectangle rect2 = new Rectangle(0, 0, img.getWidth(this), img.getHeight(this));
		
		texture = new TexturePaint(bImg, rect2);
		
		rect = new Rectangle2D.Double(0, 0, 350, 350);
		
		setSize(450, 450);
		setVisible(true);
		
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setPaint(texture);
		g2.fill(rect);
		
		g2.translate(180, 180);
		g2.setColor(Color.red);
		g2.setFont(new Font("Serif", Font.ITALIC, 25));
		
		for (int i = 0; i < 6; i++) 
		{
			//g2.rotate(Math.PI/4);
			g2.rotate(45);
			g2.drawString("Korea", 0, 0);
			
		}
	}
	
	public static void main(String[] args) {
		new Java2D_6("2D Test");
	}
}

//MediaTracker 클래스는 몇개의 미디어 객체 상태를 감시하는 클래스입니다.
//미디어 개체에는 이미지뿐만 아니라 오디오 클립도 포함될 수 있지만 형체는 이미지만 지원됩니다.
//이 식별자는 이미지를 가져오는 우선순위를 제어합니다.