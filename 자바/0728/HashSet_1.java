package ja_0728;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet_1 {
	public static void main(String[] args) {
		
		Object[] obj = {"1", new Integer(1), "1", "4", "4", "2", "2", "2", "2", "3", "3", "4", "4"};
		//hashSet은 중복을 허용하지않는다. 데이터타입이 다른 건 허용 한다.
		Set sett = new LinkedHashSet();
		
		for (int i = 0; i < obj.length; i++) 
		{
			sett.add(obj[i]);
		}
			System.out.println(sett);
	}
}

