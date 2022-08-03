class For_2 
{
	public static void main(String[] args) 
	{
		int cnt, sum = 0;

		for (cnt = 1; cnt <= 100 ; cnt++ )
		{
			//3과 7의 공배수의 합을 구하시오.
			if (cnt % 21 == 0)
			{ 
				sum += cnt; 
			}
		}

		System.out.println(" 3과 7의 공배수 합 : " + sum);
		System.out.println("Hello World!");
	}
}

/*
2번째 풀이방식

if ((cnt % 3 == 0) && (cnt % 7 == 0))
{
	sum += cnt;
}

3번째 풀이방식

for ( cnt = 1 ; cnt <=100; cnt++)

{if ( cnt % 3 == 0)
{
	if (cnt % 7 == 0)
	{ sum += cnt;
	}
	}

*/
