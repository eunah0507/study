package ja_0727;
// 1~70000까지 더할때, String연산과 StringBuffer연산의 시간차를 보여주는 코드.
// 문자열의 연산처리는 StringBuffer를 이용해라. 그게 훨씬 빠르다

public class StringBuffer_3 {
public static void main(String[] args) {
	
	long start, end;
	String str_1 = new String("1 ~ 70000의 합 11 : ");
	StringBuffer  stbf_2  = new StringBuffer("1 ~ 70000의 합 22 : ");
	
	
	start  =System.currentTimeMillis();
	for (int i = 0; i < 70000; i++) {
		str_1  += i;
		str_1  +="+";
	}
	end  =  System.currentTimeMillis();
	System.out.println("String Time : "+(end-start));
	
	
	
	start = System.currentTimeMillis();
	for (int i = 0; i < 70000; i++) {
		stbf_2.append(i);
		stbf_2.append("+");
	}
	end = System.currentTimeMillis();
	System.out.println("StringBuffer Time : "+(end-start));
			
	
}
}
