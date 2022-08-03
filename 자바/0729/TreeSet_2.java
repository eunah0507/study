package ja_0729;

import java.util.TreeSet;

public class TreeSet_2 {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		//제너릭을 적어주면 노란색 줄이 사라진다. 제너릭을 적으려면 String으로 적을것. 아래에 다 문자열이다.
		
		String from = "b";
		String to = "d";
		
		set.add("abc");			
		set.add("alien");			
		set.add("bat");			
		set.add("car");			
		set.add("Car");			
		set.add("disc");			
		set.add("dance");			
		set.add("dZZZZZZ");			
		set.add("elevator");			
		set.add("elevator");			
		set.add("dzzzzz");			
		set.add("korea");			
		set.add("fan");			
		set.add("flower");	
		//대문자가 먼저! 그 후 오름차순 정렬되어 나온다.(아스키코드로 분류하여 대문자가 더 숫자가 작다)
		System.out.println(set);
		
		System.out.println("range search : from : " + from + "to "+ to);
		System.out.println("result1 : " + set.subSet(from, to));
		//dance같은건 d보다 큰값이다. 그래서 나오지 못했다. Car는 대문자 C라서 출력되지 않았다.
		//d만 넣어도 출력은 되지 않는다. b이상 d미만
		System.out.println("result2 : " + set.subSet(from, to + "zzzzz"));
		//z를 추가하여 dance, disc 등이 추가되었다.
	}
}
