class ConditionalOperator_1 
{
	public static void main(String[] args) 
	{

		int x = 10;
		int y = -25;

		int absX=(x>=0)?x : -x;
		int absY=(y>=0)?y:-y;

		System.out.println("x= 10일때, x의 절대값은 = " + absX);
		System.out.println("y = -25일때,y 절대값은 = " + absY);

		
		System.out.println("Hello World!");
	}
}
