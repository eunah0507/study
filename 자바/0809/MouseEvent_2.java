package ja_0809;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseEvent_2 extends Frame implements MouseMotionListener {
//mouseEvent는 2가지가 있다. 마우스이벤트와 마우스 모션 이벤트
	
	Label info;
	
	public MouseEvent_2(String title)
	{
		super(title);
		info = new Label();
		
		add("North", info);
		addMouseMotionListener(this);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MouseEvent_2("MouseMotionEvent test");
	}
	@Override
	public void mouseDragged(MouseEvent e) 
	{
		info.setText("마우스 드래그~");
	}

	@Override
	public void mouseMoved(MouseEvent e) //마우스를 누른상태에서 움직이는 것 = 드래그
	{
		info.setText(" X  = " + e.getX() 		  //getXOnScreen : 모니터 속의 X좌표 값	
					+ " XX = " + e.getXOnScreen()
					+ " YY = " + e.getYOnScreen()//getYOnScreen 을 쓰면 Y값이 나온다.
					+ " , Y = " + e.getY());
	}

	// 오버라이드 두 개의 내용을 서로 바꾸면 내용이 조금 바뀌어서 출력된다(해보기)
}
