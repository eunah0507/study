import java.util.Scanner;

class For_5_1
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int a, b;

		System.out.print("�˰����ϴ� ���� �Է��Ͻÿ�.");
		a = input.nextInt();
		System.out.print("�˰����ϴ� ���� �Է��Ͻÿ�.");
		b = input.nextInt();
		
		// For�� �̿��� ������ �����

		for (int i = 2; i <=9 ;i++ )
		{
			for (int j = 1; j <= 9 ; j++ )
			{
				if (a <= i || b <=i) //a = 3   b = 6 => 3 ���� ũ�ų� ����
				{ 
					if (a >= i || b>=i)//a = 3   b = 6 => 6 ���� �۰ų� ����
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
