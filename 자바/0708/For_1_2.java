class For_1_2
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int even = 0;
		int odd = 0;
		int num = 0;

		for (int cnt = 0; cnt < 100 ; cnt ++ )
		{
			// num = num+1
			// sum = sum + num
			sum += ++num;
			if (num % 2 == 0)
			{
				even += num;
			}
			else
			{
				odd += num;
			}

			System.out.println(cnt);
		}

		System.out.println("\n SUM = " + sum);
		System.out.println("\n Â¦¼ö = " + even);
		System.out.println("\n È¦¼ö = " + odd);

		System.out.println("Hello World!");
	}
}
