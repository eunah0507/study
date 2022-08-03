package ja_0728;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_2 {
	public static void main(String[] args) {
		
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();

		HashSet setHap = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
	
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
	
		System.out.println("A = " + setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");

		System.out.println("B = " + setB);
		
		Iterator itt = setB.iterator();
		
		while(itt.hasNext())
		{
			Object obj = itt.next();
			
			if (setA.contains(obj)) 
			{
				setKyo.add(obj);
			}
		}
		
		itt = setA.iterator();
		
		while (itt.hasNext())
		{
			Object obj = itt.next();
			if (! setB.contains(obj))
			{
				setCha.add(obj);
			}
		}
		
		itt = setA.iterator();
		while(itt.hasNext())
		{
			setHap.add(itt.next());
		}
		
		itt = setB.iterator();
		while (itt.hasNext())
		{
			setHap.add(itt.next());
		}
		
		System.out.println("A ∩ B : " + setKyo);
		System.out.println("A ∪ B : " + setHap);
		System.out.println("A - B : " + setCha);
		System.out.println();
		System.out.println("A ∩ B : " + setA.retainAll(setB));
		System.out.println();
		System.out.println("A ∩ B : " + setA);//4,5
		System.out.println("A ∪ B : " + setA.addAll(setB));
		System.out.println("A  : " + setA);
		System.out.println();
		System.out.println("A - B : " + setA.removeAll(setB));
		System.out.println("A  : " + setA);
		System.out.println("A - B : " + setB);
	}
}
