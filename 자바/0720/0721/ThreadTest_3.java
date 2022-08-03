package ja_0721;

class MyThreadTest_3 extends Thread
{
	public MyThreadTest_3(String name)
	{
		super(name);
	}
	
	@Override
	public void run()
	{
		try
		{
			for (int i = 0; i < 5; i++) 
			{
				
				Thread.sleep(1000);
				System.out.println(" " + i + "번" + getName() + "스레드");
			}
		} 
		catch(InterruptedException e)
			{
			e.printStackTrace();
		}
	}
}
public class ThreadTest_3 {
	public static void main(String[] args) {
		
		MyThreadTest_3 obj_1 = new MyThreadTest_3("첫번째");
		MyThreadTest_3 obj_2 = new MyThreadTest_3("    두번째");
		MyThreadTest_3 obj_3 = new MyThreadTest_3("            세번째");
		
		obj_1.start();
		obj_2.start();
		obj_3.start();
		
//		obj_1.run();
//		obj_2.run();
//		obj_3.run();
	}
}
