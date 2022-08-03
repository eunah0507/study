package ja_0728;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_1 {
	public static void main(String[] args) {
		
		int time = 10;
		Queue<Integer> qq = new LinkedList<>();
		
//		for (int i = 0; i < time; i++) 
//		{
//		qq.add(i)	
//		}
		
		for (int i = 1; i < time; i += 2) 
		{ 
			qq.offer(i);
		} 
		
		System.out.println(qq.peek() + " aaa ");
		System.out.println(qq); //이걸 빼면 1이 출력 안되던데 이유가 뭐지?
//		큐 안에 넣을 때에는 Queue명.offer(값);
//		큐에서 값을 빼낼 때에는 Queue명.poll();
		
		while(!qq.isEmpty())
		{
			System.out.println(qq.poll() + " aaa ");
			//System.out.println(qq.remove() + "333");
			
			System.out.println(qq);
			
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
