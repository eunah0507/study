package ja_0809;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScrollbarFrameTest {
	public static void main(String[] args) {
		
		MyFrame ff = new MyFrame("My Speed~");
		
		Graphics gg = ff.getGraphics();
		gg.setColor(Color.red);
		
		for (int i = 0; true; i+= ff.speed) //ff.speed 만큼 빨라진것이다.
			//true > 조건식 , 무한루프를 뜻한다
		{
			try 
			{
				Thread.sleep(100);	
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}	
		
		gg.clearRect(0, 0, 350, 400);//이 문장이 없다면 글자가 중첩되어서 나온다. > 즉, 화면을 지우고 쓰겠다는 것
		gg.drawString("정은아", 150, i); // 150이 x, i가 y값, 서로 바꿔주면 상하 > 좌우로 바뀌어 나온다
		
		i = (i<350) ? i : 0;
		}
	}
}

class MyFrame extends Frame
{
	int speed = 1;
	
	Scrollbar sbb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 15, 0, 95); 
	//15부터 95까지 스크롤이 움직인다. 80의값을 갖는다
	
	Label lSpeed = new Label("Speed : 1");
	
	public MyFrame(String title)
	{
		super(title);
		
		lSpeed.setBackground(Color.green);
		lSpeed.setSize(70, 20);
		lSpeed.setLocation(20, 40);
		
		sbb.setSize(300, 20);
		sbb.setLocation(20, 250);
		
		add(sbb);
		add(lSpeed);
		
		sbb.addAdjustmentListener(new MyHandler()); //스크롤바에 이벤트를 달았다.
		
		addWindowListener(new MyHandler()); //프레임에 이벤트를 달았다
		
		setSize(350, 350);
		setLayout(null); //보더레이아웃이 아니다
		setVisible(true);
		setResizable(false); //사이즈를 바꾸지 못하게 하겠다.
	}
	
	class MyHandler extends WindowAdapter implements AdjustmentListener
	{

		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) 
		{
			speed = sbb.getValue();
			lSpeed.setText("Speed : " + speed);
		}
		
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}
}