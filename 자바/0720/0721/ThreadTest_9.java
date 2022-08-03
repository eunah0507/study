package ja_0721;

public class ThreadTest_9 {
	public static void main(String[] args) {
		
		Thread_9_1 obj_1 = new Thread_9_1();
		Thread_9_2 obj_2 = new Thread_9_2();
		
		obj_1.setPriority(8);
		obj_2.setPriority(2);
		
		obj_2.start();
		obj_1.start();
	}
}


class Thread_9_1 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 500; i++) 
		{
			System.out.print("--");
			
			for (int j = 0; j < 10000000; j++) 
			{
				;
			}
		}
	}
}

class Thread_9_2 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 500; i++) 
		{
			System.out.print("||");
			
			for (int j = 0; j < 10000000; j++) {
				
			}
		}
	}
}