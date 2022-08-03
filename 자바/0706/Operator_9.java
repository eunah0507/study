class Operator_9 
{
	public static void main(String[] args) 
	{
		System.out.printf("#1234567891234567891234567890");
		System.out.printf("\n/%d",16);
		System.out.printf("\n/%5d",16); // 5자리 마련후 오른쪽 정렬
		System.out.printf("\n/%-5d/",16); // 5자리 마련 후 왼쪽 정렬
		System.out.printf("\n/%1d",16); // 지정된 자릿수 무시됨
		System.out.printf("\n/%05d/ \n",16); // 왼쪽 빈 여백을 0으로 채움
		System.out.println("Hello World!");

		System.out.printf(/%5d,18);
		/* 기본 입출력

		: 자바에서 출력을 위한 메소드로 제공되는 println(),
		  printf(), printf()와 입력을 위한 read() 메소드와
		  Scanner 클래시 사용

		  출력을 위한 메소드는 printf(), println(), printf()와 같이 3가지 형태가
		  제공된다. 이중 printf()메소드는 C언어 형식을 그대로 도입했다.

		  정수형 상수 출력 지정자

		     형식      적용               출력상태         설명
		%자릿수  d   printf("%5d", 16)    ...16      빈 공간이 왼쪽에 생김    
		%-자릿수 d   printf("%-5d", 16)   16...      빈 공간이 오른쪽에 생김
		%0자릿수 d   printf("%05d", 16)   00016      왼쪽에 생긴 빈 공간에 0으로 채움
		*/


		/*
		실수형 상수 출력 형식 지정자

		: 실수를 화면에 출력 할 때에도 먼저 자릿수를 확보해야 출력이 가능하다.
		  %f 형식 지정자를 이용하여 실수 값을 출력 시키면 소숫점 이하는
		  자동적으로 6자리까지 출력된다. 만일 적당한 자릿수 만큼만
		  출력하려면 %전체자릿수.소숫점이하 자릿수 f와 같이 자릿수를 지정하면 된다.

		  실수 데이터 적용

		  적용                        출력상태         설명\
      printf("%f \n",0.1);          0.100000     %f는 기본적으로 소숫점 이하 6자리까지 출력
	  printf("%5.3f \n", 0.1);      0.100        전체자릿수 5자리 소숫점 이하 3자리 까지 출력
	  printf("%f \n", 123.456);     123.456000   %f는 기본적으로 소숫점 이하 6자리까지 출력
	  printf("%7.2f \n",123.456);   123.46       소수이하 자릿수가 작으면 반올림
	  printf("%5.3f \n",123.456);   123.456      소숫점 앞자리가 작으면 무시되고 제대로 123.456출력
		
	  %d 정수형출력
	  %c 문자형식으로 출력
	  %s 문자열 형식으로 출력
	  */

	  System.out.printf("\n#1234567891234567891324567890");
	  System.out.printf("\n/%5d%5d%5d%5d/",1,20,30,400);
	  System.out.printf("\n/%-5d%-5d%-5d%-5d/",1,20,30,400);

	  System.out.println();

	  System.out.printf("%f \n",0.1);
	  System.out.printf("%5.3f \n",0.1);
	  System.out.printf("%.2f \n", 123.456);
	  System.out.printf("%7.2f \n",123.456);
	  System.out.printf("%5.3f \n",123.456);

	}
}
