package ja_0721;

import javax.swing.JOptionPane;

class Runnable_5 implements Runnable
{

	@Override
	public void run() {

		for (int i = 10; i > 0; i --) {
			System.out.println("\t\t" + i);
			
			try 
			{
			Thread.sleep(1000);	
			} 
			catch (InterruptedException e) 
			{
			e.printStackTrace();
			}
		}
	}
	
}
public class Run_5 {
	public static void main(String[] args) {
		
		Runnable_5 obj = new Runnable_5();
		Thread thread = new Thread(obj);
		thread.start();
		String input = JOptionPane.showInputDialog("아무값이나 입력");
		System.out.println("입력한 값 : " + input + "입니다~");
		
	
	}
}
