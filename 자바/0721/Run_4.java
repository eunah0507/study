package ja_0721;

import javax.swing.JOptionPane;

class Runnable_4 implements Runnable
{

	@Override
	public void run() 
	{
		for (int i = 10; i > 0; i--) 
		{
			System.out.println("\t\t " + i);
			
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
}
public class Run_4 {
	public static void main(String[] args) {
		
		Runnable_4 obj = new Runnable_4();
		Thread thread = new Thread(obj);
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력 !!");
		System.out.println("입력하신 값 " + input + "여요~~");
	
		thread.start();
		
		
		
	
	}
}
