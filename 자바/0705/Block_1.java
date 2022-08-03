class Block_1 
{
	public static void main(String[] args) 
	{

		int a = 100;
		int b = 77;
		
		{
		 b = 30; // 변수의 유효 범위
			System.out.println("변수 a = " + a + ", 변수 b = " + b );
		}
			System.out.println("변수 a = " + a + ", 변수 b = " + b );
		System.out.println("Hello World!");
	}
}
