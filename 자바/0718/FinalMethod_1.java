package ja_0718;

class AA_4
{ // final void display() {
	void display() //메소드에 final이 붙으면 다른 메소드에서 상속받지 못한다. 오버라이딩 되지 못한다. 재정의x
	{
		System.out.println("재정의 불가 매소드 display() ~~");
	}
}

class BB_4 extends AA_4
{
	void display()
	{
	System.out.println("재정의 불가 매소드 display()@@@@");
	}
	
}

public class FinalMethod_1 {
	public static void main(String[] args) {
		
		BB_4 obj_1 = new BB_4();
		
		obj_1.display();
	}
}
