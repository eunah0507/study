package ja_0811;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButton_2 extends JPanel {
	
	public JButton_2()
	{
		ImageIcon b1 = new ImageIcon("src/images/b3.gif");
		ImageIcon b1d = new ImageIcon("src/images/b3d.gif");
		ImageIcon b1p = new ImageIcon("src/images/b3p.gif");
		
		ImageIcon b2 = new ImageIcon("src/images/b3.gif");
		ImageIcon b2d = new ImageIcon("src/images/b3d.gif");
		ImageIcon b2p = new ImageIcon("src/images/b3r.gif");
		
		setDoubleBuffered(true);
		setLayout(new GridLayout(1, 2, 5, 5));
		
		AbstractButton btn = new JButton();
		
		btn.setIcon(b1);
		
		btn.setPressedIcon(b1d);
		btn.setRolloverIcon(b1p);
		add(btn);
		
		btn = new JButton();
		btn.setIcon(b2);
		btn.setPressedIcon(b2d);
		btn.setRolloverIcon(b2p);
		add(btn);
	}
	
	public Dimension getPreferredSize()
	{
		return new Dimension(400, 200);
	}

	public static void main(String[] args) {
		JFrame jff = new JFrame("JButton Test");
		
		JButton_2 panel = new JButton_2();
		
		jff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jff.setForeground(Color.green);
		jff.setBackground(Color.lightGray);
		jff.getContentPane().add(panel, "Center");
		
		jff.setSize(panel.getPreferredSize());
		jff.setVisible(true);
		
	}
}
