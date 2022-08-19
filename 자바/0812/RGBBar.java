package ja_0812;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RGBBar extends Frame implements AdjustmentListener {

	Panel pnl1,pnl2,pnl3,pnl4;
	Label lbl1,lbl2,lbl3;
	TextField txf1, txf2,txf3;
	Scrollbar scroll1, scroll2, scroll3;
	
	public RGBBar(String tit) {
		super(tit);
		go();
		
	}
	
	public void go() {
		
		setLayout(new GridLayout(2,1));
		
		pnl1 = new Panel();
		pnl2 = new Panel();
		
		lbl1 = new Label("RED : ");
		lbl2 = new Label("GREEN : ");
		lbl3 = new Label("BLUE : ");
		
		txf1 = new TextField("0");
		txf2 = new TextField("0");
		txf3 = new TextField("0");
		
		scroll1 = new Scrollbar(Scrollbar.HORIZONTAL,0,15,0,270);
		scroll2 = new Scrollbar(Scrollbar.HORIZONTAL,0,15,0,270);
		scroll3 = new Scrollbar(Scrollbar.HORIZONTAL,0,15,0,270);
		
		add(pnl1, BorderLayout.CENTER);
		add(pnl2, BorderLayout.SOUTH);
		
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		pnl2.setLayout(null);
		
		pnl2.add(lbl1);
		pnl2.add(txf1);
		pnl2.add(scroll1);
		lbl1.setBounds(10,10,70,25);
		txf1.setBounds(80,10,100,25);
		scroll1.setBounds(180,10,230,25);
		scroll1.addAdjustmentListener(this);
		
		pnl2.add(lbl2);
		pnl2.add(txf2);
		pnl2.add(scroll2);
		lbl2.setBounds(10,35,70,25);
		txf2.setBounds(80,35,100,25);
		scroll2.setBounds(180,35,230,25);
		scroll2.addAdjustmentListener(this);
		
		pnl2.add(lbl3);
		pnl2.add(txf3);
		pnl2.add(scroll3);
		
		pnl2.add(lbl3);
		pnl2.add(txf3);
		pnl2.add(scroll3);
		lbl3.setBounds(10,60,70,25);
		txf3.setBounds(80,60,100,25);
		scroll3.setBounds(180,60,230,25);
		scroll3.addAdjustmentListener(this);
		
		setSize(450,250);
		setVisible(true);
		
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		int r,g,b;
		
		txf1.setText(Integer.toBinaryString(scroll1.getValue()).toUpperCase());//2진수toBinaryString
		txf2.setText(Integer.toBinaryString(scroll2.getValue()).toUpperCase());
		txf3.setText(Integer.toBinaryString(scroll3.getValue()).toUpperCase());
		
		r= scroll1.getValue();
		g= scroll2.getValue();
		b= scroll3.getValue();
		
		pnl1.setBackground(new Color(r,g,b));//여기서 pnl1 색 바뀐 것
		
		System.out.println("txf1.getText() : " + txf1.getText());
		System.out.println("txf2.getText() : " + txf2.getText());
		System.out.println("txf3.getText() : " + txf3.getText());
		System.out.println("scroll1.getValue() : " + scroll1.getValue());
		System.out.println("scroll2.getValue() : " + scroll2.getValue());
		System.out.println("scroll3.getValue() : " + scroll3.getValue());
		
//		System.out.println(e.paramString());
		
		
		
	}
	public static void main(String[] args) {
		new RGBBar("RGBBars");
	}


}
