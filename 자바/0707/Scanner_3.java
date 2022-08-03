import java.util.Scanner;

class Scanner_3 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//Scanner 클래스를 사용하여 키보드에서 문자열 입력

		String greeting, name, kbs;

		System.out.print("인사 말을 입력하세요. >>");
		greeting = input.nextLine();

		System.out.print("사람 이름을 입력하세요. >> ");
		name = input.nextLine();

		kbs = greeting + name;

		System.out.println("입력한 내용 : " + greeting + "내 이름은 : " + name + "입니다.");
		System.out.println("입력한 내용2 : " + kbs);
		System.out.println("Hello World!");

		// int는 숫자를 입력하면 출력할 수 없다
		// string은 숫자도 문자열로 인식한다
	}
}
