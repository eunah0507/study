package ja_0720;

public class Exception_7_1 {
	
	public static void main(String[] args) 
	{
		method_1();
	}

	private static void method_1() 
	{

		try
		{
			throw new Exception();
		}
		catch (Exception e){
			System.err.println("Method_1() 메소드에서 예외처리");
		}
	}
}

