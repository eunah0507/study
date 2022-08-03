package ja_0802;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;

public class ScrollBar_1 extends Frame{

	/*ScrollBar(스크롤바)
	 * : 스크롤바는 가로와 세로로 길쭉한 형태로 되어 있습니다. 
	 *   주로 값의 범위를 지정할 때 많이 사용됩니다.
	 */
	
	public ScrollBar_1(String title) {
		super(title);
		
		//VERTICAL : 세로(수직)  ,  HORIZONTAL : 가로(수평)
		Scrollbar srb1 = new Scrollbar(Scrollbar.VERTICAL, 50, 100, 0, 255);
		Scrollbar srb2 = new Scrollbar(Scrollbar.HORIZONTAL, 100, 50, 0, 255);
		         //(100만큼 밑에 위치해 50크기의 바를 갖는다)(0부터 (255-50)까지 움직인다)
		
		System.out.println(srb1.getValue());
		
		add("East", srb1);
		add("Center", new Label("스크롤바 테스트~~"));
		add("North", srb2);
		//위에서의 " "은 단순한 문자열이 아니라 입력어이기 때문에 대소문자 구분 필수
		//West, South도 있어요!
		
		
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ScrollBar_1("ScrollBar Test~~");
	}
}
