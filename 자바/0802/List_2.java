package ja_0802;

import java.awt.Frame;
import java.awt.List;

public class List_2 {
public static void main(String[] args) {
	
	Frame ff = new Frame("List - Select");
	ff.setSize(500,400);
	//ff.setLayout(new FlowLayout());
	ff.setLayout(null);
	
	List selectOne = new List(4);
	
	selectOne.setLocation(20,40);
	selectOne.setSize(150,80);
	
	selectOne.add("Student");
	selectOne.add("Teacher");
	selectOne.add("Driver");
	selectOne.add("Computer Programmer");
	selectOne.add("Sales Man");
	selectOne.add("Musician");
	selectOne.add("Director");
	
	List selectMany = new List(5,true);
	selectMany.setLocation(20,170);
	selectMany.setSize(150,100);
	
	selectMany.add("Student");
	selectMany.add("Teacher");
	selectMany.add("Driver");
	selectMany.add("Computer Programmer");
	selectMany.add("Sales Man");
	selectMany.add("Musician");
	selectMany.add("Director");
	
	List selecttrd = new List(3,false);// 3개가 보이게 설정했지만 
	                                   // 설정한list의 size가 길면 더 많이 보인다.(오류아님)
	  
	selecttrd.setLocation(250,120);
	selecttrd.setSize(150,70); 
	
	selecttrd.add("Student");
	selecttrd.add("Teacher");
	selecttrd.add("Driver");
	selecttrd.add("Computer Programmer");
	selecttrd.add("Sales Man");
	selecttrd.add("Musician");
	selecttrd.add("Director");
	
	ff.add(selectOne);
	ff.add(selectMany);
	ff.add(selecttrd);
	ff.setVisible(true);
	
	
}
}
