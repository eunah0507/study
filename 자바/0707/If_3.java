import java.util.Scanner;

class If_3 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		System.out.print("점수를 입력하세요!!");
		
		int grade = in.nextInt();

		String hak = "";
		
		if (grade >=98)
		{
			hak = "A++";
		}else if (grade >=94)
		{
			hak = "A";
			/*
			if(grade >= 98)
			{ hak += "++"; // hak = hak + "++"
		}else if (grade >= 90
			hak += "--" // hak = hak + " --"

		}
			*/
		}
		else if (grade >=90)
		{
			hak = "A-";
		}else if (grade >= 80)
		{
			hak = "B";
		}else if (grade >= 70)
		{
			hak = "C";
		}else if (grade >= 60)
		{ 
			hak = "D";
		} else // else 뒤에는 조건이 붙지 않는다.
		{
			hak = "F";

		}
		System.out.println("성적은" + hak + "입니다. ");

		System.out.println("Hello World!");
	}
}
