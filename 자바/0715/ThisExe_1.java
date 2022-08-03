package ja_0715;

class This1
{
	private int kor;
	private int eng;
	private int math;
	
	public This1(int kor, int eng, int math)
	{
		/*
		 * kor = kor;
		 * eng = eng;
		 * math = math
		 * 
		 *이렇게 하면 실행 시켰을 때 총점이 0이 나와 이유는 밖에 
		 *값보다 지역변수가 더 우선이라 밖에 kor, eng, math에 영향을 안 받는 것
		 */
		
		this.kor = kor;
		this.eng = eng;
		this.math = math; //여기서 this 붙이면 위에 class 안에 값들을 지칭해주는 것
	}
	
	public int total()
	{
		return (this.kor + this.eng + this.math);
		 // 총점 0 보려면 여기 식 this 다 빼봐
	}
}
public class ThisExe_1 {
	public static void main(String[] args) {
		
		This1 obj = new This1(100, 75, 85);
		
		System.out.println("총점 : " + obj.total());
	}
}
