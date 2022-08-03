package ja_0803;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Panel_2 extends Frame {
		
		public Panel_2(String title)
		{
			super(title);
			
			Panel panel1 = new Panel();
			
			panel1.add(new Button("Panel 1 위의 버튼"));
			panel1.add(new Checkbox("홍길동"));
			
			Panel panel2 = new Panel();
			
			panel2.add(new Label("라벨라벨"));
			panel2.add(new Button("Panel2 위의 버튼"));
			
			Panel panel3 = new Panel();
			
			panel3.add(new Label("west"));
			panel3.add(new Button("Panel2 옆의 버튼"));
			
			Panel panel4 = new Panel();
			
			panel4.add(new Label("east"));
			panel4.add(new Button("Panel2 옆의 버튼"));
			
			add("North", panel1);
			add("Center", new Button("버튼"));
			add("South", panel2);
			add("West", panel3);
			add("East", panel4);
			
			setSize(400, 400);
			setVisible(true);
		}
	public static void main(String[] args) {
		new Panel_2("panel Test~~");
	}
}
