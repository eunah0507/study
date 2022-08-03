package ja_0727;

import java.util.Random;

public class Nansu_2 {
	public static void main(String[] args) {
	
	// seed값을 주지 않을 경우 일정한 패턴으로 난수가 발생할 수 있다.
	// => System.currentTimeMillis() 적어주기.
	// new Random(System.currentTimeMillis())
	
	Random  rnd  = new Random();
	int count = 0;
	
	for (int i = 0; i < 100; i++)
		{
		System.out.print(rnd.nextInt()+"\t");
		//nextBoolean, nextFloat도 가능
		
		count++;
		
			if (count %7 ==0) 
			{
				System.out.println();
			}
		}
	}
}
