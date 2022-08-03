class Operator_10 
{
	public static void main(String[] args) 
	{
		float ff = 0.1f;
		double dd = 0.1;
		double dd2 = (double)ff;

		System.out.println("10.0 == 10.0f = " + (10.0 == 10.0f));
		System.out.println("0.1 == 0.1f = " + (0.1 == 0.1f));
		System.out.println("ff = " + ff);
		System.out.println("dd = " + dd);
		System.out.println("dd2 = " + dd2);
		System.out.println("ff = dd = " + (ff==dd) );
		System.out.println("dd == dd2 = " + (dd == dd2));
		System.out.println("dd2 == ff = " + (dd2 == ff));



		System.out.println("Hello World!");
	}
}
