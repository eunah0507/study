package ja_0719;

interface Mbc
{
	void play();
}

class Kbs
{
	void autoPlay(Mbc obj)
	{
		obj.play();
	}
}

class MySbs implements Mbc
{

	@Override
	public void play() {
		System.out.println("MySbs TV 생방송~");
	}
}

class MyCNN implements Mbc
{

	@Override
	public void play() {
		System.out.println("MyCNN TV 야구 생중계~~");
	}
}

public class InterfaceTest_3 {
	public static void main(String[] args) {
		
		Kbs obj = new Kbs();
		
		obj.autoPlay(new MySbs());
		obj.autoPlay(new MyCNN());
		
	}
}
