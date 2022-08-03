package ja_0802;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Checkbox_3 extends Frame{
//체크박스는 기본적으로 다중선택
//하나만 선택하고 싶을 땐 CheckboxGroup설정
	Checkbox os1, os2, os3;
	Checkbox cu1, cu2, cu3;
	CheckboxGroup cbg1, cbg2;
	
	public Checkbox_3 (String str){
		super(str);
		setLayout(new FlowLayout());
		
		Label  lbl1  = new Label("설치되어 있는 OS선택(복수)", Label.CENTER);
		add(lbl1);
		
		os1 = new Checkbox("윈도우 98", true);
		os2 = new Checkbox("윈도우 2000", false);
		os3 = new Checkbox("윈도우 xp"); // 기본값 : false
		
		add(os1);
		add(os2);
		add(os3);
		
		Label  lbl2  = new Label("컴퓨터 CPU종류 선택)", Label.CENTER);
		add(lbl2);
		
		lbl1.setBackground(new Color(250,237,125));
		lbl2.setBackground(new Color(206,241,212));
		
		cbg1 = new CheckboxGroup();
		
		cu1 = new Checkbox("팬티엄4",cbg1,  false);
		cu2 = new Checkbox("에슬론 XP",cbg1, true);
		cu3 = new Checkbox("튜얼코어",cbg1, false);
		
		add(cu1);
		add(cu2);
		add(cu3);
		
		setSize(460,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Checkbox_3("체크박스 테스트~~~");
	}
}
