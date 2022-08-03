import java.util.Scanner;


class Dowhile_3 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		// Dowhile문으로 구구단 만들기
		
		System.out.println("첫번째 단을 입력");
		int first = input.nextInt();

		System.out.println("두번째 단을 입력");
		int second = input.nextInt();

				
		if (first>second)
		{
			int temp = 0;
			temp = first;
			first = second;
			second = temp;
		}
		int i = first-1, j = 1;
		
		do
		{
			i++;
			j=1;
			do
			{
				System.out.println(i + "*" + j + "=" + (i*j));
				j++;
			}
			while (j<=9);
			System.out.println();
		}
		while (i < second);
		
		System.out.println("Hello World!");
	}
}
