package ja_0721;

class Runnable_6 implements Runnable
{
	String str;
	public Runnable_6(String bbb)
	{
		str = bbb;
	}
	
	@Override
	public void run()
	{
		for (int i = 0; i < 20; i++) 
		{
		System.out.println(str + "스레드");
		}
	}
}

public class Run_6 {
	public static void main(String[] args) {
		
		Runnable_6 obj_1 = new Runnable_6("10번");
		Runnable_6 obj_2 = new Runnable_6("   5번");
		Runnable_6 obj_3 = new Runnable_6("			1번");
		Runnable_6 obj_4 = new Runnable_6(" 				8번");
		
		Thread thread = new Thread(obj_1);
		Thread thread_1 = new Thread(obj_2);
		Thread thread_2 = new Thread(obj_3);
		Thread thread_3 = new Thread(obj_4);
		
		thread_1.setPriority(Thread.MAX_PRIORITY);
		thread_2.setPriority(Thread.NORM_PRIORITY);
		thread_3.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("a : " + thread.getPriority());
		System.out.println("b : " + thread_1.getPriority());
		System.out.println("c : " + thread_2.getPriority());
		System.out.println("d : " + thread_3.getPriority());
		
		thread.start();
		thread_2.start();
		thread_3.start();
	
	}
}
