class For_2 
{
	public static void main(String[] args) 
	{
		int cnt, sum = 0;

		for (cnt = 1; cnt <= 100 ; cnt++ )
		{
			//3�� 7�� ������� ���� ���Ͻÿ�.
			if (cnt % 21 == 0)
			{ 
				sum += cnt; 
			}
		}

		System.out.println(" 3�� 7�� ����� �� : " + sum);
		System.out.println("Hello World!");
	}
}

/*
2��° Ǯ�̹��

if ((cnt % 3 == 0) && (cnt % 7 == 0))
{
	sum += cnt;
}

3��° Ǯ�̹��

for ( cnt = 1 ; cnt <=100; cnt++)

{if ( cnt % 3 == 0)
{
	if (cnt % 7 == 0)
	{ sum += cnt;
	}
	}

*/
