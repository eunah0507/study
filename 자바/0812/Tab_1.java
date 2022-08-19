package ja_0812;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Tab_1 extends JFrame implements ChangeListener{

	JTabbedPane pane;
	JLabel lbl_info;
	
	public Tab_1 (String title) {
		super(title);
		
		JPanel one,two,three,four;
		
		pane= new JTabbedPane();
		lbl_info= new JLabel("                                        ");
		
		one = new JPanel();
		one.add(new JLabel("첫번째 탭~~~~"));
		one.add(new JTextField("문자입력"));
		one.setBackground(Color.green);
		
		pane.addTab("<html><font  color = red>One</font></html>", one);
		
		two = new JPanel();
		two.add(new JLabel("두번째 탭%%%%%%"));
		two.setBackground(new Color(230,70,120));
		
		pane.addTab("<html><font  color = blue>Two</font></html>", two);
		
		
		three = new JPanel();
		three.add(new JLabel("세번째 탭##########"));
		three.setBackground(Color.blue);
		
		pane.addTab("<html><font  color = #cccc66>Three</font></html", three);
		
		four = new JPanel();
		four.add(new JLabel("네번째 탭^^^^^^^^^^^^"));
		four.setBackground(new Color(220,220,255));
		
		pane.addTab("<html><font  color = yellow>Four</font></html", four);
		
		pane.setSelectedIndex(1);
		pane.addChangeListener(this);
		
		getContentPane().add("North",new JLabel("Tab 사용 예제~~~"));
		getContentPane().add("Center",pane);
		getContentPane().add("South",lbl_info);
		
		setDefaultCloseOperation((JFrame.DO_NOTHING_ON_CLOSE));
		setSize(400,300);
		setVisible(true);
		
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		int index = pane.getSelectedIndex();
		String msg = "<html><font size =7 color = black> " + 
		              pane.getTitleAt(index)+"</font></html>";
		
		lbl_info.setText(msg);
		pane.setSelectedIndex(index);
	}
	
	public static void main(String[] args) {
		new Tab_1("Tab Test ~~~~");
	}
}
