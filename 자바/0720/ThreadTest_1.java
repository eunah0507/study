package ja_0720;

class MyThread extends Thread
{
	public void run()
	{
		try
		{
			for (int i = 0; i < 20; i++) 
			{
				Thread.sleep(1000); // 1초를 멈추게함
				System.out.println(" " + i + " * " + i + " = " + ( i * i));
			}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
public class ThreadTest_1 {
	public static void main(String[] args) {
		
		MyThread thread = new MyThread();
		
		//thread.start();
		thread.run(); // 쓰레드 호출이 아니라 메소드 호출이다.
		
	}
}
