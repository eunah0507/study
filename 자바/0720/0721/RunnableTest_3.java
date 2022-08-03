package ja_0721;

public class RunnableTest_3  implements Runnable {
	
	int delay;
	
	String title;
	
	public RunnableTest_3(String title)
	{
		this.title = title;
		System.out.println(" " + title + "쓰레드 시작~");
	}
	public static void main(String[] args) {
		
		Thread obj_1 = new Thread(new RunnableTest_3("첫번째")); //두줄을 한줄로 줄였다
		Thread obj_2 = new Thread(new RunnableTest_3("두번째"));
		Thread obj_3 = new Thread(new RunnableTest_3("세번째"));
		
		obj_1.setPriority(Thread.MAX_PRIORITY);
		obj_2.setPriority(Thread.MIN_PRIORITY);
		obj_3.setPriority(7);
		
		obj_1.start();
		obj_2.start();
		obj_3.start();
	}
	
	@Override
	public void run()
	{
		for (int i = 0; i < 5; i++) 
		{
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(" [ " + i + "]" + title + "실행중");
		}
		System.out.println(title + " 실행종료 ");
	}
}
