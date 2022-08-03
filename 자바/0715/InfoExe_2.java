package ja_0715;

class info2 
{
	private String name;
	private int age;
	private char sex;
	private String tel;
	//생성자 overloading
	// 두 메소드가 같은 이름을 갖고 있으나 인자의 수나 자료형이 다른 경우를 말한다. 
	
	public info2(String n, int a, char s, String t)
	{
		name = n;
		age = a;
		sex = s;
		tel = t;
	}
	
	public info2(String n, int a)
	{
		name = n;
		age = a;
		sex = 'm';
		tel = "12345";
	}
	
	public info2(String n, char s) // 객체를 만들 떄 다양한 타입이 가능해 근데 변수이름만 바뀌는 건 안돼
	{
		name = n;
		age = 77;
		sex = s;
		tel = "56789";
	}
	public info2(int a, char s, String t)
	{
		name = "장미";
		age = a;
		sex = s;
		tel = t;
	}
	public info2(String n)
	{
		name = n;
		age = 25;
		sex = 'f';
		tel = "12121";
	}
	public info2()
	{
		name = "해바라기";
		age = 36;
		sex = 'm';
		tel = "08080";
	}
	
	public void display()
	{
		System.out.println("이름" + name);
		System.out.println("나이" + age);
		System.out.println("성별" + sex);
		System.out.println("전화번호" + tel);
		//System.out.println();
	}
	//데이터 타입 int, String, float, char, byte, double, short..... + void(빈공간)
}
public class InfoExe_2 {
	public static void main(String[] args) {
		
		info2 info1 = new info2("백일홍", 17, 'f', "99999");
		info2 info2 = new info2("들국화", 33);
		info2 info3 = new info2("맨드라미", 'm');
		info2 info4 = new info2(26, 'f', "57575");
		info2 info5 = new info2("Anonymous");
		info2 info6 = new info2();
		
		info1.display();
		System.out.println();
		
		info2.display();
		System.out.println();
		
		info3.display();
		System.out.println();
		
		info4.display();
		System.out.println();
		
		info5.display();
		System.out.println();
		
		info6.display();
		System.out.println();
	}
}
