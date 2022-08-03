package ja_0727;

public class StringBuffer_2 {
public static void main(String[] args) {
	
	StringBuffer  stbf  = new StringBuffer("Java");
	
	stbf.append("Program"); // 뒤에 " "추가
	
	System.out.println(stbf);
	
	for (int i = 0; i < stbf.length(); i++) {
		System.out.print(stbf.charAt(i)+"\t");
	}
	System.out.println();
	
	for (int i = stbf.length()-1; i>=0;  i--) { //charAt()사용해서 stbf 반전
		System.out.print(stbf.charAt(i)+"\t");  
	}
	
	stbf.insert(4,"*");  // 4번째 자리에 *삽입
	System.out.println("\n"+stbf);
	
	System.out.println("문자열의 길이 : "+stbf.length());
	
	stbf.setLength(5); 
	// 문자열의 길이를 변경. 이 밑으로는 stbf의 결과가 5자리밖에 나오지 않는다.
	
	System.out.println("새로운 문자열의 길이 : "+stbf.length());
	
	System.out.println("setLength(5) 적용 문자열 : "+stbf);
	
	System.out.println("반전 문자열 : "+stbf.reverse());  //반전 메소드 사용
}
}
