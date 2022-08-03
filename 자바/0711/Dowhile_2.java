import java.io.IOException;

class Dowhile_2 
{
	public static void main(String[] args) throws IOException
	{
		int input = 0;

		System.out.println("문장을 입력하시오!!!");
		System.out.println("입력을 마치려면 x 키를 누르시오!!");

		do
		{
			input = System.in.read();
			System.out.print((char)input);
		}
		while (input != 'x');
		System.out.println("Hello World!");
	}
}
