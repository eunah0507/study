package ja_0720;

class SamdasuException extends Exception
{
	public SamdasuException(String a)
	{
		super(a);
	}
}
public class WaterException {
	public static void main(String[] args) {
		
		int b = 150;
		
		try
		{
			if (150 % 2 != 1)
			{
				System.out.println("예외처리");
					throw new SamdasuException("삼다수");
			}
		}	
		catch (SamdasuException e)
		{
			System.out.println("물은 삼다수");
			System.err.println("물은 삼다수");
			e.getMessage();
		
		
		}
	
	}

}
