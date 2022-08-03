package ja_0802;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.util.Iterator;

public class Checkbox_2 extends Frame {

	Checkbox cbx1, cbx2, cbx3, cbx4;
	Checkbox cbx11, cbx22, cbx33, cbx44;
	Checkbox cbx12, cbx13, cbx14;
	CheckboxGroup  cbg, cbg2, cbg3;
	
	public Checkbox_2(String str){
		super(str);
		setLayout(new FlowLayout());
		
		Label lbl= new Label(" 좋아하는 계절은 ", Label.CENTER);
		lbl.setBackground(new Color(255,255,10));
		add(lbl);
		
		cbg = new CheckboxGroup();
		//라디오 버튼을 만들기 위해서는 체크박스를 CheckboxGroup으로 묶어야
		//하기 때문에 CheckboxGroup 클래스 객체를 생성해서 사용한다
		//checkbox 매개 변수로
		//CheckboxGroup 클래스 객체 사용
		
		cbx1 = new Checkbox("봄", cbg,false);
		cbx2 = new Checkbox("여름", cbg, true);
		cbx3 = new Checkbox("가을", cbg, true);
		cbx4 = new Checkbox("겨울", cbg, true);
		
		add(cbx1);
		add(cbx2);
		add(cbx3);
		add(cbx4);
		
		
		Label lbl2 = new Label(" 좋아하는 산이름 ", Label.CENTER);
		lbl2.setBackground(new Color(255,224,140));
		add(lbl2);
		
		cbg2 = new CheckboxGroup();
		
		cbx11 = new Checkbox("지리산", cbg2, false);
		cbx22 = new Checkbox("무등산", cbg2, true);
		cbx33 = new Checkbox("한라산", cbg2, false);
		cbx44 = new Checkbox("북한산", cbg2, false);
		
		add(cbx11);
		add(cbx22);
		add(cbx33);
		add(cbx44);
		
		Label lbl3= new Label(" 좋아하는 꽃이름은 ", Label.CENTER);
		lbl3.setBackground(new Color(171,242,0));
		add(lbl3);
	
        cbg3 = new CheckboxGroup();
		
		cbx12 = new Checkbox("장미", cbg3, false);
		cbx13 = new Checkbox("해바라기", cbg3, false);
		cbx14 = new Checkbox("매화", cbg3, true);
		
		add(cbx12);
		add(cbx13);
		add(cbx14);

		
	    setSize(250,200);
	    setVisible(true);
	
}
	public static void main(String[] args) {
		new Checkbox_2("라디오 버튼 테스트~~");
	}
}
