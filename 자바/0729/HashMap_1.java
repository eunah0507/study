package ja_0729;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_1 {
	public static void main(String[] args) {
		
		//HashMap map = new HashMap();
		HashMap<String, String> map = new HashMap<>();
		
		map.put("eunah0507", "222");
		map.put("222", "222");
		map.put("333", "333");
		
		//키값은 중복되지 않는다. seoul pw는 사라진다. king만 로그인 가능하다.
		//아이디가 키값, 비밀번호가 value. value값은 중복이 가능하다.
		
		Scanner ss = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("id와 password를 입력해 주세요!");
			System.out.println("id : ");
			String id = ss.next().trim();
			
			if (!map.containsKey(id)) //map속에 id가 들어있는지 확인한다.
			{
				System.out.println("입력하신 " + id + "는 존재하지 않습니다.");
				continue;
			}
			else
			{
				System.out.println("password : ");
				String password = ss.next().trim();
				//trim = 문자열 입력받을 때 좌우 공백을 없애주는 역할을 한다.
				//trim은 문자열에서 공백을 없애는것. 숫자열에서는 의미가 없다. 그래서 지워줬다.
				System.out.println();
				if (!(map.get(id).equals(password)))
					//값 비교는 ==이다. 원래는 equals를 써줬다.
				{
					System.out.println(map.get(id));
					//map.get(id)를 쓰면 pw가 나온다. 비교하는 것이다. pw를 입력하면 null값이 나온다.
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요!");
				}
				else
				{
					System.out.println("축하합니다. 로그인 하였습니다.");
					break;
				}
			}
		}
	}
}
