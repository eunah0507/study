class  Arithmetic_4
{
	public static void main(String[] args) throws Exception
	{
		System.out.print(" �ϳ��� ���ڸ� �Է��Ͻÿ�! ");

		int yy = System.in.read();

		char tt = (char)yy;

		// char tt = 'k';

		if ((tt >= 'a' && tt <= 'z') || (tt >= 'A' && tt <= 'Z'))
		{
			System.out.println(" �Է��Ͻ� ���ڴ� ��ȿ�մϴ�.");
		}
		else {
			System.out.println(" �Է��Ͻ� ���ڴ� ��ȿ���� �ʽ��ϴ�.");
		}
		System.out.println("Hello World!");
	}
}
