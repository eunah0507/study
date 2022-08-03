package ja_0719; // 여기서 뭐가 다중상속이지???

interface Bird
{
	long speed = 65; // public static final 생략
	void fly(); // public abstract 생략
}

interface Horse
{
	void run();
}

interface Fish
{
	void swimming();
}

class Pegasus implements Bird, Horse, Fish
{

	@Override
	public void swimming() 
	{
		System.out.println("바다를 헤엄친다");
	}

	@Override
	public void run()
	{
		System.out.println("대륙을 뛰어 다닌다");
		
	}

	@Override
	public void fly() 
	{
		System.out.println("푸른 하늘을 날라다닌다");
	}
	
}
public class PegasusTest {
	public static void main(String[] args) {
		
		Pegasus obj = new Pegasus();
		//Bird obj = new Pegasus();하면 안됨 obj.run이랑 obj.swimming 안됨
		
		obj.fly();
		System.out.println("속도는 : " + Bird.speed + "입니다.");
		
		obj.run();
		obj.swimming();
	}
}
