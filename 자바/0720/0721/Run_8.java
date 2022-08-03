package ja_0721;

class Runnable_8 implements Runnable
{
	@Override
	public void run() 
	{
		for (int i = 0; i < 300; i++) 
		{
			System.out.print("-");
		}
	}
}

class Thread_888 extends Thread
	{
		@Override
		public void run()
		{
			for (int i = 0; i < 300; i++) 
			{
				System.out.print("|");
			}
		}
	}

	class Thread_999 extends Thread
	{
		@Override
		public void run()
		{
			for (int i = 0; i < 300; i++) 
			{
				System.out.print("!");
			}
		}
	}
public class Run_8 {
	public static void main(String[] args) {

		Runnable_8 obj = new Runnable_8();
		Thread thread = new Thread(obj);
		
		Thread_888 obj_1 = new Thread_888();
		Thread_999 obj_2 = new Thread_999();
		
		obj_1.start();
		thread.start();
		
		//obj_1.join(); // 예외처리를 해야한다.
		
		try 
		{
			obj_1.join();   //join을 사용하면
							//해당 스레드가 종료될 때 까지 기다리고
							//다음 스레드로 넘어갑니다
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		obj_2.start();
	
	}
}
