package ja_0727;
// List는 순서가 있고 중복허용
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1 {
	public static void main(String[] args) {
	//int [] arr = new int[30];={1,3,434,3,2,1}
	ArrayList<Integer> list_1 = new ArrayList<>(10);
	
	list_1.add(5); // 제너릭을 Integer로 선언했기 때문에 "5"는 안됨
	list_1.add(new Integer(4));
	list_1.add(new Integer(3));
	list_1.add(new Integer(2));
	list_1.add(new Integer(0));
	list_1.add(new Integer(1));
	list_1.add(new Integer(3));

	ArrayList  list_2 = new ArrayList(list_1.subList(1, 4)); // index 1-4번까지 가져오겠다.(1,2,3)
	print(list_1, list_2); //list를 출력하면 자동으로 []도 출력
	
	Collections.sort(list_1); // sort : 자동으로 오름차순 정렬
	Collections.sort(list_2);
	print(list_1, list_2);
	
	
	System.out.println("list_1.containsAll(list_2) : "+list_1.containsAll(list_2));
	//list_1은 list_2를 모두 가지고 있는가?
	
	list_2.add("B");
	list_2.add("C");
	list_2.add("A");
	
	System.out.println("list_1.containsAll(list_2) : "+list_1.contains(list_2));
	
	print(list_1, list_2);
	
	list_2.set(3, "Queen");
	print(list_1, list_2);
	
	//list_1에서 list_2와 겹치는 부분만 남기고 
	System.out.println("list_1.retainAll(list_2) : "+list_1.retainAll(list_2));
	print(list_1, list_2);
	
	
	//list_2에서 list_1에 포함된 객체들을 삭제
	for (int i = list_2.size()-1; i>=0 ; i--) 
	{ //for(int i = 0; i<list_2.size(); i++)도 가능
		if (list_1.contains(list_2.get(i))) 
		{
			list_2.remove(i);
		}
	}
	print(list_1, list_2);
}

private static void print(ArrayList list_1, ArrayList list_2) {
	
	System.out.println("list_1 : "+list_1);
	System.out.println("list_2 : "+list_2);
	System.out.println();
	
	}
}
