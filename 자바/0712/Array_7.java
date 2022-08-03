package ja_0712;

public class Array_7 {
public static void main(String[] args) {
	
	int [] kbs = new int[100];
	int kk = 0;
	
	for (int i = 0; i < kbs.length; i++) 
	{
		kbs[i] = i;
		kk ++;
		
		System.out.print(kbs[i] + "\t");
		
		if (kk%10==0) 
			{
				System.out.print("\n");
			}
		}
		System.out.println("kbs 배열의 크기 : " + kbs.length);
	}
}
