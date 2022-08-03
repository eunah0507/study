package ja_0719;

interface Car 
{
	void run();
}

interface Ship
{
	void navigate();
}

interface Drive
{
	void ddang();
}

interface Wigs extends Car, Ship, Drive //인터페이스가 인터페이스를 상속받을 수 있다
{
	void floating(); // public abstract void ~~
}

class EagleFive implements Wigs
{

	@Override
	public void run() 
	{
		System.out.println("황야를 달린다");
	}

	@Override
	public void navigate() 
	{
		System.out.println("바다를 질주한다");
	}

	@Override
	public void floating() 
	{
		System.out.println("습지를 날라다닌다");
	}
	
	@Override
	public void ddang() 
	{
		System.out.println("땅 속을 뚫고 나간다");
	}
	
}
public class WigsTest {
	public static void main(String[] args) {
		
		EagleFive obj = new EagleFive();
		
		obj.floating();
		obj.run();
		obj.navigate();
		obj.ddang();
		
	}
}
