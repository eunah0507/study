package ja_0804;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardLayout_1 extends Frame {
	
	CardLayout card = new CardLayout();
	Panel[] panel = new Panel[5];
	Color[] color = {Color.red, Color.blue, Color.yellow, Color.green, Color.cyan};
	int x,y;
	
	public CardLayout_1(String str)
	{
		super(str);
		setLayout(card);
		
		MouseHandle mouse = new MouseHandle();
		
		for (int i = 0; i < 5; i++) 
		{
			panel[i] = new Panel();
			panel[i].setBackground(color[i]); 
			panel[i].addMouseListener(mouse); //마우스 이벤트 등록
			
			add((new Integer(i)).toString(), panel[i]);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public class MouseHandle extends MouseAdapter //마우스 이벤트 처리
									//두 개 이상의 메소드를 갖고있다.(implements 를 적으면 5개 다 적어줘야한다.)
	{
		public void mouseClicked(MouseEvent e) //마우스가 클릭될 때
		{
			card.next(CardLayout_1.this);
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args) {
		new CardLayout_1("CardLayout 예제");
	}
	
}


/*
 * CardLayout
 * 
 *   : 카드 레이아웃은 한개의 컴포넌트를 한 개의 컴포넌트로 표현하는
 *     방법입니다. 여러개의 컴포넌트를 여러개의 카드에 배치하는 경우에
 *     각 카드에 이름을 붙여 사용합니다. 해당 카드를 출력할 때, 해당
 *     카드의 이름을 show() 메소드로 출력하거나, first(), last(), next() 등의
 *     메소드를 이용해 화면을 바꿔가며 출력할 수 있습니다.
 *     
 *     .카드 레이아웃을 사용하는 과정
 *     
 *      . setLayout() 메소드를 이용해 카드 레이아웃 등록
 *      . 카드레이아웃에 등록할 Panel을 만든다.
 *      . add() 메소드를 이용해 패널을 컨테이너에 추가한다.
 *      . 원하는 카드를 보여주기 위해서 show(), next(), first(), last() 메소드를 이용한다.
 *      
 *      이벤트를 처리하는 방법 3가지
 *      
 *      1. 핸들을 가지고 있는 익스핸즈드 방법?
 *      2. ??
 *      3. 외부에 별도 클래스를 가지고 있는 방법(조금 까다롭다)
 * */
