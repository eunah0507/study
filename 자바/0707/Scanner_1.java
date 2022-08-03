import java.util.Scanner;
class Scanner_1 
{
	public static void main(String[] args) 
	{
		// Scanner 클래스 참조 객체 input 생성

		Scanner input = new Scanner(System.in);

		int a,b,c,d,e,k,t,y;
		
		double dd;

		System.out.print("정수형 데이터 5개를 입력하시오. >> ");
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
		System.in.read()메소드는 키보드로부터 키입력을 받은 후에 입력
		받은 내용을 다시 화면에 출력한다. System.in.read() 메소드는 사용자가
		입력한 값을숫자 형태로 인식하고 이를 in.read() 즉 해당 문자에 대한 유니코드 값 형태로
		읽어온다. 그러므로 입력받은문자를 다시 출력하기 위해서는 char 형으로 변환해야 한다.

		사용자가 입력한 내용을 곧바로 프로그램에 전달하는 것이 아니라 버퍼에
		저장되어 있다가 [Enter]키를 눌러야 System.in.read() 메소드가
		버퍼로 부터 데이터를 읽어 온다. 사용자는 화면에서 한번에 여러 글자를
		입력할 수 있지만 System.in.read()메소드는 한번에 한 문자 밖에 못 읽는다.
		키보드를 통해서 사용자로부터 데이터를 입력 받는 방법은
		System.in.read()메소드보다 Scanner 클래스를 사용하는 것이 더 편하다.

		https://docs.oracle.com/javase/11/docs/api/overview-summary.html
		*/

		System.out.println("Hello World!");
	}
}
