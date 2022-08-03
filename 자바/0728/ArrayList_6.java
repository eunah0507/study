package ja_0728;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_6 {
	public static void main(String[] args) {
		
		ArrayList<Student_4> list = new ArrayList<>();
		
		list.add(new Student_4("백일 홍", 1, 1, 100, 90, 80));
		list.add(new Student_4("해당 화", 1, 2, 67, 77, 83));
		list.add(new Student_4("나팔 꽃", 1, 3, 79, 36, 56));
		list.add(new Student_4("달맞이꽃", 1, 4, 100, 90, 80));
		list.add(new Student_4("들국 화", 2, 1, 73, 52, 64));
		list.add(new Student_4("튤   립", 2, 2, 90, 27, 64));
		list.add(new Student_4("김 소 희", 3, 1, 78, 84, 34));
		list.add(new Student_4("구 인 영", 3, 2, 77, 59, 63));
		
		Collections.sort(list);
		
		Iterator<Student_4> itt = list.iterator();
		
		while(itt.hasNext())
		{
			Student_4 stt = itt.next();
			
			System.out.println(stt);
		}
	}
}

class Student_4 implements Comparable<Student_4>
{
	String name = "";
	int ban = 0;
	int no = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	int total = 0;
	
	public Student_4(String name, int ban, int no, int kor, int eng, int math)
	{
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor + eng + math;
	}
	
	public String toString()
	{
		return name + "\t"  + ban + "\t" + no +"\t" + 
				kor + "\t" + eng + "\t" + math + "\t" + total;
	}
	
//	객체의 정렬 기준을 정의하는 첫번째 방법은 정렬 대상 클래스를 자바에서 
//	기본적으로 제공하고 있는 Comparable 인터페이스를 구현하도록 변경하는 것 입니다.
//	
//	Comparable 인터페이스의 comparableTo() 메서드를 통해 인자로 넘어온
//	같은 타입의 다른 객체와 대소 비교가 가능합니다.
//	메서드를 호출하는 객체가 인자로 넘어온 객체보다 
//	작을 경우에는 음수를 리턴하고, 크기가 동일하다면 0,
//	클 경우에는 양수를 리턴합니다.
	
	public int compareTo(Student_4 stt)
	{
		return this.ban - stt.ban;
				
		// 앞뒤를 바꾸면 오름차순 / 내림차순이 바뀐다.
	}
}