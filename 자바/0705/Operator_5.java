class Operator_5 
{
	public static void main(String[] args) throws Exception
	{
		int ccc;

		System.out.print(" 한문자를 입력하세요 !!");

		ccc = System.in.read();

		if (ccc>= 'A' && ccc<= 'Z')
		{
			char lowerCase = (char)(ccc+32);

			System.out.println("입력한 문자의 소문자는 " + lowerCase);
		}
		else
		{
			char upperCase = (char)(ccc-32);
			System.out.println("입력한 문자의 대문자는" + upperCase);
		System.out.println("Hello World!");
	}
}
}
