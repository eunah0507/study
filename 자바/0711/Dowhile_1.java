class Dowhile_1 
{
	public static void main(String[] args) 
	{

		int cnt = 1, sum = 0, even = 0, odd = 0;

		do
		{
			sum += cnt;

			if (cnt%2==0)
			{
				even += cnt;
			}
			else
			{
				odd +=cnt;
			}
			cnt++;
		}
		while (cnt <= 100);
		System.out.println("1 + 2+ 3 ~ + 100 =" + sum);
		System.out.println("Â¦¼öÇÕÀº = " + even);
		System.out.println("È¦¼öÇÕÀº = " + odd);
		System.out.println("Hello World!");
	}
}
