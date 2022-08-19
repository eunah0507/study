package ja_0811;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class JRadio_1 extends JFrame {
	
	JCheckBox win, linux, solaris;
	JRadioButton river1, river2, river3;
	
	public JRadio_1(String title)
	{
		super(title);
		
		getContentPane().setLayout(new FlowLayout());
		win = new JCheckBox("윈도우", false);
		linux = new JCheckBox("리눅스", true);
		solaris = new JCheckBox("솔라리스", false);
		
		ButtonGroup group2 = new ButtonGroup();
		river1 = new JRadioButton("한강", true);
		river2 = new JRadioButton("두만강", false);
		river3 = new JRadioButton("영산강", false);
		
		group2.add(river1);
		group2.add(river2);
		group2.add(river3);
		
		getContentPane().add(win);
		getContentPane().add(linux);
		getContentPane().add(solaris);
		
		getContentPane().add(new JLabel("                     "));
		getContentPane().add(river1);
		getContentPane().add(river2);
		getContentPane().add(river3);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JRadio_1("Checkbox & Radio Button Test~ ");
	}
}

/*
 * ButtonGroup
 *  스윙의 모든 버튼을 그룹화 할 수 있습니다.
 *  JRadioButton등을 이용해 하나만 선택해야 할 경우 많이 쓰입니다.
 *  ButtonGroup bg = new ButtonGroup();
 *  bg.add(rButton1); // 그룹에 버튼 추가 - 논리적 추가
 *  this.add(rButton1); // 실질적 패널에 버튼 추가 */
