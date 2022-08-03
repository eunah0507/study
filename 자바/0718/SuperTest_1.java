package ja_0718;

class AA_3
{
	public AA_3()
	{
		System.out.println("AA_3 생성자 호출~");
	}
	int a = 33;
}

class BB_3 extends AA_3
{
	public BB_3()
	{
		super(); // 오브젝트 호출, 안써도 됨 // 맨 위에 써야한다. 객체가 먼저 만들어져야 쓸 수 있으니까!
		System.out.println("BB_3 생성자 호출~");
	}
	int b = 55;
}

class CC_3 extends BB_3
{
	public CC_3()
	{
		super();
		System.out.println("CC_3 생성자 호출~");
	}
	int c = 77;
}

public class SuperTest_1 {
	public static void main(String[] args) {
		
		CC_3 obj_1 = new CC_3();
		
		System.out.println("\n obj_1의 a 값 : " + obj_1.a);
		System.out.println("\n obj_1의 b 값 : " + obj_1.b);
		System.out.println("\n obj_1의 c 값 : " + obj_1.c);
	}
}
