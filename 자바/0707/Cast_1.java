class Cast_1 
{
	public static void main(String[] args) 
	{
		byte bb;
		int ii = 365;
		double dd =1024.512;
		
		
		System.out.println("축소 형변환 결과");
		
		bb = (byte)ii; // 365 - 256 (byte = 1바이트, 8비트로만 표현되는데 256이 9번째 숫자라 빠짐)
		System.out.println("int형 365를 byte 형으로 바꾸면 : " + bb);

		ii = (int)dd;
		System.out.println("double형 1024.512를 int 형으로 바꾸면 :" + ii);

		bb = (byte)dd; // 1024.512 - 1024 ( byte 8비트라 11번째숫자인 1024는 빠짐)
		System.out.println("double형 1024.512를 byte 형으로 바꾸면 : " + bb);

		System.out.println("Hello World!");

		/*
		프로그램은 데이터와 명령으로 구성되어 있습니다.
		데이터를 처리하기 위해서는 변수가 필요하고, 데이터의
		종류에 따라서 다양한 자료형을 사용합니다.
		그런데 어떠한 경우에 서로 다른 자료형이 혼재되어
		사용되기도 합니다. 서로 다른 자료형 사이의 연산을
		위해서는 자료형을 일치시키는 작업이 필요합니다.
		이처럼 서로 다른 자료형 사이에서 자료형이
		변환되는 것을 형변환(Casting)이라고 합니다.

		확대 형변환(Widenig) : 자동으로 일어남 => 묵시적 형변환 (Implicit)

		축소 형변환(Narrowing) : Casting 해야함 => 명시적 형변환(Explicit)

		자동 규칙 

		byte = > char, short => int, long => float => double

		수식에서의 형변환
		: char,byte,short는 int로 변환되고, float는 double로 변환됨
		2개의 피연산자중 하나가 double이면 나머지도 double이고
		결과도 double임

		: 2개의 피연산자중 하나가 long이면 나머지도 long이고
		  결과도 long임

		: 수식의 모든 float는 double로 변환되어 연산을 수행함

		대입문에서의 형변환
		: 오른쪽 값이 왼쪽의 자료형으로 변환되어 저장됨
		: 모든 문자는 정수로 변환되어 저장됨
		: 실수형이 정수형으로 변환될 때 소숫점이하는 절삭되어 저장

		형식
		(자료형) 수식;
		*/
	}
}
