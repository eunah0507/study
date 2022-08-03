package ja_0713;

public class TV {
	
	// TV 의 속성(멤버 변수 == 필드)
	String color; // 색상
	boolean power; //전원 (on/off)
	int channel; //채널
	int volume;
	
	//TV기능 메소드
	void spower() //TV를 켜거나 끄는 기능의 메소드
	{
		power = !power;
	}
	void channelUp() //TV채널을 높이는 기능을 하는 메소드
	{
		++channel;
	}
	
	void channelDown() //TV채널을 낮추는 기능을 하는 메소드
	{
		--channel;
	}
	void volumeUp()
	{
		++volume;
	}
	void volumeDown()
	{
		--volume;
	}
}