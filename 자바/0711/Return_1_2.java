class Return_1_2 
{
	public static void main(String[] args) //void는 return 되지 않는다.
	{
		
		sum(15, 27); //덧셈
		sub(15, 27); //뺼셈
		mul(15, 27); //곱셈
		div(15, 27); //나눗셈 소숫점 이하 3자리까지 나오게 하기

		/*System.out.println("15 + 27 = " + result1);
		System.out.println("15 - 27 = " + result2);
		System.out.println("15 * 27 = " + result3);
		System.out.printf("\n15 / 27 = %7.3f" , result4);

		System.out.println("Hello World!");*/
	}

	static void sum(int x, int y) //return은 생략이 가능하다.
	{
		System.out.println("15 + 27 = " + (x+y));
		return;
	}
	static void sub(int x, int y)
	{
		System.out.println("15 - 27 = " + (x-y));
		return;
	}
	static void mul(int x, int y)
	{
		System.out.println("15 * 27 = " + (x*y));
		return;
	}
	static void div(int x, int y)
	{
		System.out.printf("15 / 27 = %7.3f \n ", (x/(double)y));
		return;
	}
}

