package ja_0802;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class Login_1 {
public static void main(String[] args) {
	
	Frame ff = new Frame("Login");
	
	ff.setSize(300,200);
	ff.setLayout(null);    //Layout이 null일 경우 따로 좌표값을 정해줘야 한다. 
	
	Label id = new Label("ID : ");
	id.setBounds(100,80,30,18);     //setLocation(x,y) + setSize(가로,세로)
	
	Label pwd = new Label("Password : ");
	pwd.setBounds(100,100,100,18);
	
	Label  adr = new Label("Adress : ");
	adr.setBounds(100,120,100,18);
	adr.setForeground(new Color(0,0,255));
	
	ff.add(id);
	ff.add(pwd);
	ff.add(adr);
	
	ff.setVisible(true);
	
}
}

/*Label(레이블)
 * 
 * : 레이블은 문자열을 출력하는 컨포넌트 입니다.
 *   보통 화면에서 다른 컨포넌트의 용도를 알리기 위한
 *   목적으로 사용됩니다.
 */

