package ja_0720;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date; //ctrl + shift + o 한번에 처리해준다

public class FileException_1 {
	public static void main(String[] args) {
		
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try 
		{
			fos = new FileOutputStream("error_11.log" , true);
			ps = new PrintStream(fos);
			
			System.setOut(ps);
			
			System.out.println(11);
			System.out.println(22);
			System.out.println(33);
			System.out.println(0 / 0); //예외발생
			System.out.println(44);
		}
		
		catch(Exception e)
		{
			System.out.println(55);
			
			System.err.println("================================");
			System.err.println("예외 발생 시간 : " + new Date());
			
			e.printStackTrace();
			
			System.err.println("예외 메세지 : " + e.getMessage());
			System.err.println("================================");
			System.out.println(66);
		}
		System.out.println(77);
	}
}
