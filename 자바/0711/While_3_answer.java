class While_3_answer 
{
	public static void main(String[] args) 
	{

		/* 13m �칰 �ӿ� �����̰� ��� �ֽ��ϴ�.
			�� �����̴� �Ϸ翡 3m�� ������ �㿡��
			1m�̲������ϴ�. �� �����̰� �칰���� 
			Ż���ϴ� ��¥�� ��ĥ�Դϱ�.*/

			int dal = 0;
			int count = 0;

			while (true)
			{	
				dal +=3;
				count ++;

				if (dal >= 13)
				{
					break;
				}
				dal -=1;
				System.out.println("dal = " + dal + "m");
			}

		System.out.println(" �����̰� Ż���ϴ� ���� : " + count + "�� �Դϴ�.");
		System.out.println("Hello World!");

	}
}
