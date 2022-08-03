import java.util.Scanner;

class For_5_1
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int a, b;

		System.out.print("알고자하는 단을 입력하시오.");
		a = input.nextInt();
		System.out.print("알고자하는 단을 입력하시오.");
		b = input.nextInt();
		
		// For을 이용한 구구단 만들기

		for (int i = 2; i <=9 ;i++ )
		{
			for (int j = 1; j <= 9 ; j++ )
			{
				if (a <= i || b <=i) //a = 3   b = 6 => 3 보다 크거나 같기
				{ 
					if (a >= i || b>=i)//a = 3   b = 6 => 6 보다 작거나 같기
					{
						System.out.println ( i + " * " + j + " = " + (i * j));
					}
				}
				
			}
			System.out.println();
		}

		System.out.println("Hello World!");
	}
}
