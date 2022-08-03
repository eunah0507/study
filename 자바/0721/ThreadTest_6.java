package ja_0721;

import javax.swing.JOptionPane;

public class ThreadTest_6 {
	public static void main(String[] args) throws InterruptedException {
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력 !!");
		System.out.println("입력하신 값 " + input + "여요~~");
		
		for (int i = 10; i > 0; i--) 
		{
			System.out.println("\t\t " + i);
			
			
			Thread.sleep(1000);
//			try 
//			{
//				Thread.sleep(1000);	
//			} catch (InterruptedException e) 
//			{
//				e.printStackTrace();	
//			}
		}
	}
}
