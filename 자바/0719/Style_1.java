package ja_0719;

abstract class 도형
{
	int i = 33;
	abstract void draw(); //똑같은 이름을 재정의한다 = 오버라이딩 // 몸통이 없다
	
	void show()
	{
		System.out.println("도형 클래스 속 show() 메소드 !!"); //바디부분을 만들어줬다. 객체화 가능하다.
	}
}

class 사각형 extends 도형
{

	@Override
	void draw() {
			System.out.println("사각형을 그린다.");
	}
}

class 삼각형 extends 도형
{
	@Override
	void draw() 
	{
		System.out.println("삼각형을 그린다.");
	}
}

public class Style_1 {
	public static void main(String[] args) {
	
		//사각형 obj_1 = new 사각형();
		//삼각형 obj_2 = new 삼각형();
		도형 obj_1 = new 사각형();
		도형 obj_2 = new 삼각형();// 으로 만들어도 똑같은 결과가 나온다.
		obj_1.draw();
		obj_1.show();
		obj_2.draw();
		obj_2.show();
		
	}
}


