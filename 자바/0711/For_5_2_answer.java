class For_5_2_answer
{
	public static void main(String[] args) throws Exception
	{
		int first,second;

		System.out.println("첫번째 단을 입력");
		first = System.in.read()-'0'; //-48을 안하면 아스키코드값으로 나옴
		
		System.in.read(); // 한번 더 입력받아야 하니까 enter키 (2byte)처리해줌
		System.in.read();

		System.out.println("두번째 단을 입력");
		second = System.in.read()-'0'; // 이 이후로는 입력받지 않아서 2byte 처리 안해줌
		
		if (first>second)
		{
			int temp = 0;   // A=B라고 하면 교차되는것이 아니다. A=TEMP=B라고 해줘야 교차가 된다.
			temp = first;
			first = second;
			second = temp;
		}
		
		// For을 이용한 구구단 만들기

		for (int i = first; i <=second ;i++ )
		{
			for (int j = 1; j <= 9 ; j++ )
			{
			System.out.println ( i + " * " + j + " = " + (i * j));
		    	}
			}
			System.out.println();
		}
}
		
	

