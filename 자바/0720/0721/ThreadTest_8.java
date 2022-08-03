package ja_0721;

class Thread_8 extends Thread
{
	public Thread_8(String name)
	{
		super(name);
	}
	public void run()
	{	
		for (int i = 0; i < 20; i++) 
		{
		System.out.println(getName() + "스레드");
		}
	}
}
public class ThreadTest_8 {
	public static void main(String[] args) {
		
		Thread_8 obj_1 = new Thread_8 ("10번");
		Thread_8 obj_2 = new Thread_8 ("     5번");
		Thread_8 obj_3 = new Thread_8 ("                        1번");
		Thread_8 obj_4 = new Thread_8 ( " 7 번번번");
		
		obj_1.setPriority(Thread.MAX_PRIORITY);
		obj_2.setPriority(Thread.NORM_PRIORITY);
		obj_3.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("a : " + obj_1.getPriority());
		System.out.println("b : " + obj_2.getPriority());
		System.out.println("c : " + obj_3.getPriority());
		System.out.println("d : " + obj_4.getPriority());
		obj_1.start();
		obj_2.start();
		obj_3.start();
	}
}
