package ja_0816;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ToolTip_1 extends JFrame  {

	public ToolTip_1(String title) {
		super(title);
		
		JButton btn = new JButton("나 버튼~~~~~");
		JLabel lbl = new JLabel("ToolTap Test @@");
		JTextArea txt = new JTextArea("==^^==");
		
		btn.setToolTipText("<html><font size=7 color=rgb(255,0,6)>"
				           + "  튤립튤립 ^^^^</font></html>");
		
		lbl.setToolTipText("나는 자바 초보가 아닙니다. &&&&&");
		txt.setToolTipText("튤립 정말 좋은 기능입니다. ㅋㅋㅋㅋㅋㅋ");
		
		getContentPane().add("North",lbl);
		getContentPane().add("Center",txt);
		getContentPane().add(btn,"South");//메소드 오버로딩을 가지고 있는데 ("Center",txt)도 가능하고 (txt, "Center")도 가능해
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,350);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ToolTip_1("ToolTip Test");
	}
}
