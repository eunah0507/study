package ja_0729;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Search_1 {
	public static void main(String[] args) {
		
		int key = 34;
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 100; i+=2) 
		{
			list.add(i);
		}
		
		System.out.println(list);
		
		int index = Collections.binarySearch(list, key);
		System.out.println("탐색의 반환값 = " + index);
		
		//17번째 위치에 34가 있더라~ 하는 의미
		
//		binarySearch() 함수는 정렬된 리스트에서 오브젝트의 위치를
//		반환하는 java.util.Collections 클래스 메소드입니다.
//		반드시 정렬된 상태여야합니다. 이진 탐색으로 값을 찾기 때문에
//		정렬이 되어 있지 않으면 이진 탐색을 할 수 없습니다.
	}
}
