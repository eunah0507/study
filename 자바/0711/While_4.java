class While_4
{
	public static void main(String[] args) 
	{
		//while������ ������ �����

		int i = 2;
		int j = 1;
		 
		while (i <= 9)
		{
			while (j <=9)
			{
				System.out.println(i + "*" + j + "=" + (i*j));
				j++;
			}
			i++;
			j = 1;
			System.out.println();
		}
		
	
		System.out.println("Hello World!");

	}
}
