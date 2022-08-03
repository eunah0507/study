class Arithmetic_7 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("한 숫자를 입력하세요!");

		int a = System.in.read() - 48;

		int b,c,d;

			b = ~a;
			c = b + 1;
			d = ~(~a);

			System.out.println(a + " 에 대한 1의 보수 : " + b);
			System.out.println(a + "에 대한 2의 보수 : " + c);
			System.out.println(a + " ~~a : " + d);

		System.out.println("Hello World!");
	}
}
