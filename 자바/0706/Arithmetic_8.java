class Arithmetic_8 
{
	public static void main(String[] args) throws Exception
	{
		int ch, upper, lower;

		System.out.print("���ĺ��� �Է��ϼ���!");
		ch = System.in.read();

		if (ch >= 'A' && ch <= 'Z')
		{
			lower = ch | 0x20; // +32
			System.out.println((char)ch + "�� �ҹ��� : " + (char)lower);
		}
		else {
			upper = ch & 0xDF; //-32
			System.out.println((char)ch+"�� �빮�� : " + (char)upper);
		}

		System.out.println("Hello World!");
	}
}
