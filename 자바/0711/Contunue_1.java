class Contunue_1 
{
	public static void main(String[] args) 
	{
		int sum = 0;

		for (int i=0; i<10 ;i++) // continue�� �ݺ����� ������ ����.
		{
			if (i % 2 == 0)
			{
				continue;
			}

			sum+=i;
			System.out.print("\t" + i); 
		}
/*
i			0	1	2	3	4	5	6	7	8	9
���ȭ��:			1		3		5		7		9

*/
		System.out.println("\n 1~10������ Ȧ���� �� : " + sum);

		System.out.println("Hello World!");
	}
}
