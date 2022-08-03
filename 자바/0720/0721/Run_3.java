package ja_0721;

class Runnable_3 implements Runnable
{
	int n;
	static int n2;
	@Override
	public void run()
	{
		for (int i = 0; i < 500; i++) 
		{
			System.out.print("||");
		}
		System.out.println("\n 소요시간 22 :" + (System.currentTimeMillis() - Run_3.startTime) + " \n");
	}
}

public class Run_3 {
	static long startTime = System.currentTimeMillis();
	
	public static void main(String[] args) {
		
			Runnable_3 obj = new Runnable_3();
			Thread thread = new Thread(obj);
			
			thread.start();
			
			//startTime = System.currentTimeMillis();
					
			for (int i = 0; i < 500; i++) 
			{
				System.out.print("--");
			}
			System.out.println("\n 소요시간 11 :" + (System.currentTimeMillis() - startTime) + "\n");
	}
}
