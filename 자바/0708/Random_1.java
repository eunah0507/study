class Random_1 
{
	public static void main(String[] args) 
	{
		int score = 1;

		for (int i = 1; i<=100 ; i++ )
		{
			score = (int)(Math.random()*26+'A');

			System.out.printf("%5c",(char)score);

			if (i % 10 == 0)
			{
				System.out.println();
			}
		}
		System.out.println("Hello World!");
	}
}
