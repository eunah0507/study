package ja_0715;

class This2 
{
	String name;
	int age;
	char sex;
	
	public This2 (String name, int age, char sex)
	{
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public This2()
	{
		this("밝은미소", 27, 'm');
		// 생성자 안에서 또 다른 생성자의 호출은 반드시 첫번째 줄에 기술되어야 한다.(단독은 상관없어)
		System.out.println("this2 생성자~~");//얘가 호출보다 먼저 올 수는 없어
	}
	
	public This2(String name, int age)
	{
		this(name, age, 'f');
	}
	
	public This2(String name, char sex)
	{
		this(name, 19, sex);
	}
	
	public void display()
	{
		System.out.println("이름은 " + name + ", 나이는 : " + age + ", 성별은 : " + sex);
		
	}
}
public class ThisExe_2 {
	public static void main(String[] args) {
		
		This2 t1 = new This2();
		This2 t2 = new This2("민우", 25);
		This2 t3 = new This2("유진", 'f');
		
		t1.display();
		t2.display();
		
		//System.out.println("this2 생성자~~~");
		t3.display();
	}
}
