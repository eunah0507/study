class While_3 
{
	public static void main(String[] args) 
	{

		/* 13m 우물 속에 달팽이가 살고 있습니다.
			이 달팽이는 하루에 3m를 오르고 밤에는
			1m미끄러집니다. 이 달팽이가 우물에서 
			탈출하는 날짜는 며칠입니까.*/

			int sum = 0;
			int i = 0;

			while (true)
			{	i++; // 날짜가 하루씩 증가
				sum+=3; // 하루 3m씩 오름
				
				if (sum >= 13)
				{
					break;
				}
				sum-=1; //하루 1m씩 떨어짐
				
			}

		System.out.println(" 달팽이가 탈출하는 날은 : " + i + "일 입니다.");
		System.out.println("Hello World!");

	}
}
