class IoException_1 
{
	public static void main(String[] args) throws Exception
	{
		int data = 0;

		System.out.println("글자를 입력하세요 ... ");
		data = System.in.read(); // 키보드에서 한 문자를 입력받는다.

		System.out.println(data);
		System.out.println((char)data);
		System.out.println((char)97);

		/*
		자바의 기본 입력
		: 자바에서는 표준 입력 장지인 키보드에 대하여
		System 클래스에 in 이라는 객체를 마련해두었다.
		System.in 객체로 read()메소드를 호출하여 키보드에서
		데이터를 입력받을 수 있다.

		public abstract in read() throws IOException

		read() 메소드는 키보드에서 한 byte를 읽는다. 더 이상
		읽을 값이 없을경우 -1을 리턴한다. (중요)

		입출력과 관련된 모든 클래스의 메소드는 입출력을 수행하는 동안
		장치 이상 등으로 인한 여러가지 예외를 발생시킨다.
		그렇기 때문에 입출력과 관련된 메소드를 사용할 때에는 반드시
		예외 (Exception) 처리를 해야한다.
		*/

		System.out.println("Hello World!");
	}
}
