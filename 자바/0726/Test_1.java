package ja_0726;

public class Test_1 {
	public static void main(String[] args) {
		
		String[] joomin = {"9003231523645", "9821011252364",
							"9402162524445", "9612031523645",
							"9909172553645", "9803232345322" };
		
		//substring 이용해서 남녀 구별하기
		
//		for (int i = 0; i < joomin.length; i++) //내가 한 거 끝까지 못했다. 다시 해보기
	
//		{ 
//			int index = joomin[i].indexOf(2);
//			String ddd = joomin[i].substring(6, index);
//			String ext = joomin[i].substring((index+1), joomin[i].length());
//			
//			if (index % 2 == 0) 
//			{
//				System.out.println(joomin[i] + "은 여자입니다.");
//			}
//			else
//			{
//				System.out.println(joomin[i] + "은 남자입니다.");
//			}
//		}
//		
		
		for (int i = 0; i < joomin.length; i++) 
		{
			if (joomin[i].substring(6,7).equals("1")) 
				{
					System.out.println(" " + joomin[i] + "는 남자 입니다.");
				}	
			else if (joomin[i].substring(6,7).equals("2")) 
				{
				System.out.println(" " + joomin[i] + "는 여자 입니다.");
				}
			else
				System.out.println(" " + joomin[i] + "는 사람이 아닙니다.");
				
		}
	}
}
