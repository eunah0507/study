package ja_0804;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardLayout_2 {
	public static void main(String[] args) {
		
		final Frame ff = new Frame("CardLayoutTtest");
		final CardLayout card = new CardLayout(10, 20); // 여백설정 10은 좌우, 20은 상하여백
		
		ff.setLayout(card);
		
		Panel card_1 = new Panel();
		card_1.setBackground(Color.yellow);
		card_1.add(new Label("*****Card_1*****"));
		
		Panel card_2 = new Panel();
		card_2.setBackground(Color.green);
		card_2.add(new Label("@@@ Card_22 @@"));
		
		Panel card_3 = new Panel();
		card_3.setBackground(Color.cyan);
		card_3.add(new Label("&&&& Card_333 &&&&&"));
		
		ff.add(card_1, "1");
		//Frame에 card_1을 "1"이라고 이름을 붙여 추가
		ff.add(card_2, "2");
		ff.add(card_3, "3");
		
		class Handler extends MouseAdapter
		{
			public void mouseClicked(MouseEvent e)
			{
				System.out.println(e.toString());
				
				// 마우스 오른쪽 버튼이 눌렸을 때
				// if(e.getModifiers()==e.BUTTON3_MASK) {
				if (e.getButton()==e.BUTTON3) 
				{
				card.previous(ff);	//CardLayout의 이전 Panel을 보여줌
				}
				else 
				{
					card.next(ff); //CardLayout의 이후 Panel을 보여줌
				}
			}
		} // class Handler
		
		card_1.addMouseListener(new Handler());
		card_2.addMouseListener(new Handler());
		card_3.addMouseListener(new Handler());
		
		ff.setSize(300, 300);
		ff.setLocation(300, 400);
		ff.setVisible(true);
	}
}
