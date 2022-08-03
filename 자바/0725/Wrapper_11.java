package ja_0725;

public class Wrapper_11 {
	public static void main(String[] args) {
		
		Double one = new Double("10");
		double two = 3;
		double reuslt = one.doubleValue()/two;
		
		System.out.println("result :" + reuslt);
		System.out.println("NaN 체크 : " + Double.isNaN(reuslt)); 
		//isNaN = 숫자인지 판별 //NaN이면 true 나와야하는거 아냐?
		System.out.println("무한대 체크 : " + Double.isInfinite(reuslt)); // 무한대인지 판별
		System.out.println("Double 최대값 : " + Double.MAX_VALUE);
		System.out.println("Double 최소값 : " + Double.MIN_VALUE);

	}
}
