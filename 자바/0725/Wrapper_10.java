package ja_0725;

public class Wrapper_10 {
	public static void main(String[] args) {
		
		Float one = new Float("237.345f");
		Float abc = (float)(10 / 3.0);
		
		System.out.println("현재 값 : " + one);
		System.out.println("byte 값 : " + one.byteValue());
		System.out.println("short 값 : " + one.shortValue());
		System.out.println("int 값 : " + one.intValue());
		System.out.println("long 값 : " + one.longValue());
		System.out.println("float값 : " + one.floatValue());
		System.out.println("double 값 : " + one.doubleValue());
		System.out.println("NaN 체크 : " + one.isNaN()); //숫자가 아니면 true
		System.out.println("무한대 체크: " + one.isInfinite()); 
	}
}
