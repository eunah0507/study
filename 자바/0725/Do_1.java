package ja_0725;

public class Do_1 {
	public static void main(String[] args) {
		
		int x = 0;
		int y = 10;
		
		do 
		{
			++x;
			y--;
			
			System.out.print(x + ", " + y + " : "); //y--면 10부터 시작해야하는거 아닌가?
		}
		
		while (x < 5);
		
		System.out.print("\n" + x + "," + y);
	}
}
