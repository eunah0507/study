package ja_0713;

public class Array_16 {
	public static void main(String[] args) {
	
		int[] ff = new int [] {55,77,444};
		
		System.out.println("main() 11 : " + ff[2]);
		
		change(ff); //메소드호출
		change(ff); //메소드호출
		
		System.out.println("After change (ff)~~~");
		System.out.println("main() 22 : " + ff[2]);
	}
	
	private static void change(int[] yy) { //메소드 정의
		yy[2] = 787878;
		System.out.println("chage() yy[2] = " + yy[2]);
	}
}
