package ja_0719;

interface Korea
{
	void kor();
}

interface English
{
	void eng();
}

interface Math
{
	void math();
}

interface China
{
	void chh();
}

interface Student extends Korea, English, Math, China
{
	void study();
}

class StudyHard implements Student // class는 interface를 구현한다
{

	@Override
	public void kor() 
	{
		System.out.println("국어를 공부하자");
	}

	@Override
	public void eng() 
	{
		System.out.println("영어를 공부하자");
	}

	@Override
	public void math() 
	{
		System.out.println("수학은 조금 어렵다");
	}

	@Override
	public void chh() 
	{
		System.out.println("중국어는 모르겠다");
	}

	@Override
	public void study() 
	{
		System.out.println("공부를 열심히하자");
	}
	
}
public class ClassTest {
	public static void main(String[] args) {
		
		StudyHard obj = new StudyHard();
		
		obj.chh();
		obj.kor();
		obj.math();
		obj.eng();
		obj.study();
		
	}
}
