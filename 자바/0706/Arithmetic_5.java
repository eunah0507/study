class Arithmetic_5
{
	public static void main(String[] args) throws Exception
	{
		int ckk;

		System.out.print("0 또는 1을 입력하세요!");
		ckk = System.in.read()-48; //48을 쓰는 이유 : 아스키코드 0을 출력하기 위해

		if (ckk == 0)
		{
			System.out.println(" 23 / 7 = " + (23 / 7 ));
		}
		else {
			System.out.println(" 23 % 7 = " + (23%7));
		}
		System.out.println("Hello World!");
	}
}
