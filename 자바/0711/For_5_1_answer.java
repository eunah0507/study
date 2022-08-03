import java.util.Scanner;

class For_5_1_answer
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
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
		
		// For을 이용한 구구단 만들기

		for (int i = first; i <=second ;i++ )
		{
			for (int j = 1; j <= 9 ; j++ )
			{
			System.out.println ( i + " * " + j + " = " + (i * j));
		    }
		}
			System.out.println();
	}
}
		
	

