package ja_0817;

import java.io.File;

public class Delete {//요거는 좀 주의해서 실행하기! 파일 지우는 거니까~~
	public static void main(String[] args) {
		
		if (args.length != 1) //argument에 아무것도 안 적었을 때
		{
			System.out.println("Usage : java Delete <file or director> ");
			System.exit(1);			
		}
		
		try {
			delete(args[0]);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}		
	}
	/*
	 * 삭제 정직 메소드
	 * 지정한 파일이나 디렉토리를 삭제하기 전에 삭제가 가능한지 확인
	 * 문제가 방생하면 IllegalArgumentException 을 발생
	 */

	private static void delete(String filename)
	{
		File ff = new File(filename);
		//파일이나 디렉토리가 존재하는지와 쓰기 방지 되었는지 확인
		
		if (!ff.exists())
		{
			fail("Delete : no such file or director : " +filename);
			//System.exit(1);
			
		}
		
		if (!ff.canWrite()) //쓰기 방지 (읽기 전용 파일이라면 삭제 불가능..?)
			//read only 라면 fail("Delete : write protected : " +filename); :삭제 불가능
		{
			
			fail("Delete : write protected : " +filename);
		}
		//디렉토리이면 비어 있는지 확인
		
		if (ff.isDirectory())
		{
			String[] files = ff.list();
			
			if (files.length > 0)
			{
				fail("Delete : directory not empty : " +filename);
				
			}
		}
		//모든 검사를 통과 하면 파일 삭제
		
		boolean success = ff.delete();
		if (!success)
		{
			fail("Delete  : deletion failed!!!!!!");//현재 실행하고 있는 파일은 삭제 안 될 수 있어 벗어나서 삭제 실행시키면 돼
			
		}
		else 
		
			System.out.println("삭제 되었습니다.");
		
	}
	
	private static void fail(String msg) throws IllegalArgumentException
	{
		throw new IllegalArgumentException(msg);
	}
}
