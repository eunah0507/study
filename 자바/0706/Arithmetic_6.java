class Arithmetic_6 
{
	public static void main(String[] args) 
	{
		int a,b,c;

		a = 13;
		b = 10;

		c = a & b ;
		System.out.println(" a & b = " + c);

		c = a | b;
		System.out.println("a | b = " + c);

		c = a^b; // 값이 다르면 1 같으면 0 , 부정논리합이라 말한다
		System.out.println("a^b=" + c);

		c = ~a; // 1의 보수값
		System.out.println(" ~ a = " + c);

		System.out.println("Hello World!");
	}
}
