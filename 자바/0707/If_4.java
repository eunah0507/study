class If_4 
{
	public static void main(String[] args) throws Exception
	{
		int ch;

		System.out.println("���ڸ� �Է��ϼ��� : ");
		ch = System.in.read();

		if (ch == 'A' || ch == 'a')
		{
			System.out.println("America");
			System.out.println("Australia");
		}else if (ch == 'K' || ch == 'k')
		{	System.out.println("Korea");
			System.out.println("Kuwait");
		}
		else if(ch == 'M' || ch == 'm') //�������� �� else�� �ȿ͵� �ȴ�. else if�� �͵� �ȴ�.
		{	System.out.println("Mexcio");
			System.out.println("Monaco");
		}


		System.out.println("Hello World!");
	}
}
