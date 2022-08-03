package ja_0725;

public class Wrapper_6 {
	public static void main(String[] args) {
		
		Boolean bool_1 = new Boolean(true);
		Boolean bool_2 = new Boolean("345");
		Object bool_3 = new Boolean("TRUE"); //문자 true가 쓰여지면 대,소문자 상관없이 true값이 나온다
		
		if (bool_1.booleanValue()) 
		{
			System.out.println("boo_1 객체는 true입니다.");
		}
		else
		{
			System.out.println("bool_1 객체는 false입니다.");
		}
		
		if (bool_2.booleanValue()) 
		{
			System.out.println("boo_2 객체는 true입니다.");
		}
		else
		{
			System.out.println("bool_2 객체는 false입니다.");
		}
		
		if (((Boolean) bool_3).booleanValue()) 
			//object가 최상위클래스이지만 booleanValue를 쓰기 위해 형변환을 해줘야했다.
		{
			System.out.println("boo_3 객체는 true입니다.");
		}
		else
		{
			System.out.println("boo3_1 객체는 false입니다.");
		}
	}
}
