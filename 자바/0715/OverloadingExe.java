package ja_0715;

class Overloading  //갯수가 다르거나 타입이 다르면 에러가 나와 에러 일부러 만들어서 좀 봐봐
{
	public Overloading()
	{
	}
	//Method overloading
	void display()
	{
	System.out.println("전달된 값 없음!");
	}
	void display(int a) // 중복되면 에러나는데 int나 string을 보고 중복 판단해야해 int a String a => 중복x , string a String name  =>중복!!!!
	{
		System.out.println("a 값은 : " + a);
	}
	void display(String name)
	{
		System.out.println("전달된 이름은 : " + name);
	}
	void display(String name, int age)
	{
		System.out.println("이름은 " + name + ", 나이는 : " + age);
	}
	void display(String name, int age, char abc)
	{
		System.out.println("이름은 : " + name + ",나이는 : " + age + ", 성별은 : " +abc);
	}
}
public class OverloadingExe {
	public static void main(String[] args) {
		
		Overloading obj = new Overloading();
		
		obj.display();
		obj.display(45);
		obj.display("수선화");
		obj.display("백일홍", 25);
		obj.display("해바라기", 25, 'f');
	}
}
