class Arithmetic_7 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("�� ���ڸ� �Է��ϼ���!");

		int a = System.in.read() - 48;

		int b,c,d;

			b = ~a;
			c = b + 1;
			d = ~(~a);

			System.out.println(a + " �� ���� 1�� ���� : " + b);
			System.out.println(a + "�� ���� 2�� ���� : " + c);
			System.out.println(a + " ~~a : " + d);

		System.out.println("Hello World!");
	}
}
