package ja_0803;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class BorderLayout_1 extends Frame {

	/*
	 * BorderLayout
	 *  
	 *  : 보더레이아웃은 동(East),서(West),남(South),북(North),중앙(Center)으로 화면을 분할합니다.
	 *    중앙에는 중요한 컴포넌틀르 두고, 그 주변에 보조 컴포넌트를 배치할 때 사용합니다.
	 *    Frame 컨테이너의 기본 레이아웃입니다.*/
	
	//BorderLayout bbl = new BorderLayout();
	
	public BorderLayout_1(String title)
	{
		super(title);
	//	setLayout(bbl);
		
		add("North", new Button("북쪽")).setBackground(new Color(120,130,233));
		add("West", new Button("서쪽")).setBackground(new Color(150,180,133));
		add("East", new Button("동쪽")).setBackground(new Color(80,90,133));
		add("Center", new Button("중앙")).setBackground(new Color(250,240,233));
		add("South", new Button("남쪽")).setBackground(new Color(251,130,183));
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new BorderLayout_1("Borderlayout Test");
	}
}
