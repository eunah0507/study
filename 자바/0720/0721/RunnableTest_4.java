package ja_0721;

public class RunnableTest_4 implements Runnable{
	
	private int [] temp; //전역변수 = 멤버변수
	public RunnableTest_4()
	{
		temp = new int [10];
		
		for (int i = 0; i < temp.length; i++) 
		{
		// 150~200 사이의 난수 발생	
			temp[i] = (int)(Math.random() * (200 - 150 + 1) + 150);
		}
	}
	public static void main(String[] args) {
		
		RunnableTest_4 obj_1 = new RunnableTest_4();
		Thread thread_1 = new Thread(obj_1); //두줄버전
		
		Thread thread_2 = new Thread(new RunnableTest_4()); //한줄버전
		
		thread_1.start();
		thread_2.start();
		
	}

	@Override
	public void run() 
	{
//		for (int start : temp) // 이건 향상된 for문 배열과 collection에서 향상된 for문을 쓸 수 있다.
//		{
//			try 
//			{
//				Thread.sleep(1000);
//			} 
//			catch (InterruptedException e) 
//			{
//				e.printStackTrace();
//			}
//			
//			System.out.println("쓰레드 이름 :" + Thread.currentThread().getName());
//			System.out.println(" temp[] value : " + start);
//		} // 쓰레드이름 0,1 나오고 돌던데 나는 왜 이렇게 나오지? 괜찮은건가?
		for (int i = 0; i <temp.length; i++) 
		{
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
			System.out.println("쓰레드 이름 :" + Thread.currentThread().getName());
			System.out.println(" temp[] value : " + temp[i]);
		} 
	}
}
