package ja_0805;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_6 extends Frame implements ActionListener {
	
	Label lid;
	Label lpwd;
	Label tel;
	TextField tfId;
	TextField tfPwd;
	TextField tfTel;
	Button ok;
	
	public ActionEvent_6(String title)
	{
		super(title);
		
		lid = new Label("ID : ", Label.RIGHT);
		lpwd = new Label("PWD : ", Label.RIGHT);
		tel = new Label("Tel : " , Label.RIGHT);
		
		tfId = new TextField(10);
		tfPwd = new TextField(10);
		tfPwd.setEchoChar('*');
		tfTel = new TextField(15);
		ok = new Button("OK");
		
		tfId.addActionListener(this);
		tfPwd.addActionListener(this);
		tfTel.addActionListener(this);
		ok.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(lid);
		add(tfId);
		add(lpwd);
		add(tfPwd);
		add(tel);
		add(tfTel);
		add(ok);
		
		setSize(450, 80);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionEvent_6("Login Test");
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String id = tfId.getText();
		String password = tfPwd.getText();
		String telecom = tfTel.getText();
		
		if (!id.equals("korea")) 
		{
		System.out.println("입력하신 ID가 존재하지 않습니다. 다시 입력해주세요");
		tfId.requestFocus(); 
		tfId.selectAll(); //모두를 반전시켜라
		}
		else if(!password.equals("seoul"))
		{
			System.out.println("입력하신 password가 존재하지 않습니다. 다시 입력해주세요");
			tfPwd.requestFocus();
			tfPwd.selectAll();
		}
		else if(!telecom.equals("010-2087-0112"))
		{
			System.out.println("입력하신 tel이 존재하지 않습니다. 다시 입력해주세요");
			tfTel.requestFocus();
			tfTel.selectAll();
		}
		else
		{
			System.out.println(id + "님 로그인 되었습니다.");
		}
	}
}

