class Return_1 
{
	public static void main(String[] args) //void�� return ���� �ʴ´�.
	{
		int result1; //�޼ҵ�� � ������ �Ѵ�.
		int result2; //�޼ҵ�� � ������ �Ѵ�.
		int result3; //�޼ҵ�� � ������ �Ѵ�.
		double result4; //�޼ҵ�� � ������ �Ѵ�.

		result1 = sum(15, 27); //����
		result2 = sub(15, 27); //�E��
		result3 = mul(15, 27); //����
		result4 = div(15, 27); //������ �Ҽ��� ���� 3�ڸ����� ������ �ϱ�

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

