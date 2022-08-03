package ja_0713;

public class MyTV {
	public static void main(String[] args) {
		
		TV ttvv ; //스텍영역에 레퍼런스 변수 ttvv를 위한 공간이 마련된다.
		
		ttvv = new TV();
		/* new에 의한 인스턴스 생성이란 필드, 메소드 값들을 저장할 수 
		 * 있는 별도의 공간을 heap 영역에 배당받는 것을 의미한다.
		 * 참조 변수는 생성된 인스턴스의 주소를 저장하기 위해
		 * 스택 영역에메모리를 할당한다.*/
		
		TV ttvv2 = new TV();
		
		ttvv.spower();
		ttvv2.spower();
		
		ttvv.channel = 7;
		ttvv2.channel = 11;
		
		ttvv.volume = 15;
		ttvv2.volume = 23;
		
		ttvv.channelUp();
		ttvv.channelUp();
		ttvv.channelUp();

		ttvv2.channelDown();
		ttvv2.channelDown();
		ttvv2.channelDown();
		ttvv2.channelDown();
		ttvv2.channelDown();
		
		ttvv.volumeUp();
		ttvv.volumeUp();
		
		ttvv2.volumeDown();
		ttvv2.volumeDown();
		ttvv2.volumeDown();
		ttvv2.volumeDown();
		ttvv2.volumeDown();
		ttvv2.volumeDown();
		ttvv2.volumeDown();
		ttvv2.volumeDown();
		
		System.out.println("현재 ttvv는" + ttvv.power + "상태입니다.");
		System.out.println("현재 TV 채널은"+ttvv.channel+"번 입니다.");
		System.out.println("현재 ttvv2 는"+ ttvv2.power + "상태입니다.");
		System.out.println("현재 ttvv2 채널은"+ttvv2.channel+"번입니다.");
		System.out.println("현재 ttvv 볼륨은" + ttvv.volume + "크기 입니다.");
		System.out.println("현재 ttvv2 볼륨은" + ttvv2.volume + "크기 입니다.");
	}

}
