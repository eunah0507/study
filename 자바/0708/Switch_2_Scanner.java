import java.util.Scanner;
class Switch_2_Scanner 
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("����� ������ �Է��ϼ���");
		
		int score = input.nextInt();

		switch(score)
		{
			case 100:
				System.out.println("����� ������ 100 ��ǰ�� �������Դϴ�.");
				break;
			case 200:
				System.out.println("����� ������ 200 ��ǰ�� TV�Դϴ�.");
				break;
			case 300:
				System.out.println("����� ������ 300 ��ǰ�� ��Ʈ���Դϴ�.");
				break;
			case 400:
				System.out.println("����� ������ 400 ��ǰ�� �ڵ����Դϴ�.");
				break;
			default :
				System.out.println("�˼������� ����� ��ǰ�� �����ϴ�.");
				break;
		}
		System.out.println("Hello World!");
	}
}
