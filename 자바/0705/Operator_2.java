class Operator_2 
{
	public static void main(String[] args) 
	{

		int a,b;

		a = 10;
		b = ++a; // ++a => a = a+1 전위 증가 연산자
		System.out.println(" ++ a = " + a + ", b = " + b);

		a = 10;
		b = a++; //a++ => a = a+1 후위 증가 연산자
		System.out.println(" a++ = " + a + ", b = " + b);

		a = 10;
		b = --a; // --a => a = a - 1 전위 감소 연산자
		System.out.println(" -- a = " + a + ", b = " + b);

		a = 10;
		b = a--; // a = a - 1 후위 감소 연산자
		System.out.println(" a -- = " + a + ", b = " + b);
		System.out.println("Hello World!");
	}
}
