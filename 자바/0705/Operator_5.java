class Operator_5 
{
	public static void main(String[] args) throws Exception
	{
		int ccc;

		System.out.print(" �ѹ��ڸ� �Է��ϼ��� !!");

		ccc = System.in.read();

		if (ccc>= 'A' && ccc<= 'Z')
		{
			char lowerCase = (char)(ccc+32);

			System.out.println("�Է��� ������ �ҹ��ڴ� " + lowerCase);
		}
		else
		{
			char upperCase = (char)(ccc-32);
			System.out.println("�Է��� ������ �빮�ڴ�" + upperCase);
		System.out.println("Hello World!");
	}
}
}
