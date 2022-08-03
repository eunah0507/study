class While_3_answer 
{
	public static void main(String[] args) 
	{

		/* 13m 우물 속에 달팽이가 살고 있습니다.
			이 달팽이는 하루에 3m를 오르고 밤에는
			1m미끄러집니다. 이 달팽이가 우물에서 
			탈출하는 날짜는 며칠입니까.*/

			int dal = 0;
			int count = 0;

			while (true)
			{	
				dal +=3;
				count ++;

				if (dal >= 13)
				{
					break;
				}
				dal -=1;
				System.out.println("dal = " + dal + "m");
			}

		System.out.println(" 달팽이가 탈출하는 날은 : " + count + "일 입니다.");
		System.out.println("Hello World!");

	}
}
