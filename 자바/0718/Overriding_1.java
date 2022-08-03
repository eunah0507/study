package ja_0718;

class AA_2
{
	int aa = 55;
	int bb = 77;
	
	void display()
	{
		System.out.println("AA_2 클래스의 display() ~~~ 메소드");
	}
}

class BB_2 extends AA_2
{
	int bb = 478;
	int cc = 888;
	
	void display() 
	{
		System.out.println("BB_2 클래스의 display() @@@메소드");
	}
}
public class Overriding_1 {
	public static void main(String[] args) {
		
		//AA_2 obj_1 = new AA_2();
		AA_2 obj_1 = new BB_2(); 
		//멤버변수는 쉐도잉(가려지고)되고 멤버 메소드는 오버라이딩(자기 자신의 것이 나온다) 된다. = 은닉화
		//위에말이 무슨 소리인거지??
		
		obj_1.display();
		System.out.println(obj_1.bb);
		
	}
}
