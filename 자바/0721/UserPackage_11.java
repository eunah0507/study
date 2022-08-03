package ja_0721;


public class UserPackage_11 {
	 
	String name;
	int age;
	
	public UserPackage_11(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	String mal;
	String food;
	int io;
	char cc;
	
	public UserPackage_11(String mal, String food, int io, char cc) 
	{
		this.mal = mal;
		this.food = food;
		this.io = io;
		this.cc = cc;
	}

	public void message(String str)
	{
		System.out.println("이름은 : " + name + "나이는 : " + age);
		System.out.println("하고싶은 말 : "+ mal + "진심이라면 당근을 : " + food +  "집에가는시간 " + io + "진심?(O/X) : " + cc);
		System.out.println("전달된 내용 : " + str);
	}
}
