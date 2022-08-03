package ja_0727;
// 270-530 사이의 난수 100개를 Random 클래스를 활용해 구하기. 
import java.util.Random;

public class Nansu_3 {
	public static void main(String[] args) {
	
	Random  rnd  = new  Random();
	int count = 0;
	
	
	for (int i = 0; i < 100; i++) 
	{
		int nan = (int)(rnd.nextDouble()*(530-270+1))+270;
		
		System.out.print(nan + "\t");

		count++;

			if (count %10 ==0) 
			{
				System.out.println();
			}
		}
	}
}
