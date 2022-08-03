package ja_0720;

class MyThread_2 extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for (int i = 0; i < 20; i++) 
			{
				Thread.sleep(1000);
				System.out.println(" " + i + " 번 쓰레드 ");
			}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public class ThreadTest_2 {
	public static void main(String[] args) {
		
		MyThread_2 Thread_1 = new MyThread_2();
		Thread_1.start();
		//Thread_1.run();
		
		try
		{
			for (int i = 0; i < 20; i++) 
			{
				Thread.sleep(1000);
				System.out.println(" " + i + " main 쓰레드 ");
			}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
