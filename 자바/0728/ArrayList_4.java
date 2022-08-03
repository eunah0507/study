package ja_0728;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ArrayList_4 {
	public static void main(String[] args) {
		
		int kor, eng, math, science, total;
		
		double  avg;
		
		String[] 이름 = {"강지수", "김동현","김민석",
				        "김민지","김유진","김창용","김혜련",
				        "김희진","류현정", "박주선"};
		
		int[]국어 = {56,78,34,66,90,47,88,65,78,85};
		int[]영어 = {78,49,77,89,57,89,75,88,56,64};
		int[]수학 = {85,69,88,33,56,90,55,78,66,83};
		int[]과학 = {85,63,77,55,44,12,56,88,99,45};
		
	//	Vector<Comparable> vv = new Vector<Comparable>();
		ArrayList vv = new ArrayList();
		
		for (int i = 0; i < 10; i++) {
			vv.add((String)이름[i]);
			vv.add(국어[i]);
			vv.add(new Integer(영어[i]));
			vv.add(new Integer(수학[i]));
			vv.add(new Integer(과학[i])); 
		}
		System.out.println("=========학생 성적 조회 프로그램============");
	    System.out.println("\n이름\t국어\t영어\t수학\t과학\t총점\t평균");
	    
	    Iterator itt = vv.iterator();
	    
	    while(itt.hasNext())
	    {
	    	System.out.print("\n" + itt.next());
	    	kor = ((Integer) itt.next()).intValue();
	    	eng = ((Integer) itt.next()).intValue();
	    	math = ((Integer) itt.next()).intValue();
	    	science = ((Integer) itt.next()).intValue();
	    	
	    
	    //Enumeration<Comparable>  enu = vv.elements();
	    
//	    while (enu.hasMoreElements()) { 
	    	//벡터에선 hasmoreElements 를 써야하고 어레이리스트에선 hasnext를 추가해야한다.
//			System.out.print("\n"+enu.nextElement());
//			kor = ((Integer)enu.nextElement()).intValue(); // intValue() : int타입으로 형변환
//			eng = ((Integer)enu.nextElement()).intValue();
//			math = ((Integer)enu.nextElement()).intValue();
			total = kor + eng + math + science;
			
			avg = total / 4.0;
			
			System.out.print("\t"+kor+"\t"+eng+"\t"+math + "\t"+science);
			System.out.printf("\t%3d   %5.1f",total, avg);
		}
	}
}
