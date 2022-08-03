class While_1 
{
	public static void main(String[] args) 
	{
		int cnt = 0;
		int sum = 0;

		while (cnt < 10)
		{
			//cnt = cnt+1;
			//cnt ++;
			System.out.println("cnt = " + cnt);
			sum +=  ++cnt;
		}
			System.out.println("sum = " + sum);
		System.out.println("Hello World!");
	}
}
