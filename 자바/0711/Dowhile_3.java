import java.util.Scanner;


class Dowhile_3 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		// Dowhile������ ������ �����
		
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
