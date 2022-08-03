class Break_3 
{
	public static void main(String[] args) 
	{
		aaaa : {

			for (int i = 0; i < 10 ; i++ )
			{
				for (int j = 0; j < 10; j++ )
				{
					for (int k = 0; k < 10 ; k++ )
					{
						System.out.println(i + " * " + j + " * " + k + " = " + (i*j*k));
					}
					break;
				}
			}
/*
i	0					0					0					...0					1					1
j	0					1					2					...9					0					1
k	0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 ...0 1 2 3 4 5 6 7 8 9	0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9
*/

		}
		System.out.println("Hello World!");
	}
}
