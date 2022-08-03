import java.util.Scanner;
class Switch_2_Scanner 
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("당신의 점수를 입력하세요");
		
		int score = input.nextInt();

		switch(score)
		{
			case 100:
				System.out.println("당신의 점수는 100 상품은 자전거입니다.");
				break;
			case 200:
				System.out.println("당신의 점수는 200 상품은 TV입니다.");
				break;
			case 300:
				System.out.println("당신의 점수는 300 상품은 노트북입니다.");
				break;
			case 400:
				System.out.println("당신의 점수는 400 상품은 자동차입니다.");
				break;
			default :
				System.out.println("죄송하지만 당신의 상품은 없습니다.");
				break;
		}
		System.out.println("Hello World!");
	}
}
