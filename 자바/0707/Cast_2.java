class Cast_2 
{
	public static void main(String[] args) 
	{
		char c1 = 'a';
		char c2 = c1;

		char c3 = ' ';
		char c4;

		int ii = c1 + 1;
		int ii2 = c3;
		System.out.println(" ii2 = " + ii2);

		c3 = (char)(c1+1);
		c4 = (char)ii;
		c2 ++;

		
		System.out.println(" ii = " + ii);

		System.out.println(" c2 00 = " + c2);
		System.out.println(" c2 11 = " + ++c2);
		System.out.println(" c2 22 = " + c2);
		System.out.println(" c3 = " + c3);
		System.out.println(" c4 = " + c4);

		System.out.println("Hello World!");
	}
}
