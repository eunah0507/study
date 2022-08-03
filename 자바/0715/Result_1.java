package ja_0715;

class Grade
{
	int kor = 60;// 객체 속성 변수 = 멤버 변수 = 필드 (객체속성변수는 만들면 자동으로 디폴트값으로 초기화가 돼..?)
	int eng = 65;// 객체 속성 변수 = 멤버 변수 = 필드
	int math = 77;// 객체 속성 변수 = 멤버 변수 = 필드
	public Grade()        // 얘 없어도 돼..생성자를 안 만들어도 디폴트 생성자가 존재해
	{
	}
}
public class Result_1 {
	public static void main(String[] args) {
		
		int total, a, b; //지역변수 (지역변수는 초기화가 안되므로 직접 초기화 시켜줘야헤)
		double avg;
		
		Grade grade1 = new Grade(); // 객체 참조 변수 grade1 생성
		Grade grade2 = new Grade(); // 객체 참조 변수 grade2 생성
		
		a = grade1.kor + grade1.eng + grade1.math;
		b = grade2.kor + grade2.eng + grade2.math;
		
		System.out.println("과목 총점 : a " + a);
		System.out.println("과목 총점 : b " + b);
		System.out.println();
		
		grade1.kor = 900;
		grade1.eng = 300;
		
		a = grade1.kor + grade1.eng + grade1.math;
		b = grade2.kor + grade2.eng + grade2.math;
		
		System.out.println("과목총점 : aa " + a);
		System.out.println("과목총점 : bb " + b);
		System.out.println();
		
		total = grade1.kor + grade2.eng + grade2.math;
		avg = total / 3.0;
		
		System.out.println("과목총점 : total " + total);
		System.out.println("과목평균 : avg " + avg);
		
	}
}
