package ja_0715;

class AA_5 //extends Object{ // 이게 생략되어있음
{
	int a = 33;
}

class BB_5 extends AA_5
{
	int b = 55;
}

class CC_5 extends BB_5
{
	int c = 77;
}
public class SuperTest_1 {
	public static void main(String[] args) {
		
		AA_5 obj_1 = new AA_5();
		BB_5 obj_2 = new BB_5();
		CC_5 obj_3 = new CC_5();
		AA_5 obj_4 = new CC_5();
		//객체는 c로 가져왔지만 AA_5로 형변환했다면 CC는 사용 못 하고
		//AA에서만 사용 가능해 =>멤버에서 객체의 형변환(메소드는 또 달라!)
		
		System.out.println("\n obj_1 : " + obj_1.a);
		System.out.println("\n obj_2 11 : " + obj_2.a);
		System.out.println("\n obj_2 22 : " + obj_2.b);
		System.out.println("\n obj_3 11 : " + obj_3.a);
		System.out.println("\n obj_3 22 : " + obj_3.b);
		System.out.println("\n obj_3 33 : " + obj_3.c); //c는 a,b에서 c를 쓸 수 있음 하지만 a객체에서 c로는 접근 못 해 (a는 b나c 못 써)
		System.out.println("\n obj_4 11 : " + obj_4.a); //AA로 형변환 해서 .c는 오류떠 a에서만 쓸 수 있어	
		//System.out.println("\n obj_4 22 : " + obj_4.c);//AA로 형변환 해서 .c는 오류떠 a에서만 쓸 수 있어
		
	}
	// 상속에 대한 거 ( 자바는 단일 상속만 가능하다)
}
