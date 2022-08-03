package ja_0802;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Label_1 {
public static void main(String[] args) {
	
	Label label1, label2, label3, label4;
	
	Frame ff = new Frame("내가 만든 레이블");
	
	ff.setLayout(new FlowLayout()); // label배치. 없다면 <겨울>만 보인다
	label1 = new Label("<봄>");
	label2 = new Label("<여름>");
	label3 = new Label("<가을>");
	label4 = new Label("<겨울>");
	
	ff.setBackground(new Color(209,178,255));
	label2.setBackground(new Color(63,0,153));
	label2.setForeground(new Color(255,228,0));
	
	ff.add(label1);
	ff.add(label2);
	ff.add(label3);
	ff.add(label4);
	
	ff.setSize(300,200);
	ff.setVisible(true);
	
	
}
}
