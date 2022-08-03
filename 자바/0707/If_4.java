class If_4 
{
	public static void main(String[] args) throws Exception
	{
		int ch;

		System.out.println("문자를 입력하세요 : ");
		ch = System.in.read();

		if (ch == 'A' || ch == 'a')
		{
			System.out.println("America");
			System.out.println("Australia");
		}else if (ch == 'K' || ch == 'k')
		{	System.out.println("Korea");
			System.out.println("Kuwait");
		}
		else if(ch == 'M' || ch == 'm') //마지막에 꼭 else가 안와도 된다. else if가 와도 된다.
		{	System.out.println("Mexcio");
			System.out.println("Monaco");
		}


		System.out.println("Hello World!");
	}
}
