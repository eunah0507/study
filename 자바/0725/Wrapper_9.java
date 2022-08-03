package ja_0725;

public class Wrapper_9 {
	public static void main(String[] args) {
		
		int ss_data = 0;
		
		short max = Short.MAX_VALUE; //오토 언박싱
		short min = Short.MIN_VALUE;
		
		Short ss = new Short("888");
		
		ss_data = ss.shortValue();
		
		int sss_data = new Short("999").shortValue(); // 이게 뭐야??
		
		System.out.println("\t ss_data : " + ss_data + ", \n\t 최대값 : " + max + ", \n\t 최소값 : " + min);
	}
}
