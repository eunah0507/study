package ja_0714;

class Static_1
{
	static int num = 0;
	int xx = 0; //객체 속성변수, (필드 클래스 밑에있는거! 메소드 안에있으면 지역변수!)
	int yy = 0;
}

public class StaticTest {
	public static void main(String[] args) {
	
		Static_1 ss1 = new Static_1();
		Static_1 ss2 = new Static_1();
		Static_1 ss3 = new Static_1();
		
		Static_1.num = 88;
		ss1.xx = 43;
		ss1.yy = 57;
		//static으로 만들어진 것은 class로 접근해달라, 객체 참조변수로 접근하지 마라
		//static 으로 만들어진 것은 class가 로드되는 시점에서 이미 만들어져있는다. 공용의 뜻을 갖는다.
		//new를 통해 만들어진 것은 ?? 물어보자
		//static으로 만들어진 것은 클래스 명으로 접근 가능하다.
		System.out.println("\n ss1. num = " + Static_1.num + "\n ss1.xx = " +
							ss1.xx + "\n ss1.yy = " + ss1.yy);
		
		Static_1.num = 999;
		ss2.xx = 233;
		ss2.yy = 345;
		
		System.out.println("\n ss2. num = " + Static_1.num + "\n ss2.xx = " +
				ss2.xx + "\n ss2.yy = " + ss2.yy);
		
		System.out.println("\n ss3. num = " + Static_1.num + "\n ss3.xx = " +
				ss3.xx + "\n ss3.yy = " + ss3.yy);
		
		System.out.println("\n Static_1. num = " + Static_1.num + "\n ss3.xx = " +
				ss3.xx + "\n ss3.yy = " + ss3.yy);
	}
}
