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

		c = a^b; // ���� �ٸ��� 1 ������ 0 , ���������̶� ���Ѵ�
		System.out.println("a^b=" + c);

		c = ~a; // 1�� ������
		System.out.println(" ~ a = " + c);

		System.out.println("Hello World!");
	}
}
