package ja_0801;

import java.awt.Frame;

public class Frame_3 {
// extends Frame 사용시
//	public Frame_3(String str)
//	{
//	
//		super(str);
//		setSize(300, 300);
//		setVisible(true);
//		
//	}
//	public static void main(String[] args) {
//		new Frame_3("나만의 프레임~");
//	}
	public static void main(String[] args) {
		
		Frame ff = new Frame("나만의 프레임");
		ff.setSize(300, 300);
		ff.setVisible(true);
	}
}
