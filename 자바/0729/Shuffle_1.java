package ja_0729;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle_1 {
	public static void main(String[] args) {
		
		Character kbs = ' ';
		
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < 26; i++) 
		{
			kbs = (char)(65+i);
			list.add(kbs);	
		}
		
		System.out.println("섞기전 : " + list);
		
		Collections.shuffle(list); // 섞기
		
		System.out.println("섞은 후 :" + list);
		
		
		List<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < 10; i++) 
		{
			list2.add(i);
		}
		System.out.println("섞기 전 : " + list2);
		
		Collections.shuffle(list2);
		
		System.out.println("섞은 후 : " + list2);
	}
}
