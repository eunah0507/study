package ja_0729;

import java.util.HashMap;
import java.util.Map;

public class HashMap_5 {
	public static void main(String[] args) {
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		String[] sample = {"to", "be", "or", "not", "to", "be", "is", "a", "problem",
							"i", "want" , "to", "go", "home", "Happy", "weekend"};
		
		//문자열에 포함된 단어의 빈도를 계산한다.
		
		for (String a : sample) 
		{
			Integer freq = m.get(a); //a의값을 freq(숫자)로 넘기겠다
			m.put(a, (freq == null) ? 1 : freq + 1); 
			//a값을 볼 때 freq가 비어있나? 누적시켜서 없으면 1 넣고 있으면 +1해라
		}
		
		System.out.println(m.size() + "단어가 있습니다.");
		System.out.println(m.containsKey("to"));
		System.out.println(m.isEmpty());
		System.out.println(m);
		
	}
}
