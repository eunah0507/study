class Break_1 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int i;
		int cnt = 0;

		// 1 ~ 100 ������ // 3�� ����� // ���� 200�� �Ѵ� ���� 3�� ����� ����??
/*
i		3		6		9		12		15		18	....	99
cnt		1		2		3		4		5		6			33
sum		3		9		18		30		45		63	...
��°��	"3	6  9
12	15	18
21	"
*/
		
		for (i = 1; i<=100 ; i++ )	///
		{
			if (i%3==0) // 3�� ���		///
			{	
				cnt ++;
				sum+=i;//sum = sum + i	//

				System.out.print(i + "\t");
				if (cnt % 3 == 0)
				{
					System.out.println();
				}
				if (sum >200)		///
				{
					break;
				}
			}
		}
		System.out.println("\n\n �� :" + sum);
		System.out.println("\n 3�� ��� :" + i);
		System.out.println("Hello World!");
	}
}
