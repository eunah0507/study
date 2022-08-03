package ja_0727;

import java.util.StringTokenizer;

//토큰 : 단어 한 개 혹은 구두점 한 개를 지칭하는 말뭉치(corpus)의 최소 단위
//    : 문자열을 분리하는 기준 ex) ',' (정하기나름)
//Tokenizer : " "을 기준으로 문자열 분리

public class StringTokenizerTest {
public static void main(String[] args) {
	
	String str = "자바는$ 다양한, 문자열 처리, 날짜 처리,"+
	             "시간처리, 를 위한 메소드를, 갖고 있습니다.";
	
	
	StringTokenizer stt = new StringTokenizer(str,",$리");
	System.out.println("토큰',$리'의 수  : "+stt.countTokens());
	
	
	while(stt.hasMoreElements()) {  //stt에 Token이 있을 때까지 돌아라
		System.out.println(stt.nextToken());
	}
	//글자도 예외없이 토큰으로 쳐서 (nextToken())출력값에서 없어지는 것을 볼 수 있다.
	
}
}
