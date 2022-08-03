package ja_0719;

public class SuperTest_1 {
	public static void main(String[] args) {
		
		Child obj_1 = new Child();
		
		obj_1.message();
	}
}

class parent
{
	int x = 888;
}

class Child extends parent
{
	int x = 3456;
	
	void message()
	{
		System.out.println(" x = " + x);
		System.out.println(" y = " + this.x);
		System.out.println(" super.x = " + super.x);
	}
}