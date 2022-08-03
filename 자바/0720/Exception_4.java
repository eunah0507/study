package ja_0720;

public class Exception_4 {
	public static void main(String[] args) {
		
		try 
		{
			System.out.println("================예외 발생전=================");
			throw new Exception("IO => 입출력 예외 발생");
		}
		catch(NumberFormatException e)
		{
			System.out.println("내가 만든 예외");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("s내가 만든 엔어;3333333333");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("내가만든 예외44444");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
