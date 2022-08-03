class If_5 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i<=10 ; i++ )
		{
			System.out.print(i);

			if (i % 2 == 0)
			{
				System.out.println(" "+ i +"는 짝수입니다.");
			}
			else if (i % 2 == 1)
			{
				System.out.println(" " + i + "는 홀수입니다."); 
			}
			else
			{
				System.out.println(" " + i + "는 숫자가 아닙니다.");
			}
		}
		System.out.println("Hello World!");
	}
}
