class Arithmetic_3 
{
	public static void main(String[] args) 
	{
		boolean a,b,c,d;
		
		// �� ������
		// & (and) , |(or), ! (not)

		// ���� �� ������ (Short Circuit Logical Operator)
		// &&, ||

		// and �����ڴ� ���� �����̸� �� ������ ���� �ʴ´�, or�����ڴ� ���� ���̸� �� ������ ���� �ʴ´�.

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
