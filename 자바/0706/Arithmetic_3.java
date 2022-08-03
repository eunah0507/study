class Arithmetic_3 
{
	public static void main(String[] args) 
	{
		boolean a,b,c,d;
		
		// 논리 연산자
		// & (and) , |(or), ! (not)

		// 단축 논리 연산자 (Short Circuit Logical Operator)
		// &&, ||

		// and 연산자는 앞이 거짓이면 뒷 연산은 하지 않는다, or연산자는 앞이 참이면 뒷 연산은 하지 않는다.

		a = (3 > 10) & (10 > 3);
		b = (3 > 10) && (10 > 3);

		c = (10 > 3) | (3 > 10);
		d = (10 > 3) || (3 > 10);

		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		System.out.println(" c = " + c);
		System.out.println(" d = " + d);

		System.out.println("Hello World!");
	}
}
