package ja_0726;

public class String_5 {
	public static void main(String[] args) {
		
		
		String[] joomin = { "9903231523645" , "8210112523645", "0412314231002" ,
						"8402162524445", "8612031523645", "0605073011225",
						"8709172553645", "9803252453544" , "1212125011223"};
		
		System.out.println();
		
		//joomin 배열에서 남여 성별을 구하시오 // 다시 해보기
		
		for(int i = 0; i < joomin.length; i++)
		{
			if (joomin[i].charAt(6) == '1' || joomin[i].charAt(6) == '3') 
			{
				System.out.println(" " + joomin[i] + "는 남자입니다.");
			}
			else if (joomin[i].charAt(6) == '2' || joomin[i].charAt(6) == '4') 
			{
				System.out.println(" " + joomin[i] + "는 여자입니다.");
			}
			else
			{
				System.out.println(" " + joomin[i] + "는 사람이 아닙니다.");
			}
		}
	}
}
