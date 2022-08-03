package ja_0728;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_5 {
	public static void main(String[] args) {
		
		ArrayList<Student_3> list = new ArrayList<>();
		
		list.add(new Student_3 ("수 선 화", 1,1));
		list.add(new Student_3 ("백    합", 1,2));
		list.add(new Student_3 ("장    미", 1,3));
		list.add(new Student_3 ("튤    립", 2,1));
		list.add(new Student_3 ("해 바라기", 2,2));
		list.add(new Student_3 ("라 일 락", 2,3));
		
		Iterator<Student_3> itt = list.iterator();
		
		while(itt.hasNext())
		{
			Student_3 ss = itt.next();
			
			System.out.print(ss.name + "\t" + ss.ban + "\t" + ss.noo +"\n");
		}
		
		System.out.println();
		System.out.println();
		
		for (Student_3 stu : list) 
		{
			System.out.println(stu.name +"\t"+stu.ban+"\t" + stu.noo);
		}
		
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) 
		{
			//Student_3 stt = list.get(i);
			//System.out.println(stt.name); // 두줄을 합치면 아래 한 줄로 나온다.
			System.out.println(list.get(i).name + "\t" +list.get(i).ban + "\t" + list.get(i).noo);
		}
	}
}

class Student_3
{
	String name = "";
	int ban;
	int noo;
	
	public Student_3(String name, int ban, int no)
	{
		this.name = name;
		this.ban = ban;
		this.noo = no;
	}
}
