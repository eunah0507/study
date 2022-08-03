package ja_0728;

import java.util.HashSet;

public class HashSet_3 {
	public static void main(String[] args) {

//		King a = new King("오의석",27);//오의석.hashcode =2  =>  a의 hashcode는 2+27	=29
//		King b = new King("오의석",27);//오의석.hashcode =2  =>  a의 hashcode는 2+27	=29 
//		boolean d = a.equals(b);
//		
//		System.out.println(d);
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		
		set.add(new King("Hong", 20));
		set.add(new King("Hong", 20));
		
		System.out.println(set);
	}
}



class King
{
	String name;
	int age;
	
	King(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj)//overriding
	{
		if (obj instanceof King) 
		{
		King tmp = (King) obj;
		return name.equals(tmp.name) && age == tmp.age;
		}
		
		return false;
	}
	
	public int hashCode()
	{
		return name.hashCode() + age;
	}
	
	public String toString()
	{
		return name + " : " + age;
	}
	
	
	
	/*
	 * 클래스가 같은 지 비교 할 때 두번 비교함
	 * 1. equals 로 true가 나오면 두 클래스는 같다
	 * 2. 두 클래스의 hashcode값이 같으면 두 클래스가 같다.
	 * 
	 * 하나라도 만족을 못하면 다른 클래스다!
	 * 
	 * */
}