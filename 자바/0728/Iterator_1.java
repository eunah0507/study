package ja_0728;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Iterator_1 {
	public static void main(String[] args) {
		
	//	Vector list = new Vector();
		List list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add(8);
		list.add(9);
		list.add(new Date());
		list.add(45.899);
		
		Iterator itt = list.iterator();
		
		while(itt.hasNext()) 
		{
			Object obj = itt.next();
			System.out.println(obj);
		}
		
		//이 구문은 vector로 치환해도 쓸 수 있다.
		
//		Enumeration enu = list.elements();
//		//<E>는 제네릭이라 자꾸 자동생성되는것이다.
//		//제네릭을 쓰면 한가지 타입으로 한정된다. object는 모든 타입을 받겠다는 뜻이다.
//		while(enu.hasMoreElements())
//		{
//			Object obj = enu.nextElement();
//			System.out.println(obj);
//		}
	}
}

