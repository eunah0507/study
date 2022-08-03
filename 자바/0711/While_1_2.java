class While_1_2 
{
	public static void main(String[] args) 
	{
		int cnt = 0;
		int sum = 0;
		int even = 0 , odd = 0;

		while (cnt < 100)
		{
			//cnt = cnt+1;
			//cnt ++;
			sum +=  ++cnt;
			
			System.out.println("cnt = " + cnt);
		
		if (cnt%2==0)
		{
			even += cnt;
		}else
		{odd += cnt;
		}
		}	
			System.out.println("sum = " + sum);
			System.out.println("Â¦¼ö = " + even);
			System.out.println("È¦¼ö = " + odd);
		System.out.println("Hello World!");
	}
}
