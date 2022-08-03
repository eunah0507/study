class For_1_1
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int even = 0;
		int odd = 0;
/*
cnt	even	odd
0	0		0
1	0		1
2	2		1
3	2		4
4	6		4

*/
		for (int cnt = 0; cnt <= 100 ; cnt ++ )
		{
			// sum = sum + cnt;
			sum += cnt;
			if (cnt % 2 == 0)
			{
				even =  even + cnt;
			}
			else
			{
				odd += cnt;
			}

			System.out.println(cnt);
		}

		System.out.println("\n SUM = " + sum);
		System.out.println("\n Â¦¼ö = " + even);
		System.out.println("\n È¦¼ö = " + odd);

		System.out.println("Hello World!");
	}
}
