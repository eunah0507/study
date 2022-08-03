package ja_0718;

//final class WordProcess
class WordProcess //final이 붙으면 상속받을 수 없고, 없으면 상속받을 수 있다.
{
	void Input() {} // 왜 바로 () {} 를 쓴거지? 
	
	void Edit() {}
	
	void Print() {}
	
	void About() { //display나 println이 없는데 바로 출력이 되네? 왜그러지? 아래에 about 이 있어서?
		System.out.print("A회사 개발");
	}
}

class NewWordProcess extends WordProcess
{
	void About()
	{
		System.out.println("B회사 개발");
	}
}
public class Final_1 {
	public static void main(String[] args) {
		
		NewWordProcess obj = new NewWordProcess() ;
		
		obj.About();
	}
}
