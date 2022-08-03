package ja_0720;

class JeongException extends Exception // 상속받을 exception이 없지않나?
{
	public JeongException(String str)
	{
		super(str); // 상속받을게 없는데 왜 super를 썼지?
	}
}
/*
 * 		throw new Exception("IO => 입출력 예외 발생");
 * 1. Exception 클래스
 * 2. super() 하면 상위클래스 불러오기
 * 3. super(String) == Exception(String) == Exception("IO => 입출력 예외 발생")
 * 
 *  * */

public class UserExceptionTest {
	public static void main(String[] args) {
		
		int abc = 33;
		
		try 
		{
			if (abc % 5 != 0) 
			{
				throw new JeongException ("나의 전용 예외");
			}
		} 
		catch(JeongException e)
		{
			System.err.println("나도 예외로 동작합니다.");
			System.out.println("나도 예외로 동작합니다.");
			//e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}
}
