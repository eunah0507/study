package ja_0727;
// 그 전에 했던 성적프로그램과 비교 : 이름(String)과 점수(int) 두 가지의 Data를 하나의 Vector에 담을 수 있다.
import java.util.Enumeration;
import java.util.Vector;

public class Vector_3 {
public static void main(String[] args) {
	
	int kor, eng, math, total;
	
	double  avg;
	
	String[] 이름 = {"강지수", "김동현","김민석",
			        "김민지","김유진","김창용","김혜련",
			        "김희진","류현정", "박주선"};
	
	int[]국어 = {56,78,34,66,90,47,88,65,78,85};
	int[]영어 = {78,49,77,89,57,89,75,88,56,64};
	int[]수학 = {85,69,88,33,56,90,55,78,66,83};
	
	Vector<Comparable> vv = new Vector<Comparable>();
	
	for (int i = 0; i < 10; i++) {
		vv.add((String)이름[i]);
		vv.add(국어[i]);
		vv.add(new Integer(영어[i]));
		vv.add(new Integer(수학[i]));
	}
	System.out.println("=========학생 성적 조회 프로그램============");
    System.out.println("\n이름\t국어\t영어\t수학\t총점\t평균");
    
    Enumeration<Comparable>  enu = vv.elements();
    
    while (enu.hasMoreElements()) {
		System.out.print("\n"+enu.nextElement());
		kor = ((Integer)enu.nextElement()).intValue(); // intValue() : int타입으로 형변환
		eng = ((Integer)enu.nextElement()).intValue();
		math = ((Integer)enu.nextElement()).intValue();
		total = kor + eng + math;
		
		avg = total / 3.0;
		
		System.out.print("\t"+kor+"\t"+eng+"\t"+math);
		System.out.printf("\t%3d   %5.1f",total, avg);
	}
	
	
}
}
