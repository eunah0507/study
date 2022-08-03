package ja_0719;

abstract class Style_88
{
	int i = 77; // int i는 왜써준거지? 그냥 쓰셨대~
	
	abstract void draw(); //몸통이 없다. 추상클래스다.
	
	abstract void print();//몸통이 없다. 추상클래스다.
	
	abstract void message();//몸통이 없다. 추상클래스다.
}

class Square extends Style_88
{
	@Override
	void draw() 
	{
		System.out.println("사각형을 그린다!");
	}
	@Override
	void message() 
	{
		System.out.println("사각형은 어떻게 그릴까요?");
	}
	@Override
	void print() 
	{
		System.out.println("Square");
	}
}

class Circle extends Style_88
{

	@Override
	void draw() 
	{
		System.out.println("원을 그립니다.");
	}

	@Override
	void print()
	{
		System.out.println(" Circle ");
	}
	@Override
	void message() 
	{
		System.out.println("원을 그려볼까요?");
	}
}

class Triangle extends Style_88
{

	@Override
	void draw() 
	{
		System.out.println("삼각형을 그립니다.");
	}

	@Override
	void print() {
		System.out.println(" Triangle ");
	}
	@Override
	void message() 
	{
		System.out.println("삼각형의 총합은 180도입니다.");
	}
}

public class Style_2 {
	public static void main(String[] args) {
		
		Square obj_1 = new Square();
		Circle obj_2 = new Circle();
		Triangle obj_3 = new Triangle();
		
		obj_1.draw();
		obj_1.print();
		obj_1.message();
		
		obj_2.draw();
		obj_2.print();
		obj_2.message();
		
		obj_3.draw();
		obj_3.print();
		obj_3.message();
		
		System.out.println("==============================");
		
		Style_88 ooo_1 = new Square(); //객체의 형변환
		ooo_1.draw();
		ooo_1.print();
		ooo_1.message();
		
		ooo_1 = new Circle(); //객체를 굳이 따로 만들필요가 없다. 왜????
		ooo_1.draw();
		ooo_1.print();
		ooo_1.message();
		
		ooo_1 = new Triangle();
		ooo_1.draw();
		ooo_1.print();
		ooo_1.message();
	}
}
