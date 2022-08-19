package ja_0817;

import java.io.File;

public class Dir {

	public static void main(String[] args) {
		
		//이미지 디렉토리 출력
		
		File dir = new File("src\\images\\");
//		File dir = new File("..\\..\\..\\");// 맨 처음 파일을 보여달라는 것(시작하는 곳)
		
		String[] strs = dir.list();
		
		for (int i = 0; i < strs.length; i++) 
		{
			int str2 = strs[i].lastIndexOf(".");
			
			String  str3 = strs[i].substring(str2+1);
			
			if (str3.equals("gif"))
			{
				System.out.println(strs[i]);
				
			}					
		}
		
		for (int i = 0; i < strs.length; i++)
		{
			
			System.out.println("현재 디렉토리 파일 : " + strs[i]);
			
		}	
	}
}
