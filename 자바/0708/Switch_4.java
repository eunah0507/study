class Switch_4 
{
	public static void main(String[] args) 
	{
		int score = (int)(Math.random()*10)+1;

		String msg = "";

		score *= 100;

		msg = "����� ������ " + score + "�̰�, ��ǰ�� ";

		switch (score)
		{
		case 700:
			msg += "������";

		case 800:
			msg += "TV";

		case 900:
			msg += "��Ʈ��";

		case 1000:
			msg += "�ڵ���";
			break;
				
		default :
			msg += "����";
			break;
		}
		System.out.println(msg + "�Դϴ�.");
		
		
		System.out.println("Hello World!");
	}
}
