class ShiftTest_3 
{
	public static void main(String[] args) 
	{
		// ���� 20�� 3��° ��Ʈ�� �����ΰ���

		int a = 20;
		System.out.println(Integer.toBinaryString(a));

		a = a >> 3;
		a = a & 1;
		//   10100 = 20
		
		System.out.println(" 20�� 3��° ��Ʈ�� : " + a);
		System.out.println("Hello World!");
	}
}
