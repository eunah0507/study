import java.util.Scanner;

class For_5_1_answer
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է�");
		int first = input.nextInt();

		System.out.println("�ι�° ���� �Է�");
		int second = input.nextInt();
		
		if (first>second)
		{
			int temp = 0;
			temp = first;
			first = second;
			second = temp;
		}
		
		// For�� �̿��� ������ �����

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
		
	

