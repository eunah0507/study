package ja_0726;

public class String_4 {
	public static void main(String[] args) {
		
		int i;
		
		String str = "2002 WorldCup Korea";
		
		System.out.println("정상 문자열 : " + str);
		System.out.println("문자열 뒤집기 : " );
		
		for (i = str.length() - 1; i >= 0; i--) 
			//0번부터 시작하니까 -1 // i-- 거꾸로 세우겠다는 의미
		{
			System.out.print(str.charAt(i));	
		}
		
		System.out.println("\n 짝수 문자열 : ");
		
		for (int j = 0; j < str.length(); j++) 
		{
			if (j%2 != 0) //0부터 시작해서 홀수가 짝수값이 나온다.
			{
				System.out.print(str.charAt(j));
			}
			else
			{
				System.out.print(" ");
			}
		}
	}
}
