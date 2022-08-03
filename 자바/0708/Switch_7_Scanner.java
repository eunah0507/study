import java.util.Scanner;

class Switch_7_Scanner
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("당신의 점수를 입력하세요");
		
		int score=input.nextInt();
		
		char grade = ' ';

		switch (score / 10 )
		{
		case 10:
		case 9 :
				grade = 'A';
				break;

		case 8:
				grade = 'B';
				break;
		
		case 7:
				grade = 'C';
				break;

		default:
				grade = 'F';
				break;
		}

		System.out.println("당신 학점은" + grade + "입니다.");
			
		
		System.out.println("Hello World!");
	}
}
