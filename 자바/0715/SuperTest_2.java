package ja_0715;

class SuperTV
{
	boolean power;
	int channel;
	int volume;
	
	void power_1()
	{
		power = !power;  // false면 true로 나오고 true 라면 false나옴
	}
	
	void channelUP()
	{
		channel++;
	}
	
	void channelDown()
	{
		channel--;
	}
	
	void volumeUp()
	{
		volume++;
	}
	
	void volumeDown()
	{
		volume--;
	}
	
	void displayCaption(String str)
	{
		if (power) {    //참이라면 실행해~
			System.out.println(str);
		}
	}
}
	
class MyTv extends SuperTV
{
	void displayCaption(String str)
		{if(power) //참일 경우 실행
		{
			System.out.println(str);
		}
	}
}
public class SuperTest_2 {
	public static void main(String[] args) {
		
		MyTv mytv = new MyTv();
		
		mytv.channel =9;
		mytv.channelUP();
		mytv.channelUP();
		mytv.channelUP();
		mytv.channelUP();
		mytv.channelDown();
		mytv.channelDown();
		mytv.channelDown();
		
		
		mytv.volume = 29;  //여기서 값을 안 주면 0에서 시작 맨 처음에 초기화 시켰기 떄문에!
		mytv.volumeDown();
		mytv.volumeDown();
		mytv.volumeDown();
		mytv.volumeDown();
		mytv.volumeDown();
		mytv.volumeDown();
		mytv.volumeUp();
		mytv.volumeUp();
		mytv.volumeUp();
		
		System.out.println(mytv.channel);
		System.out.println(mytv.volume);
	
		//myTV.power = true;
		mytv.displayCaption("아름다운 강산");  //얘가 안 나오는 이유는 power기본값이 false기 때문
		
		mytv.power_1();
		
		mytv.displayCaption("시원한 여름 바람");
		
		mytv.power_1();
		
		mytv.displayCaption("신나는 금요일~!~!!~!!!");	
	}
}
