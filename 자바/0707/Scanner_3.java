import java.util.Scanner;

class Scanner_3 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//Scanner Ŭ������ ����Ͽ� Ű���忡�� ���ڿ� �Է�

		String greeting, name, kbs;

		System.out.print("�λ� ���� �Է��ϼ���. >>");
		greeting = input.nextLine();

		System.out.print("��� �̸��� �Է��ϼ���. >> ");
		name = input.nextLine();

		kbs = greeting + name;

		System.out.println("�Է��� ���� : " + greeting + "�� �̸��� : " + name + "�Դϴ�.");
		System.out.println("�Է��� ����2 : " + kbs);
		System.out.println("Hello World!");

		// int�� ���ڸ� �Է��ϸ� ����� �� ����
		// string�� ���ڵ� ���ڿ��� �ν��Ѵ�
	}
}
