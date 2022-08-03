package ja_0801;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Button_2 extends Frame {

	Label lbl1, lbl2, lbl3;
	Button btn1, btn2, btn3;
	
	public Button_2(String str)
	{
		super(str);
		setLayout(new FlowLayout());
		lbl1 = new Label("가위");
		lbl2 = new Label("바위");
		lbl3 = new Label("보");
		
		btn1 = new Button("가위");
		btn2 = new Button("바위");
		btn3 = new Button("보");
		
		/*
		 *  버튼(Button)
		 *  
		 *  : 버튼은 가장 많이 사용되는 GUI컴포넌트이고, 주로 사용자의 입력을 받을 때 사용합니다.
		 *    사용자가 어떤 결정을 내릴 때 사용하는 컴포넌트 입니다.
		 *    
		 *    생성자
		 *    
		 *    public Button()				:	기본 생성자
		 *    public Button(String label)	:	문자열이 지정된 생성자
		 *    
		 *    중요 메소드
		 *    
		 *    public String getLable()							: 버튼 위에 있는 문자열 반환
		 *    public void setLabel(String label)				: 버튼 위의 문자열 지정
		 *    public void addActionListenr(ActionListener al)	: 버튼에서 발생한
		 *    													  ActionEvent를 처리할 수 있도록 등록
		 *    public String getActionCommand()					: 버튼에서 이벤트가 발생하면
		 *    													  Command(명령)이름을 받아옵니다.
		 *    public void setActionCommand(String cmd)			: 버튼에 Command 이름을 설정
		 */
		
		
		add(lbl1);		add(btn1);
		add(lbl2);		add(btn2);
		add(lbl3);		add(btn3);
		
		lbl1.setEnabled(false);
		btn3.setEnabled(false);
		
		btn2.setBackground(new Color(255,0,0));
		btn2.setForeground(new Color(0,255,0));
		
		setSize(300, 200);
		setLocation(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Button_2("버튼과 레이블");
	}
}
