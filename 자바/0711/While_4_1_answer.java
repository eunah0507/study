import java.util.Scanner;

class While_4_1_answer
{
	public static void main(String[] args) 
	{
		//while������ ������ �����
		Scanner inn = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���");
		int first = inn.nextInt();

		System.out.println("�ι�° ���� �Է��ϼ���");
		int second = inn.nextInt();
		
		int j = 1;

		if (first>second)
		{
			int temp = 0;
			temp = first; //first = temp�� �ȵȴ�! ������ �߿��ϴ�.
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
