package ja_0802;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Frame_5 {
public static void main(String[] args) {
	
	Frame ff = new Frame("노란색");
	Frame ff2 = new Frame("초록색");
	Frame ff3 = new Frame("파란색");
	Frame ff4 = new Frame("분홍색");
	Frame ff5 = new Frame("검은색");
	
	
	ff.setSize(400,300);
	ff2.setSize(400,300);
	ff3.setSize(400,300);
	ff4.setSize(400,300);
	ff5.setSize(400,300);
	
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	//구현된 Toolkit객체를 얻는다
	
	Dimension screenSize = tk.getScreenSize();
	//화면의 크기를 구한다
	
	
	//Frame : 왼쪽 위의 점을 기준으로 생긴 사각형
	//별다른 위치지정이 없었을 경우는 화면의 (0,0)의 위치에 생긴다.
	ff2.setLocation(0,0);
	//화면 크기의 절반값에서 Frame 크기의 절반 값을 뺀 위치로 하면
	//Frame이 화면 가운데 위치하게 된다.
	//정중앙 (화면너비/2 - Frame너비/2,  화면높이/2 - Frame높이/2)
	ff3.setLocation(screenSize.width / 2  - 200, screenSize.height / 2 - 150);
	
	// 화면을 4분할 했을 때, 각 칸에서의 중앙.
	ff4.setLocation(screenSize.width / 4*3 - 200, screenSize.height / 4 - 200);
	ff5.setLocation(screenSize.width / 4  - 200, screenSize.height / 4*3 - 150);
	
	
	
	ff.setBackground(new Color(255,255,0));
	ff2.setBackground(new Color(29,219,22));
	ff3.setBackground(new Color(0,0,255));
	ff4.setBackground(new Color(255,0,120));
	ff5.setBackground(new Color(1,1,1));
	
	ff.setVisible(true);
	ff2.setVisible(true);
	ff3.setVisible(true);
	ff4.setVisible(true);
	ff5.setVisible(true);
	
	
}
}
