class Switch_5 
{
	public static void main(String[] args) 
	{
		int score = 88;
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

		System.out.println("��� ������" + grade + "�Դϴ�.");
			
		
		System.out.println("Hello World!");
	}
}
