package ja_0727;
//capacity와 size의 구분
//Vector에서 객체의 추가와 제거
import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Vector_2 {
public static void main(String[] args) {
	
	int i;
	
	Date  date = new Date();
	
	Vector  vv = new Vector(3,5); // 현재size : 3,  5씩 증가
	
	vv.addElement("Java");
	vv.add(new Double(56.7));
	vv.addElement(date);
	
	System.out.println("========= 3개의 객체 추가=============");
	
	System.out.println("size 11 : "+vv.size() + ", capacity : "+vv.capacity());
	
	System.out.println("====================================");
	
	for (int j = 0; j < 10; j++) {
		vv.add(new Integer(j+1));
	}
	vv.add("korea");
	
	System.out.println("==========10개의 객체 추가============");
    System.out.println("size22 : "+vv.size()+", capacity : "+vv.capacity());
    
    System.out.println("------------ Vector 내용 출력 ----------");
    
    
    
    Enumeration enu = vv.elements(); // Vector속의 값을 뽑아오는 방법
    while (enu.hasMoreElements()) {
		System.out.println(enu.nextElement()+" ");
	}
    
    System.out.println("=============객체 포함 확인===========");
    
    if (vv.contains("Javar")) {
		System.out.println(" Java 문자열 포함됨");
	}else {
		System.out.println(" Java 문자열 포함 안안안안됨");
	}
    
    System.out.println("56.7 객체 위치 : "+vv.indexOf(new Double(56.7)));
    // 결과값이 -1이 나왔다면 그 객체는 없는 것.
    System.out.println("\n입력 시간 : "+ vv.get(vv.indexOf(date)));
    
   
    
   vv.removeElementAt(vv.lastIndexOf(date));  // date객체 삭제
   
   for (int j = 0; j < vv.size(); j+=3) { // index 4, 8의 위치에 해당하는 값 삭제 
	   vv.removeElementAt(j);  
    }
   
   
	vv.setElementAt("seoul", 2); // 3번째 위치에 seoul문자열 추가
	
	enu = vv.elements();
	
	while (enu.hasMoreElements()) {
		System.out.println(enu.nextElement()+" ");
	}
	
	System.out.println("\n size : "+vv.size()+", capacity : "+vv.capacity());
	
	vv.trimToSize();  // 공백제거
	System.out.println("\n size : "+vv.size()+", capacity : "+vv.capacity());
	
	vv.setSize(3); // 크기를 3으로 조정
	
	enu = vv.elements();
	
	while (enu.hasMoreElements()) {
		System.out.println(enu.nextElement()+" ");
		
	}
	vv.removeAllElements();// 모든 객체 제거
	System.out.println("\n size : "+vv.size()+", capacity : "+vv.capacity());
}
}
