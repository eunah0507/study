class For_1 
{
	public static void main(String[] args) 
	{
		int sum = 0;

		for (int cnt = 0; cnt <= 100 ; cnt ++ )
		{
			 sum = sum + cnt;
			//sum += cnt;
			System.out.println("sum = "+sum);
		
		}
/*
cnt  sum
0	0
1	1
2	3
3	6
4	10
5	15
*/
		System.out.println("\n SUM = " + sum);
		System.out.println("Hello World!");
	}
}
