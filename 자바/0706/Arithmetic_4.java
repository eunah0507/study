class  Arithmetic_4
{
	public static void main(String[] args) throws Exception
	{
		System.out.print(" 하나의 문자를 입력하시오! ");

		int yy = System.in.read();

		char tt = (char)yy;

		// char tt = 'k';

		if ((tt >= 'a' && tt <= 'z') || (tt >= 'A' && tt <= 'Z'))
		{
			System.out.println(" 입력하신 문자는 유효합니다.");
		}
		else {
			System.out.println(" 입력하신 문자는 유효하지 않습니다.");
		}
		System.out.println("Hello World!");
	}
}
