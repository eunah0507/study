package ja_0808;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckboxTest_1 extends Frame{
	
	Label q1, q2, q3;
	Label score;
	
	Checkbox q1cb1, q1cb2, q1cb3, q1cb4;
	Checkbox q2cb1, q2cb2, q2cb3, q2cb4;
	Checkbox q3cb1, q3cb2, q3cb3, q3cb4;
	
	CheckboxGroup group;
	Button end;
	
	public CheckboxTest_1(String title)
	{
		super(title);
		
		setSize(500, 300);
		setLayout(new GridLayout(18, 1));
		
		q1 = new Label("1. 다음 중 ActionEvent 의 " + "actionPerformed() 메소드가 호출되는 경우는?");
		
		q2 = new Label("2. Frame의 기본 LayoutManger는 (하나만 고르시오)");
		group =new CheckboxGroup();
		q2cb1 = new Checkbox("FlowLayout", group, false);
		q2cb2 = new Checkbox("GridLayout", group, false);
		q2cb3 = new Checkbox("BorderLayout", group, false);
		q2cb4 = new Checkbox("CardLayout", group, false);
		
		q3 = new Label("3. 문제");
		q3cb1 = new Checkbox("FlowLayout", group, false);
		q3cb2 = new Checkbox("GridLayout", group, false);
		q3cb3 = new Checkbox("BorderLayout", group, false);
		q3cb4 = new Checkbox("CardLayout", group, false);
		
		score = new Label("**** 결과 *****");
		end = new Button("이 버튼을 누르면 결과를 알 수 있습니다.");
		end.setBackground(Color.green);
		
		end.addActionListener(new ActionListener()
		{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			float totalScore = 0.0f;
			//세미콜론을 지우면 점수가 제대로 나온다.
			if (q1cb1.getState()); totalScore += 12.5f;  
			if (q1cb2.getState()); totalScore += 12.5f;  
			if (q1cb3.getState()); totalScore += 12.5f;  
			if (q1cb4.getState()); totalScore += 12.5f;  

			if (q2cb3.getState()); totalScore += 25.5f;  
			if (q3cb3.getState()); totalScore += 25.5f;  
			
			score.setText("당신의 점수는 : " + totalScore + "점입니다.");
		}
		});
	
	add(q1);
	add(q1cb1);
	add(q1cb2);
	add(q1cb3);
	add(q1cb4);
	add(new Label(""));
	add(q2);
	add(q2cb1);
	add(q2cb2);
	add(q2cb3);
	add(q2cb4);
	add(new Label(""));
	add(q3);
	add(q3cb1);
	add(q3cb2);
	add(q3cb3);
	add(q3cb4);
	add(new Label(""));	
	
	add(end);
	add(score);
	setVisible(true);
}

public static void main(String[] args) {
	new CheckboxTest_1("Score Test");
	}
}
