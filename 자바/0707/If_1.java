import java.util.Scanner;

class If_1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

			System.out.println("�湮Ƚ���� ��������!");

			int visitCount = input.nextInt();

			if (visitCount<1)
			{
				System.out.println("ó�� ���̱���. �湮���ּż� �����մϴ�.");
				System.out.println("ó�� ���̱���. �湮���ּż� �����մϴ�.");
			}else
		{System.out.println("�ٽ� �湮�� �ּż� �����մϴ�.");
			System.out.println(visitCount+1+"�� �湮 �Ͽ����ϴ�.");
		}

		System.out.println("Hello World!");
	}
}
