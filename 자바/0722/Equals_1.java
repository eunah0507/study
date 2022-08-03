package ja_0722;

class Queen
{
	int number;
	
	public Queen(int num)
	{
		number = num;
	}
}
public class Equals_1 {
	public static void main(String[] args) {
		
		Queen obj_1 = new Queen(27);
		Queen obj_2 = new Queen(28);
		
		if (obj_1.equals(obj_2))
		{
			System.out.println("obj_1과 obj_2는 같다");
		}
		else
			System.out.println("obj_1과 obj_2는 같지않다.");
			
		System.out.println("obj_1 : " + obj_1.hashCode());
		System.out.println("obj_2 : " + obj_2.hashCode());
		
		if (obj_1 == (obj_2)) // == 은 주소비교 equals는 내용비교
		{
			System.out.println("obj_1과 obj_2는 같다다다다다");
		}
		else
			System.out.println("obj_1과 obj_2는 다다다다다르르르르르르다다다다다.");
			
		System.out.println("obj_1 : " + obj_1.getClass().hashCode());
		System.out.println("obj_2 : " + obj_2.getClass().hashCode());
		
		
		obj_2 = obj_1;
		
		
		if (obj_1.equals(obj_2))
		{
			System.out.println("obj_1과 obj_2는 같다");
		}
		else
			System.out.println("obj_1과 obj_2는 같지않다.");
			
		System.out.println("obj_1 : " + obj_1.hashCode());
		System.out.println("obj_2 : " + obj_2.hashCode());
		
		if (obj_1 == (obj_2))
		{
			System.out.println("obj_1과 obj_2는 같다다다다다");
		}
		else
			System.out.println("obj_1과 obj_2는 다다다다다르르르르르르다다다다다.");
			
		System.out.println("obj_1 : " + obj_1.hashCode());
		System.out.println("obj_2 : " + obj_2.hashCode());
	}
}
