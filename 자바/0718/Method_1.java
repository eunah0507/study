package ja_0718;

class Super_1
{
	public void display()
	{
		System.out.println("Super_1 class diplay Method~~");
		show();
	}
	
	public void message()
	{
		System.out.println("Super_1 class message method@@@");
	}
	
	void print() //같은 package에 들어있어서 출력가능하다.
	{
		System.out.println("Super_1 class print Method $$$$$");
	}
	
	private void show() // show는 private이니까 출력이 안된다. 같은 클래스 내에서 접근하면 출력가능하다.
	{
		System.err.println("Super_1 class show Method #####");
	}
}
public class Method_1 extends Super_1 {
	public static void main(String[] args) {
		
		Method_1 obj_1 = new Method_1();
		
		obj_1.display();
		obj_1.message();
		obj_1.print();
	//	obj_1.show();
				
	}
}
