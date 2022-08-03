class Operator_3 
{
	public static void main(String[] args) 
	{

		int a = 5, b = 6, c, d, f = 7;

		c = a++ * 4 / --f; // c = a* 4 => a = a+1
		d = ++b * 5 - ++f; // b = b + 1 => d = b*5

		System.out.println(" a : " + a + ", b : " + b , "f : " + f);
		System.out.println(" c : " + c + ", d : " + d);

		System.out.println("Hello World!");
	}
}
