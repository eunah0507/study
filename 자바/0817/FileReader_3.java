package ja_0817;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileReader_3 { //Scanner 쓰는 방법

	public static void main(String[] args) {
		
		try
		{
			//파일 객체 생성
			File file = new File("c:\\kbs\\mbc.345");
			
			//스캐너로 파일 읽기
			Scanner scan = new Scanner(file);
			
			while(scan.hasNextLine())
			{
				System.out.println(scan.next());
//				System.out.println(scan.useDelimiter("\\n").next());
//				NoSuchElementException는 존재하지 않는 것을 가져오려고 할 떼 발생합니다.
			}
		} 
		catch (FileNotFoundException e)	{}
		catch (NoSuchElementException e){}
		
	
	}
}
