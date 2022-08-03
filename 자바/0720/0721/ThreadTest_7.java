package ja_0721;

import javax.swing.JOptionPane;

class MyThread_7 extends Thread
{
	@Override
	public void run()
	{
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
public class ThreadTest_7 {
	public static void main(String[] args) {
		
		MyThread_7 thread_1 = new MyThread_7();
		thread_1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력");
		System.out.println("입력한 값 : " + input + "입니다~");
	}
}
