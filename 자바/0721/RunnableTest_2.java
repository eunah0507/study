package ja_0721;

class MyRunnable_2 implements Runnable
{
	String name;
	public MyRunnable_2(String str)
	{
		name = str;
	}
	@Override
	public void run() 
	{
		try 
		{
			for (int i = 0; i < 5; i++) 
			{
				Thread.sleep(1000);
				System.out.println(" " + i + "번 " + name + " : 스레드");
			}
		} catch (Exception e) 
		{
		}
	}
	
}
public class RunnableTest_2 {
	public static void main(String[] args) {
		
		MyRunnable_2 obj_1 = new MyRunnable_2("첫번째");
		MyRunnable_2 obj_2 = new MyRunnable_2("    두번째");
		MyRunnable_2 obj_3 = new MyRunnable_2("            세번째");
		
		Thread thread_1 = new Thread(obj_1);
		Thread thread_2 = new Thread(obj_2);
		Thread thread_3 = new Thread(obj_3);
		
		thread_1.start();
		thread_2.start();
		thread_3.start();
		
//		obj_1.run();
//		obj_2.run();
//		obj_3.run();
	}
}
