package ja_0714;



public class Circle_1 {
	public static void main(String[] args) {
		
		final float PI = 3.1415f;
		
		int r = 13;
		
		//PI = 5.345f; / final이라 상수변경이 불가능하다.
		
		double area = PI * r  * r;
		double dul = PI * 2 * r;
		
		System.out.printf("원의 넓이 : %5.3f"+"\u33A0",area);
		System.out.printf("\n원의 둘레 : %5.3f"+"\u339D",dul);
		
		
	}
}
