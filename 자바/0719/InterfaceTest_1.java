package ja_0719;

interface AA_1
{
	void print1(); //추상 메소드 인터페이스 안의 메소드는 모두 추상이라 abstract 안붙어도 된다.
					// public abstract void print1()를 줄여 쓴 것이다.
}

class BB_1 implements AA_1 //인터페이스는 임플리먼트를 쓴다.
{
	@Override
	public void print1() {
		System.out.println("AA_1 인터페이스 메소드 재정의");
	}
	
	public void print2() //이건 뭐지? 그냥 한 번 더 써준건가? // 자체메소드래
	{
		System.out.println("BB_1 클래스 메소드 print2()");
	}
}
public class InterfaceTest_1 {
	public static void main(String[] args) {
		
		BB_1 obj_1 = new BB_1();
		
		obj_1.print1();
		obj_1.print2();
		
		System.out.println("============================");
		
		AA_1 obj_2 = new BB_1(); //설명 다시 듣기. AA_1 틀에 BB_1데이터를 넣은것 맞나?
		
		obj_2.print1();
		//obj_2.print2(); //오버라이딩 된게 아니라서 출력이 안된다.
		
		
	}
}
