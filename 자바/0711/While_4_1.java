import java.util.Scanner;

class While_4_1
{
	public static void main(String[] args) 
	{
		//while문으로 구구단 만들기
		Scanner input = new Scanner(System.in);
		
		System.out.print("단을 입력하세요");
		int first = input.nextInt();

		System.out.print("단을 입력하세요");
		int second = input.nextInt();
		
		if (first>second)
		{
			int temp = 0;
			first = temp;
			first = second;
			second = temp;
		}
		
		while (first<=9)
		{
			while (second <=9)
			{
				System.out.println(first + "*" + second + "=" + (first*second));
				second++;
			}
			first++;
			second = 1;

			System.out.println();
		}
		System.out.println("Hello World!");

	}
}
