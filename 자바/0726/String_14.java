package ja_0726;

public class String_14 {
	public static void main(String[] args) {
					  //0123 45 67 8901 23 456789 01 23 4567 89 01234
		String str = "높이 나는 새가 멀리 본다. 일찍 일어나는 새가 모이를 줍는다.";
					  
		System.out.println("검색할 문자열 :  \n " + str);
		System.out.println("indexOf(새) : " + str.indexOf("새"));
		System.out.println("indexOf(새,10) : " + str.indexOf("새",10)); //10의 의미가 뭐지? 왜 24가?
		System.out.println("lastindexOf(새) : " + str.lastIndexOf("새"));
		System.out.println("lastindexOf(새,10) : " + str.lastIndexOf("새",10)); // ???
		
		
	}
}
