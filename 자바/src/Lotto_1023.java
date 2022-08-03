package ja_0712;

public class Lotto_1023 {
	public static void main(String[] args) {
		
		int [] ball = new int [45];
		
		for (int i = 0; i < ball.length; i++) 
		{
			ball[i] = i+1;
			//1~45까지 나오기 때문에 (배열은 0번부터 시작하니까)
		}
		
		int temp = 0;
		int j = 0;
		
		for (int i = 0; i < 300; i++) 
		{
			j = (int)(Math.random()*45);
			
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		
		System.out.println();
		System.out.println("\n 1023회차 로또 당첨번호 \n");
		
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + "\t");//무작위로 뽑는게 아니고 줄세운 후 6개를 뽑음
		}
		System.out.println();
		System.out.println("\n 보너스 당첨 번호 \n");
		System.out.println("\t" + ball[6] + " 번 입니다.\n");
		
		
		
	}
}
