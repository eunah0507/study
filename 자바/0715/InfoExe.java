package ja_0715;

class info 
{
	private String name;
	private int age;
	private char sex;
	private String tel;
	
	public info(String n, int a, char s, String t) //생성자 (매개변수가 있는 생성자를 하나라도 만들면 디폴트 생성자 안 만들어짐)
	{
		name = n;  //디폴트를 쓰고자 하면 사용자가 직접 만들어줘야해
		age = a;
		sex = s;
		tel = t;
	}
	
	public void display()
	{
		System.out.println("이름" + name);
		System.out.println("나이" + age);
		System.out.println("성별" + sex);   // 얘네는 디폴트 생성자가 없으므로 퍼블릭 부분 지우면 안돼(에러)
		System.out.println("전화번호" + tel);
	}
}
public class InfoExe {
	public static void main(String[] args) {
		
		//Info obj3 =new info;//(1) 위에 퍼블릭 부분 지우고 싶으면 (1),(2) 이 두 개 추가~~
		info obj1 = new info("정은아", 27, 'f', "01020870112"); //obj1초기화
		
		info obj2 = new info("튤립", 28, 'm', "01020162083");//obj2 초기화
		
		obj1.display();
		obj2.display();
		//obj3.display();//(2)
	}
}
