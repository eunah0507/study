class ByteOverflow 
{
	public static void main(String[] args) 
	{

		short bb = 32700;
		int ii = 32700;
		for (int x = 0; x<=201; x++ )
		{
			System.out.print(bb++);
			System.out.print('\t');
			System.out.println(ii++);
		}

		System.out.println("88 + bb = " + (88 + bb));
		System.out.println("88 + ii = " + (88 + ii));
		System.out.println("Hello World!");
	}
}
