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
					; //공문
				}
			}
		}
		
		long endTime = System.currentTimeMillis();

		System.out.println("시작시간 : " + startTime);
		System.out.println("종료시간 : " + endTime);
		System.out.println("경과시간 : " + (endTime-startTime));
		System.out.println("Hello World!");
	}
}
