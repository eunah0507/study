package ja_0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
		/*
		 * char int string double short....
		 * */
		while(true)
		{// 0나누기 0 은 부정, n나누기 0은 불능
			
			try 
			{
				
				System.out.println("첫번째 값을 입력하세요");
				int num1 = Integer.parseInt( input.readLine());
			
				System.out.println("두번째 값을 입력하세요");
				int num2 = Integer.parseInt(input.readLine());
			
				System.out.println("  "  + num1 + " / " + num2 + " = " + (num1/num2));
			
			} 
			catch (ArithmeticException e)
			{
				System.err.println("몫이 0이 될 수 없습니다.");
			    e.printStackTrace();
				//e.getMessage();
				System.err.println(e.getMessage());
			}
			catch (NumberFormatException e) //NumberFormatException 숫자형식오류
			{
				System.err.println("숫자를 입력하세요.");
				System.err.println(e.getMessage());
			}
			catch (Exception e)
			{
				System.err.println("Exception이 발생하였습니다.");
			} //계층구조를 생각해서 exception이 가장 크기 떄문에 가장 아래에 있어야한다
			finally
			{
				System.out.println("\n 항상 실행되는 내용 \n");
			}
		}
		
		
		
		
	}
}

