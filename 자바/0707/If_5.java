class If_5 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i<=10 ; i++ )
		{
			System.out.print(i);

			if (i % 2 == 0)
			{
				System.out.println(" "+ i +"�� ¦���Դϴ�.");
			}
			else if (i % 2 == 1)
			{
				System.out.println(" " + i + "�� Ȧ���Դϴ�."); 
			}
			else
			{
				System.out.println(" " + i + "�� ���ڰ� �ƴմϴ�.");
			}
		}
		System.out.println("Hello World!");
	}
}
