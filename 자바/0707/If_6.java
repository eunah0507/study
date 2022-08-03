class If_6 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i<=10 ; i++)
		{
			System.out.print(i);

			if (i == 1 || i == 3 || i == 5 || i ==7 || i == 9)
			{
				System.out.println(" " + i + "홀수입니다.");
			}
			else if (i == 2 || i == 4 || i == 6 || i ==8 || i == 10)
			{
				System.out.println(" " + i + "짝수입니다.");
			}
			else
				System.out.println(" " + i + "는 숫자가 아닙니다.");
		}
		System.out.println("Hello World!");
	}
}
