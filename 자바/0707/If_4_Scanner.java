import java.util.Scanner;

class  If_4_Scanner
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String ch;

		System.out.println("문자를 입력하세요");
		ch = input.nextLine();

		if (ch.equals("A") || ch.equals("a"))
		{
			System.out.println("America");
			System.out.println("Australia");
		}
		else if (ch. equals("K") || ch.equals("k"))
		{
			System.out.println("Korea");
			System.out.println("Kuwait");
		}
		else if (ch. equals("M") || ch.equals("m"))
		{
			System.out.println("Monica");
			System.out.println("Monaco");
		}
		System.out.println("Hello World!");
	}
}
