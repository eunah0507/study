package ja_0714;

class Car{
	String color; // 멤버 변수(필드, 전역변수)
	String gearType;
	int door;
	String direction;

	public Car() //default 생성자, 클래스에 생성자가 없으면 자동으로 만들어준다.
	{
	}
	public Car(String c, String g, int d, String dd) { //매개변수가 있는 생성자
		color = c;
		gearType = g;
		door = d;
		direction = dd;
	}
	public String toString() 
	{
		return "color : " + color + ", gearType : " + gearType + "door : " 
				+ door + "direction : " + direction;
	} //toString이 없어지면 값이 완전 다르게 나온다
}

public class CarTest_1 {
	public static void main(String[] args) {

		Car car1 = new Car();
		car1.color = "green";
		car1.gearType = "수동";
		car1.door = 5;
		car1.direction = "left";
		//오버라이딩이 뭔지 물어보기
		

		Car car2 = new Car("red", "fullauto", 3, "right");
		Car car3 = new Car("black", "수동", 9, "메롱");
		
		System.out.println(car1.toString()); //toString은 String타입
		if (car1.direction.equals("left")) 
		{
			System.out.println("이 차는 왼쪽으로 돌고 있습니다.");
		}
		else if (car2.direction.equals("right"))
		{
			System.out.println("이 차는 오른쪽으로 돌고 있습니다.");
		}
		else
		{
			System.out.println("이 차는 직진하고 있습니다.");
		}
		System.out.println(car2.toString());
		if (car2.direction.equals("left")) 
		{
			System.out.println("이 차는 왼쪽으로 돌고 있습니다.");
		}
		else if (car2.direction.equals("right"))
		{
			System.out.println("이 차는 오른쪽으로 돌고 있습니다.");
		}
		else
		{
			System.out.println("이 차는 직진하고 있습니다.");
		}
		System.out.println(car3.toString());
		if (car3.direction.equals("left")) 
		{
			System.out.println("이 차는 왼쪽으로 돌고 있습니다.");
		}
		else if (car3.direction.equals("right"))
		{
			System.out.println("이 차는 오른쪽으로 돌고 있습니다.");
		}
		else
		{
			System.out.println("이 차는 직진하고 있습니다.");
		}
		System.out.println();
		System.out.println(car1);//==System.out.println(car1.toString());
		System.out.println(car2);
		System.out.println(car3);
		
		
	}

}
