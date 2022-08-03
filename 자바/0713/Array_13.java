package ja_0713;

import java.util.Iterator;

public class Array_13 {

	public static void main(String[] args) {
		
		final int SIZE = 6;
		
		int [] freq = new int [SIZE];
		
		for (int i = 0; i < 100000; i++) {
			++freq[(int)(Math.random()* SIZE)];			// Math.random()은 0~0.9까지 아무 소수점 숫자가 나온다. 
			//freq[(int)(Math.random()* SIZE)]=freq[(int)(Math.random()* SIZE)]+1;// 즉, Math.random()*6은 0~5까지 아무 숫자가 나온다.
			//freq[0~5]=freq[0~5]+1
		}
		
		System.out.println("===========================");
		System.out.println("면                       빈도수");
		System.out.println("===========================");
		
		for (int i = 0; i < SIZE; i++) {
			System.out.println("  " + (i+1) + "  "+ "  " + freq[i] + "");
		}
	}
}