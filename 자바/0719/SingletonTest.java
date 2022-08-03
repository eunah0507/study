package ja_0719;

final class Singleton
{
//	소프트웨어 디자인 패턴에서 싱글턴 패턴(singleton pattern)을 따르는 클래스는,
//	생성자가 여러차례 호출되더라도 실제로 생성되는 객체가 하나이고
//	최초 생성 이후에 호출된 생성자는 최초의 생성자가 생성한 객체를 리턴한다.
//	이와 같은 디자인 유형을 싱글턴 패턴이라고 한다.
//	주로 공통된 객체를 여러개 생성해서 사용하는 DBCP(DataBase Connection Pool)와 같은
//	상황에서 많이 사용된다.
	
	private static Singleton ss = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance()
	{
		if (ss == null)
		{
			ss = new Singleton();
		}
		return ss;
	}
}

class HelloWorld{}

public class SingletonTest {
	public static void main(String[] args) {
		
		
		// Singleton obj = new Singleton(); 못만든다.
		Singleton ss1 = Singleton.getInstance();
		Singleton ss2 = Singleton.getInstance();
		
		System.out.println("Singleton 객체 ss1 hashCode " + ss1.hashCode());
		System.out.println("Singleton 객체 ss2 hashCode " + ss2.hashCode());
		//hashcode는 오브젝트 속에 들어있어서 모든 객체가 다 쓸 수 있다.
		System.out.println("=====================================");
		
		HelloWorld hh1 = new HelloWorld();
		HelloWorld hh2 = new HelloWorld();
		
		System.out.println("HelloWorld 객체 hh1 hashCode" + hh1.hashCode());
		System.out.println("HelloWorld 객체 hh1 hashCode" + hh1);
		System.out.println("HelloWorld 객체 hh2 hashCode" + hh2.hashCode());
		System.out.println("HelloWorld 객체 hh2 hashCode" + hh2);
	} //hashcode가 같으면 같은 객체라는 뜻
}
