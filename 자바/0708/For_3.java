class For_3 
{
	public static void main(String[] args) 
	{
		long startTime = System.currentTimeMillis();

		for (int i = 1 ; i < 1000000 ; i++ )
		{
			for (int j = 1; j < 7100 ; j++ )
			{
				for (int k = 1 ; k < 50 ; k++ )
				{
					; //����
				}
			}
		}
		
		long endTime = System.currentTimeMillis();

		System.out.println("���۽ð� : " + startTime);
		System.out.println("����ð� : " + endTime);
		System.out.println("����ð� : " + (endTime-startTime));
		System.out.println("Hello World!");
	}
}
