class IoException_1 
{
	public static void main(String[] args) throws Exception
	{
		int data = 0;

		System.out.println("���ڸ� �Է��ϼ��� ... ");
		data = System.in.read(); // Ű���忡�� �� ���ڸ� �Է¹޴´�.

		System.out.println(data);
		System.out.println((char)data);
		System.out.println((char)97);

		/*
		�ڹ��� �⺻ �Է�
		: �ڹٿ����� ǥ�� �Է� ������ Ű���忡 ���Ͽ�
		System Ŭ������ in �̶�� ��ü�� �����صξ���.
		System.in ��ü�� read()�޼ҵ带 ȣ���Ͽ� Ű���忡��
		�����͸� �Է¹��� �� �ִ�.

		public abstract in read() throws IOException

		read() �޼ҵ�� Ű���忡�� �� byte�� �д´�. �� �̻�
		���� ���� ������� -1�� �����Ѵ�. (�߿�)

		����°� ���õ� ��� Ŭ������ �޼ҵ�� ������� �����ϴ� ����
		��ġ �̻� ������ ���� �������� ���ܸ� �߻���Ų��.
		�׷��� ������ ����°� ���õ� �޼ҵ带 ����� ������ �ݵ��
		���� (Exception) ó���� �ؾ��Ѵ�.
		*/

		System.out.println("Hello World!");
	}
}
