package ja_0721;

public class Run_2 {
	public static void main(String[] args) {
		
		Runnable_2 obj = new Runnable_2();
		Thread thread = new Thread(obj);
		
		thread.start();
	}
}

class Runnable_2 implements Runnable
{
	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 500; i++) 
		{
			System.out.print("--");
		}
		
		System.out.println("\n 소요시간 11 : " + (System.currentTimeMillis() - startTime) + "\n");
		
		for (int i = 0; i < 500; i++) 
		{
			System.out.print("||");	
		}
		
		System.out.println("\n 소요시간 22 :" + (System.currentTimeMillis() - startTime));
	
		
	}
	
}