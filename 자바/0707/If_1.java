import java.util.Scanner;

class If_1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

			System.out.println("방문횟수를 적으세요!");

			int visitCount = input.nextInt();

			if (visitCount<1)
			{
				System.out.println("처음 오셨군요. 방문해주셔서 감사합니다.");
				System.out.println("처음 오셨군요. 방문해주셔서 감사합니다.");
			}else
		{System.out.println("다시 방문해 주셔서 감사합니다.");
			System.out.println(visitCount+1+"번 방문 하였습니다.");
		}

		System.out.println("Hello World!");
	}
}
