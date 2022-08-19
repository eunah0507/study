package ja_0812;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextField_1 extends JFrame {
	
	private JButton button;
	private JTextField text, result;
	
	public JTextField_1()
	{
		setSize(300, 130);
		setTitle("제곱 계산하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ButtonListener listener = new ButtonListener();
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력 : "));
		text = new JTextField(15);
		panel.add(text);
		
		JPanel panel2 = new JPanel();
		panel.add(new JLabel("숫자 입력 : "));
		text = new JTextField(15);
		
		panel.add(text);
		panel.add(new JLabel("곱한 값 : "));
		
		result = new JTextField(15);
		result.setEditable(false);
		result.setBackground(new Color(200, 200, 70));
		panel.add(result);
		
		button = new JButton("OK!");

		button.addActionListener(listener);
		//text.addActionListener(new ButtonListener()); // 이벤트를 받아들인 
		
		panel.add(button);
		add(panel);
		setVisible(true);
	}

	//내부 클래스로서 텍스트 필드와 버튼의 액션 이벤트 처리
	
	private class ButtonListener implements ActionListener
	{
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			Object obj = e.getSource();
			
			if (obj == button || obj == text) 
			{
				String name = text.getText();
				int value = Integer.parseInt(name);
				result.setText(" " + value * value);
				
				text.requestFocus();
			}
		}
	}
	
	public static void main(String[] args) {
		new JTextField_1();
	}
}
