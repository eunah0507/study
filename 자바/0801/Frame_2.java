package ja_0801;

import java.awt.Color;
import java.awt.Frame;

public class Frame_2 extends Frame {
	public Frame_2()
	{
		super("아름다운 사람");
		
		setBackground(new Color(100,230,233)); //color.blue 도 쓸 수 있지만 쓰지 않는걸 권장한다.
		setLocation(400,400);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Frame_2();
	}
}