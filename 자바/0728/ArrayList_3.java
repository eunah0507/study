package ja_0728;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_3 {
	public static void main(String[] args) {
		
		ArrayList<String> numbers = new ArrayList<>();
		// ArrayList는 모든 타입을 받을 수 있다.
		//ArrayList numbers = new ArrayList(); String<> 을 제외하면 에러가 난다. <>을 제네릭이라고 부르네?
		//아무튼 써줘도 되고 안써줘도 된다.
		
		numbers.add("10");
		numbers.add("20");
		numbers.add("30");
		numbers.add("40");
		System.out.println("add(값)");
		System.out.println(numbers);
		
		numbers.add(1, "50"); //1의 의미가 뭐지? //1번 위치
		System.out.println("\n add (인덱스, 값)");
		System.out.println(numbers);
		
		numbers.remove(2); //(2)가 뭘 뜻하는거지? //2번 위치
		System.out.println("\n remove(인덱스)");
		System.out.println(numbers);
		
		System.out.println("\n get(인덱스)");
		System.out.println(numbers.get(2));
		
		System.out.println("\n size()");
		System.out.println(numbers.size());
		
		System.out.println("\n indexOf()");
		System.out.println(numbers.indexOf("45")); //값이 존재하지 않아서 -1이 출력되었다.
		
		Iterator<String> it = numbers.iterator();  // 여기에 string 을 써주면 아래에 안써줘도 됨
		//Iterator  = 열거형
		System.out.println("\n iterator");
		
		while (it.hasNext()) 
		{
			String value = (String) it.next();  // next가 object 타입이라 형변환 string을 써준것 위의 제너릭 보시오
			if (value.equals("30")) 
			{
				it.remove();
			}
			System.out.println(value);
		}
		System.out.println(numbers);
		
		System.out.println("\n for each");
		for (String value : numbers) 
		{
			System.out.println(value);
		}
		
		System.out.println("\n for");
		for (int i = 0; i <numbers.size(); i++) 
		{
			System.out.println(numbers.get(i));
		}
	}
}
