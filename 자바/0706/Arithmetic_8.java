class Arithmetic_8 
{
	public static void main(String[] args) throws Exception
	{
		int ch, upper, lower;

		System.out.print("알파벳을 입력하세요!");
		ch = System.in.read();

		if (ch >= 'A' && ch <= 'Z')
		{
			lower = ch | 0x20; // +32
			System.out.println((char)ch + "의 소문자 : " + (char)lower);
		}
		else {
			upper = ch & 0xDF; //-32
			System.out.println((char)ch+"의 대문자 : " + (char)upper);
		}

		System.out.println("Hello World!");
	}
}
