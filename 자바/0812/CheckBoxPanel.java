package ja_0812;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxPanel extends JPanel implements ItemListener {

	JCheckBox[] buttons = new JCheckBox[4];
	String[] fruits = {"apple", "grape", "orange", "watermelon"};
	JLabel[] pictureLable = new JLabel[4];
	ImageIcon[] icon = new ImageIcon[4];
	
	public CheckBoxPanel()
	{
		super(new GridLayout(0, 5));
		
		// 체크박스 생성
		for (int i = 0; i < 4; i++) 
		{
			buttons[i] = new JCheckBox(fruits[i] + ".gif");
			buttons[i].addItemListener(this);
			pictureLable[i] = new JLabel(fruits[i] + ".gif");
			icon[i] = new ImageIcon("src/images/" + fruits[i] + ".gif");
		}
		
		JPanel checkPanel = new JPanel(new GridLayout(0, 1));
		for (int i = 0; i < 4; i++) 
			checkPanel.add(buttons[i]);
			
			add(checkPanel);
			add(pictureLable[0]);
			add(pictureLable[1]);
			add(pictureLable[2]);
			add(pictureLable[3]);
		}
	
	   @Override
	   public void itemStateChanged(ItemEvent e) {
	      ImageIcon image = null;
	      
	      Object source = e.getItemSelectable();
	      for (int i = 0; i < 4; i++)
	      {
	         if (source == buttons[i])
	         {
	            if(e.getStateChange()==ItemEvent.DESELECTED)
	            	pictureLable[i].setIcon(null);
	            else
	            	pictureLable[i].setIcon(icon[i]);
	         }
	         
	      }
	   }
	public static void main(String[] args) {
		JFrame frame = new JFrame("CheckBoxDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CheckBoxPanel panel = new CheckBoxPanel();
		panel.setOpaque(true);
		frame.add(panel);
		frame.setSize(500, 200);
		frame.setVisible(true);
		
		// 기본 배경색이 투명이기 때문에 setOpaque 함수를 
		//"true"로 지정해야 배경색 설정이 가능하다.
		
		/*
		 * Java Swing 객체중에 하나인 JLable의 경우 배경색을 설정하면 효과가 적용되지 않는다.
		 * 이는 JLable의 배경색이 기본적으로 투명하기 때문이다.
		 * 
		 * jlable.setOpaque(true); // Opaque값을 true로 미리 설정해주어야 배경색이 적용된다.
		 * jlable.setBackground(Color.pink);
		 * 위와 같은 배경색 설정 이전에 Opaque값을 true로 설정해주어야 한다. */
		
	}
}
