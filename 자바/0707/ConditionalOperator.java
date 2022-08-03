class ConditionalOperator 
{
	public static void main(String[] args) 
	{
		int a = 14, b = 21, c = 43, d = 59;

		int max;
		int min;

		//조건 연산자
		// 형식 =>  조건식 ? 식1 : 식2

		max = (a>b) ? a : b;
		max = (max > c) ? max : c;
		max = (max > d) ? max : d;

		min = (a<b) ? a : b;
		min = (min < c) ? min : c;
		min = (min < d) ? min : d;

		System.out.println("max : " + max );
		System.out.println("min : " + min);
		System.out.println("Hello World!");
	}
}
