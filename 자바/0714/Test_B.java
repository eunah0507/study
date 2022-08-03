package ja_0714;

class A_1
{ //private 은닉화, 셉터와 게터??? 메소드를 통한 접근만 해라 그래야 데이터를 구할 수 있다??
	 int x = 10; // 멤버 변수
	 int y = 30; // 멤버 변수
	
	public int add() // 메소드 (생성자가 없어도 된다는데 이유를 모르겠다)
	{
		return(x+y);
	}
}

public class Test_B {
	public static void main(String[] args) {
		
		A_1 obj = new A_1();
		
		obj.x = 55;
		obj.y = 77;
		
		System.out.println("x" + obj.x);
		System.out.println("y" + obj.y);
		System.out.println("(x+y)" + obj.add());
		
	}
}
