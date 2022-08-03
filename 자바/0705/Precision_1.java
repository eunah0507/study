class Precision_1 
{
	public static void main(String[] args) 
	{

		float ff_1 = 1.234567890123456789F;
		double dd_1 = 1.234567890123456789;

		float ff_2 = 0.100000001f;
		double dd_2 = 0.10000001;
		double dd_3 = 0.100000000000001;
		double dd_4 = ff_1;
		double dd_5 = ff_2;

		
		System.out.println(ff_1);
		System.out.println(dd_1);
		System.out.println(ff_2);
		System.out.println(dd_2);
		System.out.println(dd_3);
		System.out.println(dd_4);
		System.out.println(dd_5);
		System.out.println("Hello World!");
	}
}
