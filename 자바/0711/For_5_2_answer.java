class For_5_2_answer
{
	public static void main(String[] args) throws Exception
	{
		int first,second;

		System.out.println("ù��° ���� �Է�");
		first = System.in.read()-'0'; //-48�� ���ϸ� �ƽ�Ű�ڵ尪���� ����
		
		System.in.read(); // �ѹ� �� �Է¹޾ƾ� �ϴϱ� enterŰ (2byte)ó������
		System.in.read();

		System.out.println("�ι�° ���� �Է�");
		second = System.in.read()-'0'; // �� ���ķδ� �Է¹��� �ʾƼ� 2byte ó�� ������
		
		if (first>second)
		{
			int temp = 0;   // A=B��� �ϸ� �����Ǵ°��� �ƴϴ�. A=TEMP=B��� ����� ������ �ȴ�.
			temp = first;
			first = second;
			second = temp;
		}
		
		// For�� �̿��� ������ �����

		for (int i = first; i <=second ;i++ )
		{
			for (int j = 1; j <= 9 ; j++ )
			{
			System.out.println ( i + " * " + j + " = " + (i * j));
		    	}
			}
			System.out.println();
		}
}
		
	

