package ja_0720;

public class Exception_5 {
	public static void main(String[] args) {
		
		try
		{
			//Exception obj = new Exception("고의로 만든 예외 발생");
			//throw obj;
			throw new Exception("고의로 만든 예외 발생"); // 위에 두 줄을 한 줄로 표현 가능
			// 바로 리턴..? 응~ 이해못했어~
		}
		
		catch (Exception e)
		{
			System.err.println("내가 만든 예외~~");
			e.printStackTrace();
					
		}
	}
}
