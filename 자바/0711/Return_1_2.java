class Return_1_2 
{
	public static void main(String[] args) //void�� return ���� �ʴ´�.
	{
		
		sum(15, 27); //����
		sub(15, 27); //�E��
		mul(15, 27); //����
		div(15, 27); //������ �Ҽ��� ���� 3�ڸ����� ������ �ϱ�

		/*System.out.println("15 + 27 = " + result1);
		System.out.println("15 - 27 = " + result2);
		System.out.println("15 * 27 = " + result3);
		System.out.printf("\n15 / 27 = %7.3f" , result4);

		System.out.println("Hello World!");*/
	}

	static void sum(int x, int y) //return�� ������ �����ϴ�.
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

