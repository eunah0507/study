package ja_0802;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Choice_2 extends Frame{
  
	String[] continent = {"아시아","유럽","아메리카","아프리카","오세아니아"};
    String[] country = {"대한민국", "영국","캐나다","이집트","호주"};
    String[] capital = {"서울","런던","오타와","카이로","캔버라"};
	
	public Choice_2 (String str) {
		super(str);
		setLayout(new FlowLayout());
		
		Label lbl1 = new Label(" 대륙을 선택하세요 ! ");
		Label lbl2 = new Label(" 국가를 선택하세요 ! ");
		Label lbl3 = new Label(" 수도를 선택하세요 ! ");
		
		Choice choice1 = new Choice();
		Choice choice2 = new Choice();
		Choice choice3 = new Choice();
		
		for (int i = 0; i < continent.length; i++) {
			choice1.add(continent[i]);
		}
		for (int i = 0; i < country.length; i++) {
			choice2.add(country[i]);
		}
		for (int i = 0; i < capital.length; i++) {
			choice3.add(capital[i]);
		}
		
		add(lbl1);
		add(choice1);
		add(lbl2);
		add(choice2);
		add(lbl3);
		add(choice3);
		
		setSize(200,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Choice_2("Choice 예제2");
		
		System.out.println("Hello World");
	}
}
