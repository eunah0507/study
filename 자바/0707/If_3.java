import java.util.Scanner;

class If_3 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���!!");
		
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
		} else // else �ڿ��� ������ ���� �ʴ´�.
		{
			hak = "F";

		}
		System.out.println("������" + hak + "�Դϴ�. ");

		System.out.println("Hello World!");
	}
}
