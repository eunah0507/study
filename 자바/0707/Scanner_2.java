import java.util.Scanner;

class Scanner_2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		float a;
		double b;

		double c;

		System.out.print("실수형 데이터 2개를 입력하시오 >> ");
		// Scnner 클래스를 사용하여 키보드에서 실수 입력

		a = input.nextFloat(); //Scanner 클래스의 메소드
		b = input.nextDouble();

		c = a + b; 

		System.out.printf("%9f + %9f = %9.2f \n", a,b,c);
		System.out.println("Hello World!");
	}
}
