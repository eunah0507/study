class Switch_3 
{
	public static void main(String[] args) 
	{
		char ch = (char)(Math.random() * 4 + 'A'); //������ ���� �˾Ƶα�. �������� ���ڸ� ������ش�.

		int score = 0;

		switch (ch)
		{
		case 'A':
			score = 90;
			break;
		case 'B':
			score = 80;
			break;
		case 'C':
			score = 70;
			break;
		case 'D':
			score = 60;
			break;
		default :
			score = 0;
			break;
		
		}
		System.out.println("����� ������" + score + "�Դϴ�.");

		System.out.println("Hello World!");
	}
}
