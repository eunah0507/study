package ja_0727;

import java.util.List;
import java.util.ArrayList;

public class ArrayList_2 {
	public static void main(String[] args) {
	
	final int LIMIT = 10;
	
	String source  = "0123456789abcdefghijklmABCDEFG@#$%^&*()ZZZ";
	
	int length = source.length();
	
	List list = new ArrayList(length/LIMIT+10); //+10 : 크기를 약간 여유있게
	//ArrayList는 List를 구현한 것이기 때문에 이런 형태도 가능하다.
	
	for (int i = 0; i < length; i+=LIMIT) 
	{
	if (i + LIMIT<length) 
	{
		list.add(source.substring(i,i+LIMIT));
	}
	else
		list.add(source.substring(i));
	}
	
	for (int i = 0; i < list.size(); i++)
	{
		System.out.println(list.get(i));
	}

	System.out.println(list);
	System.out.println(list.size());
	System.out.println(length);
	}
}
