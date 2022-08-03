class Return_1 
{
	public static void main(String[] args) //void는 return 되지 않는다.
	{
		int result1; //메소드는 어떤 동작을 한다.
		int result2; //메소드는 어떤 동작을 한다.
		int result3; //메소드는 어떤 동작을 한다.
		double result4; //메소드는 어떤 동작을 한다.

		result1 = sum(15, 27); //덧셈
		result2 = sub(15, 27); //뺼셈
		result3 = mul(15, 27); //곱셈
		result4 = div(15, 27); //나눗셈 소숫점 이하 3자리까지 나오게 하기

		System.out.println("15 + 27 = " + result1);
		System.out.println("15 - 27 = " + result2);
		System.out.println("15 * 27 = " + result3);
		System.out.printf("15 / 27 = %7.3f\n" , result4);

		System.out.println("Hello World!");
	}

	static int sum (int x, int y)
	{
		return (x + y);
	}
	static int sub (int x, int y)
	{
		return (x - y);
	}static int mul (int x, int y)
	{
		return (x * y);
	}static double div (int x, int y)
	{
		return ((double)x / y);
	}
}

