package ja_0713;

import javax.swing.JOptionPane;
public class Game_1 {
	public static void main(String[] args) {
	
		int answer = (int)(Math.random()*100)+1;
		
		int input = 0;
		String temp;
		int count = 0;
		
		do {
			count++;
			temp = JOptionPane.showInputDialog("1~100 사이의 숫자를 입력하시오 !" + "끝내려면 -1을 입력하시오");
			
			if (temp == null || temp.equals("-1")) 
			{
			break;
			}
			System.out.println("입력 값 : " + temp);
			
			input = Integer.parseInt(temp);
			
			if (answer > input) 
			{
				System.out.println("더 큰수를 입력하세요!!!!");
			}
			else if (answer < input) 
			{
			System.out.println("더 작은수를 입력하세요!!");	
			}
			else
			{
			System.out.println("드디어 맞추었습니다~!!");
			System.out.println("시도횟수는" + count + "번 입니다.");	
			break;
			}
		
		} while (true);
		
	}
}
