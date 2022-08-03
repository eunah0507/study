import java.util.Scanner;

class While_4_1_answer
{
	public static void main(String[] args) 
	{
		//while문으로 구구단 만들기
		Scanner inn = new Scanner(System.in);
		
		System.out.println("단을 입력하세요");
		int first = inn.nextInt();

		System.out.println("두번째 단을 입력하세요");
		int second = inn.nextInt();
		
		int j = 1;

		if (first>second)
		{
			int temp = 0;
			temp = first; //first = temp는 안된다! 순서가 중요하다.
			first = second;
			second = temp;
		}
		
		while (first<=second)
		{
			while (j <=9)
			{
				System.out.println(first + "*" + j + "=" + (first*j));
				j++;
			}
			first++;
			j = 1;

			System.out.println();
		}
		System.out.println("Hello World!");

	}
}
