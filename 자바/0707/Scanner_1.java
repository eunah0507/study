import java.util.Scanner;
class Scanner_1 
{
	public static void main(String[] args) 
	{
		// Scanner Ŭ���� ���� ��ü input ����

		Scanner input = new Scanner(System.in);

		int a,b,c,d,e,k,t,y;
		
		double dd;

		System.out.print("������ ������ 5���� �Է��Ͻÿ�. >> ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		k = input.nextInt();
		t = input.nextInt();
		

		c = a + b;
		y = k - t;
		
		dd = c / (double)d;

		System.out.printf("%3d + %3d = %4d \n",a,b,c);
		System.out.printf("%3d - %3d = %4d \n",k,t,y);
		System.out.printf("%3d / %3d = %4.5f \n",a,b,dd);

		/*
		System.in.read()�޼ҵ�� Ű����κ��� Ű�Է��� ���� �Ŀ� �Է�
		���� ������ �ٽ� ȭ�鿡 ����Ѵ�. System.in.read() �޼ҵ�� ����ڰ�
		�Է��� �������� ���·� �ν��ϰ� �̸� in.read() �� �ش� ���ڿ� ���� �����ڵ� �� ���·�
		�о�´�. �׷��Ƿ� �Է¹������ڸ� �ٽ� ����ϱ� ���ؼ��� char ������ ��ȯ�ؾ� �Ѵ�.

		����ڰ� �Է��� ������ ��ٷ� ���α׷��� �����ϴ� ���� �ƴ϶� ���ۿ�
		����Ǿ� �ִٰ� [Enter]Ű�� ������ System.in.read() �޼ҵ尡
		���۷� ���� �����͸� �о� �´�. ����ڴ� ȭ�鿡�� �ѹ��� ���� ���ڸ�
		�Է��� �� ������ System.in.read()�޼ҵ�� �ѹ��� �� ���� �ۿ� �� �д´�.
		Ű���带 ���ؼ� ����ڷκ��� �����͸� �Է� �޴� �����
		System.in.read()�޼ҵ庸�� Scanner Ŭ������ ����ϴ� ���� �� ���ϴ�.

		https://docs.oracle.com/javase/11/docs/api/overview-summary.html
		*/

		System.out.println("Hello World!");
	}
}
