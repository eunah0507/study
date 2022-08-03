package ja_0721;

class Runnanble_1 implements Runnable
{
	String str;
	public Runnanble_1(String name)
	{
		//super();
		this.str = name;
	}
	
	@Override
	public void run() 
	{					
		try
		{
			for (int i = 0; i < 5; i++) 
			{
				
				Thread.sleep(1000);
				System.out.println(" " + i + "번" + str + "스레드");
			}
		} 
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}
public class Run_1 {
	public static void main(String[] args) {
		
		Runnanble_1 obj = new Runnanble_1("첫번째");
		Thread thread = new Thread(new Runnanble_1("첫번째"));
		thread.start();
		

		Runnanble_1 obj2 = new Runnanble_1("		두번째");
		Thread thread2 = new Thread(obj2);
		thread2.start();
		

		Runnanble_1 obj3 = new Runnanble_1("			세번째");
		Thread thread3 = new Thread(obj3);
		thread3.start();
	}
}
