package ja_0721;

public class UserPackage_22 {
	
	String name;
	int i;
	
	public UserPackage_22(String name, int i)
	{
		this.name = name;
		this.i = i;
	}

	public void message(String bbb)
	{
		System.out.println("전달된 내용 : " + bbb);
		System.out.println("먹고싶은 것 : " + name + "갯수 : " + i);
	}
}
