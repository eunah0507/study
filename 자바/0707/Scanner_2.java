import java.util.Scanner;

class Scanner_2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		float a;
		double b;

		double c;

		System.out.print("�Ǽ��� ������ 2���� �Է��Ͻÿ� >> ");
		// Scnner Ŭ������ ����Ͽ� Ű���忡�� �Ǽ� �Է�

		a = input.nextFloat(); //Scanner Ŭ������ �޼ҵ�
		b = input.nextDouble();

		c = a + b; 

		System.out.printf("%9f + %9f = %9.2f \n", a,b,c);
		System.out.println("Hello World!");
	}
}
