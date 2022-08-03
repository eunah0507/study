package ja_0721;

class Runnabl_7 implements Runnable
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
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

class Thread_0202 implements Runnable
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
public class Run_7 {
	public static void main(String[] args) {

		Runnabl_7 obj = new Runnabl_7();
		Thread thread = new Thread(obj);
		
		Thread_0202 obj_2 = new Thread_0202();
		Thread thread_2 = new Thread(obj_2);
		
		thread.setPriority(8);
		thread_2.setPriority(2);
		
		thread.start();
		thread_2.start();
	}
}	