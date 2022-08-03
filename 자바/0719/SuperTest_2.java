package ja_0719;

class AA_5
{
	String str;
	boolean bbb;
	char sex = ' ';
	
	public AA_5(String str, boolean bbb, char sex)
	{
		this.str = str; //생성자
		this.bbb = bbb;
		this.sex = sex;
		
		System.out.println("AA_5 생성자 호출 ~~ : " + str + "boolean : " + bbb);
	}
}
class BB_5 extends AA_5
{
	public BB_5(String aa, boolean bbb , char sex) // 굳이 bbb를 쓸 필요는 없다. kbs로 써도된다. 형식이 일치하니까!
	{												// 다만 가독성이 좋기 때문에 같은 이름으로 써줄 뿐이다.	
		super(aa, bbb, sex);
		System.out.println("BB_5 생성자 호출 $$$ : " + aa + "boolean : " + bbb);
	}
}

class CC_5 extends BB_5
{
	public CC_5(String kbs, boolean bbb, char sex)
	{
		super(kbs, bbb, sex);
		
		System.out.println("CC_5 생성자 호출 ^^ : " + kbs + "boolean : "  + bbb);
	}
}
public class SuperTest_2 {
	public static void main(String[] args) {
		
		CC_5 obj_1 = new CC_5("즐거운 화요일" , true , 'm'); // 여기서 3줄 출력
		//멤버의 매개변수는 객체를 전달하는 방법이다.
		// 메소드로 객체만 전달되는게 아니라 클래스나 배열도 전달될 수 있다.
		System.out.println(obj_1.str);
		System.out.println(obj_1.bbb);
		System.out.println(obj_1.sex);
	}
} //얼레 출력은 두갠데 왜 다섯개나 출력됐지??
