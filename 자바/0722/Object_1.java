package ja_0722;

class King extends Object // 모든 객체들은 object를 상속받고있다. extends object는 안써도 된다.
{
	String kbs;
	
	public King()
	{
		this.kbs = kbs;
	}
	
	public String toString()
	{
		return "비가 오는 금요일~!";
	}
}

public class Object_1 {
	public static void main(String[] args) {
		
		King obj = new King();
		
		King obj_1 = obj;
		King obj_2 = new King();
		
		
		System.out.println("클래스 이름 :" + obj.getClass());
		System.out.println("해쉬 코드 : " + obj.hashCode());
		System.out.println("해쉬 코드11 : " + obj_1.hashCode()); // 같은 해쉬코드 값을 받는다. 같은 객체를 공유한다.
		System.out.println("해쉬 코드22 : " + obj_2.hashCode());
		System.out.println("객체 문자열 : " + obj.toString());
		System.out.println("객체 문자열 : " + obj);
	}
}
