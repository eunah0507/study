package ja_0714;

//파일이 단독으로 존재하면 public을 붙일 수 있지만. 지금은 못붙인다
class StaticMethod
{
	static int kor;
	static int eng;
	static int math;
		   
	static double average() //double이 static이기 때문에 아래에 있는 kor eng math도 static이어야함
	{
		int total = kor + eng + math;
		
		return(total / 3.0);
	}
}
public class StaticMethod_11 {
	public static void main(String[] args) {
		
		StaticMethod sm = new StaticMethod(); //int와 double을 static을 지우면 이걸 실행하지 못한다.
		
		sm.kor = 70;
		sm.eng = 50;
		sm.math = 100;
	
		System.out.println("평균 = " + sm.average());
		System.out.println("평균 = " + StaticMethod.average());
	}
}
