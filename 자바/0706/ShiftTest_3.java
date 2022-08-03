class ShiftTest_3 
{
	public static void main(String[] args) 
	{
		// 숫자 20의 3번째 비트는 무엇인가요

		int a = 20;
		System.out.println(Integer.toBinaryString(a));

		a = a >> 3;
		a = a & 1;
		//   10100 = 20
		
		System.out.println(" 20의 3번째 비트는 : " + a);
		System.out.println("Hello World!");
	}
}
