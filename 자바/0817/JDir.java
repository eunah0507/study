package ja_0817;

import java.io.File;

public class JDir {

	public static void main(String[] args) {
		
		if (args.length != 1)//run configuration => argument => C:\\디렉토리\\파일명 입력 해당 파일이나 디렉토리 정보 나옴
		{
			
			System.out.println("사용법 : java JDir  c:\\kortea.txt"); //파일명을 쓰면 파일의 정보를
			                                                        //디렉토리를 쓰면 들어있는 파일들의 정보(크기 등)
			System.exit(111);
			
		}
		
		File file = new File(args[0]); //파일 나열 적었을 때 맨 처음 것
		
		if (!file.exists())
		{
			
			System.out.println(args[0]+ "파일이 존재하지 않습니다.");
			System.exit(0);
			
		}
		System.out.println("절대 경로 : " + file.getAbsolutePath());
		
		if (file.isDirectory()) //입력값이 디렉토리라면
		{
			File[] list = file.listFiles();
			
			System.out.println(args[0] + "디렉토리 파일 목록 출력");
			
			for (int i = 0; i < list.length; i++)
			{
				if (list[i].isFile()) //디렉토리 안에 파일일 때는
				{
					
					System.out.println(list[i].getName()+"\t : "+ list[i].length()); //이름과 사이즈
					System.out.println();
					
				}
				else //디렉토리 안에 또 디렉토리일 때!!
				{
					System.out.println(list[i].getName()+"\t [디렉토리] "); 
					System.out.println();
				}
				
			}		
			
		}
		else //입력값 자체가 파일일 떄!!!
		{
			 System.out.println(args[0]+"파일 상세 정보 ");
			 System.out.println("파일 크기 : " + file.length());
			 System.out.println("읽기 속성 : " + file.canRead());
			 System.out.println("파일 경로 : " + file.getParent());
			 System.out.println("숨김 속성 : " + file.isHidden());
			 System.out.println("해쉬 코드 : " + file.hashCode());
			
		}
		
		
	}
}
