class ShiftTest_2
{
	public static void main(String[] args) 
	{

		int temp;

		System.out.println(-8);
		System.out.println(Integer.toBinaryString(-8));
		System.out.println();

		System.out.println(-4);
		System.out.println(Integer.toBinaryString(-4));
		System.out.println();

		System.out.println(-2);
		System.out.println(Integer.toBinaryString(-2));
		System.out.println();

		System.out.println(-1);
		System.out.println(Integer.toBinaryString(-1));
		System.out.println();

		System.out.println(1);
		System.out.println(Integer.toBinaryString(1)); //00000000000000000000001임 0의미없어서 1로 출력
		System.out.println();

		temp = -8 << 1;
		System.out.println("-8 << 1 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		temp = -8 << 2;
		System.out.println("-8 << 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();

		System.out.println();
		System.out.println(-8);
		System.out.println(Integer.toBinaryString(-8));
		System.out.println();

		temp = -8 >> 1;
		System.out.println("-8 >> 1 " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();

		temp = -8 >> 2;
		System.out.println("-8 >> 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();


		System.out.println();
		System.out.println(-8);
		System.out.println(Integer.toBinaryString(-8));
		System.out.println();
		System.out.println();
		
		temp = -1 >>> 1;
		System.out.println(" -1 >>> 1 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		temp = -8 >>> 2;
		System.out.println(" -8 >>> 2 =" + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();

		System.out.println("Hello World!");
	}
}
