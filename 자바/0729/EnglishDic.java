package ja_0729;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishDic {
	public static void main(String[] args) {
		
		Map<String, String> st = new HashMap<String, String>();
		//implements를 했기 떄문에 HashMap을 써도 된다.
		
		st.put("map", "지도");
		st.put("java", "자바");
		st.put("school", "학교");
		st.put("korea", "대한민국");
		st.put("seoul", "대한민국 수도");
		st.put("Note", "공책");
		st.put("academy", "학원");
		st.put("apple", "사과");
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("영어 단어를 입력하세요");
			String key = sc.next(); //리턴 타입이 String
			if (key.equals("quit")) 
				break;
			System.out.println("단어의 의미는 : " + st.get(key));
		}
		while(true);
	}
}
