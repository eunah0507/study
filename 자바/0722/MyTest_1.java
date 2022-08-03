package ja_0722;

import ja_0721.MyPackage_22;
import ja_0721.UserPackage_11;
import ja_0721.UserPackage_22;

public class MyTest_1 {
	public static void main(String[] args) {
		
		UserPackage_11 obj_1 = new UserPackage_11("korea", 45); //왜 두번 호출돼??
		UserPackage_11 obj_4 = new UserPackage_11("행복한하루~!","당근",1530,'O');
		UserPackage_22 obj_3 = new UserPackage_22("초콜릿", 2);
		MyPackage_22 obj_2 = new MyPackage_22();
		
		obj_1.message("아름다운 사람"); //이게 두개라서??
		obj_1.message("즐거운 하루");
		obj_4.message(" ");
		
		obj_2.show("화려한 금요일");
		obj_2.show("싱그러운 바람"); // getName의 마지막 값만 들어있다. 다른 클래스에 있는 것을 import해서 쓸 수 있다.
		
		obj_3.message("졸리다");
		obj_3.message("어렵다");
		
		//obj_2.getName();
		String abc = obj_2.getName(); //이부분부터 이해하지 못했어
		obj_2.getName();
		
		System.out.println(obj_2.getName());
		System.out.println("abc = " + abc);
		
		obj_2.print("kbs",false);
		obj_2.print("정은아", false);
		
	}
}
