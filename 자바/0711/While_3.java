class While_3 
{
	public static void main(String[] args) 
	{

		/* 13m �칰 �ӿ� �����̰� ��� �ֽ��ϴ�.
			�� �����̴� �Ϸ翡 3m�� ������ �㿡��
			1m�̲������ϴ�. �� �����̰� �칰���� 
			Ż���ϴ� ��¥�� ��ĥ�Դϱ�.*/

			int sum = 0;
			int i = 0;

			while (true)
			{	i++; // ��¥�� �Ϸ羿 ����
				sum+=3; // �Ϸ� 3m�� ����
				
				if (sum >= 13)
				{
					break;
				}
				sum-=1; //�Ϸ� 1m�� ������
				
			}

		System.out.println(" �����̰� Ż���ϴ� ���� : " + i + "�� �Դϴ�.");
		System.out.println("Hello World!");

	}
}
