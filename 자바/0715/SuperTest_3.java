package ja_0715;

class AA_3
{
	int a = 10;
	int b = 20;
	
	void display()
	{
		System.out.println("AA_3 a = " + a + ", b = " + b);
	}//class에서는 출력을 하는 거 아니고 이렇게 명령하면 출력할거야~를 정하는 것!
}

class BB_3 extends AA_3
{
	int a = 333;
	int b = 555;
	
	void display() 
	{
		System.out.println("BB_3 display a = " + a + " , b = " + b);
	}
	
	void show()
	{
		super.display();
		this.display();
		
		int total = this.a + this.b + super.b;
		   //자기 자신의 a,b  => this.  부모 클래스의 a,b >> super
		System.out.println("total =" + total );
		System.out.println("BB_3 show time a = " + a + ", b = " + b);
	}
}
public class SuperTest_3 {
	public static void main(String[] args) {
		
		BB_3 obj_1 = new BB_3();
		
		obj_1.display();
		obj_1.show();
		
		System.out.println("===============================");
		
		BB_3 obj_2 = null;
		
		AA_3 obj_3 = new BB_3();
		// 객체의 형변환시 (상속관계에 있는 경우에) 멤버 변수는 쉐도잉 되고 
		//멤버 메소드는 오버라이딩 된다고 함(인터페이스에서 많이 씀 외워두기)
		
		//obj_3.show(); //얘는 이미 AA로 형변환 했으니까 BB에 있는 show를 쓸 수가 없어 AA에는 show가 없으니까!
		
		System.out.println("=================================");
		
		obj_2 = (BB_3)obj_3;//BB_3 <- AA_3  정보를 강제로 넣었다. // int a = (int)2.9;
		/*
		 * float b = 2.9f;
		 * int a = (int)b; //a=2  이 행위로 b의 값이 2로 바뀌지는 않잖아. b는 여전히 2.9
		 * */
		obj_2.display();
		obj_2.show();
	}
}
