package ja_0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_6 {
	public static void main(String[] args) {
		
		try
		{
			input();
		}
		catch (ArithmeticException e)
		{
		//	System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("test");
		}
		
		catch(IOException e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		catch(NumberFormatException e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
		
public static void input() throws  IOException, NumberFormatException, ArithmeticException
{
	BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
	
	while(true)
	{
		System.out.print("첫번째 값을 입력하세요");
		int num1 = Integer.parseInt(in.readLine());
		
		System.out.print("두번째 값을 입력하세요");
		int num2 = Integer.parseInt(in.readLine());
	
		dividing(num1, num2);
	}
}

public static void dividing(int num1, int num2) throws ArithmeticException
{
	System.out.println(num1 + " / "  + num2 + " = " + num1 / num2);
}
}