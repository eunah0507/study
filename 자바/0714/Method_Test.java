package ja_0714;

class Method_1
{
	double x;
	double y;
	
	public Method_1(double x, double y) { //  생성자 // 생성자도 메소드의 일종이다.
		this.x = x;
		this.y = y;
		
	}
	
	public double add() // 멤버 메소드
	{
		return (x+y);
	}
	public double min() // 멤버 메소드
	{
		return (x-y);
	}
	public double div() // 멤버 메소드
	{
		return (x/y);
	}
	public double mul() // 멤버 메소드
	{
		return ((int)(x*y));
	}
}
public class Method_Test {
	public static void main(String[] args) {
	
		Method_1 obj = new Method_1(34.567, 676.3422);
		
		double abc = obj.add();
		
		System.out.println(" 더하기 : "+obj.add());
		System.out.println(" 더하기 : "+abc);
		System.out.println(" 빼기 : "+obj.min());
		System.out.println(" 나누기 : "+obj.div());
		System.out.println(" 곱하기 : "+obj.mul());
}
}
