package ja_0726;

public class Test_2 {
	public static void main(String[] args) {
		
		
		int [] num = { 78, 66, 43 , 89, 94, 54, 37};
		
		//오름차순으로 배열 정리 // 내가 한 거 다 못함, 다시 해보기
		System.out.println("\n *****************   정렬전 문자열 ********************* \n");
		
		for (int i = 0; i < num.length; i++) 
		{
			System.out.print(num[i] + "\t");
		}
		
		System.out.println("\n \n ******************** 정렬후 문자열 ********************** \n");
		
		for (int i = 0; i < num.length -1 ; i++) 
		{
			for (int j = i +1; j < num.length; j++) 
			{
				
				//compareTo = 문자열을 비교하는 코드
				if (num[i] < num[j])
				{
					int temp = num [i];
					num[i] = num [j];
					num[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < num.length; i++) 
		{
			System.out.print(num[i] + "\t");
		}
		
//		System.out.println("\n *****************   정렬전 문자열 ********************* \n");
//		
//		for (int i = 0; i < num.length; i++) 
//		{
//			System.out.print(num[i] + "\t");
//		}
//		
//		
//		System.out.println("\n \n ******************** 정렬후 문자열 ********************** \n");
//	
//		for (int i = 0; i < num.length -1 ; i++) 
//			{
//				for (int j = i +1; j < num.length; j++) 
//				{
//					
//					//compareTo = 문자열을 비교하는 코드
//					if (num[i]>num[j])
//					{
//						int temp = num [i];
//						num[i] = num [j];
//						num[j] = temp;
//					}
//				}
//			}
//			
//			for (int i = 0; i < num.length; i++) 
//			{
//				System.out.print(num[i] + "\t");
//			}
	}
}
