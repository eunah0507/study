import java.io.IOException;

class Dowhile_2 
{
	public static void main(String[] args) throws IOException
	{
		int input = 0;

		System.out.println("������ �Է��Ͻÿ�!!!");
		System.out.println("�Է��� ��ġ���� x Ű�� �����ÿ�!!");

		do
		{
			input = System.in.read();
			System.out.print((char)input);
		}
		while (input != 'x');
		System.out.println("Hello World!");
	}
}
