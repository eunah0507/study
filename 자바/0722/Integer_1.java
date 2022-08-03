package ja_0722;

public class Integer_1 {
	public static void main(String[] args) {
		
		Integer kbs_1 = new Integer(300);
		Integer mbc_1 = new Integer(300); //쓰는걸 권장하지 않는다.
		
		System.out.println(kbs_1.getClass().hashCode());
		System.out.println(mbc_1);
		
		System.out.println("kbs_1 == mbc_1 : " + (kbs_1 == mbc_1)); 
		//주소는 참조변수가 달라서 false가 나옴
		
		System.out.println("kbs_1.equals(mbc_1) :" + (kbs_1.equals(mbc_1)));
		//내용이 같기 때문에 true가 나옴
		
		System.out.println("kbs_1.toString() : " + kbs_1.toString());
		System.out.println("mbc_1.toString() : " + mbc_1.toString());
		
		System.out.println("kbs_1.hashcode() :" + kbs_1.hashCode());
		System.out.println("mbc_1.hashcode() : " + mbc_1.hashCode());
		System.out.println("kbs_1.hashcode() : " + kbs_1.hashCode(789));
		System.out.println("mbc_1.hashcode() : " + mbc_1.hashCode(456));
		
		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);
		
		System.out.println("SIZE : " + Integer.SIZE + "bits");
		System.out.println("TYPE : " + Integer.TYPE);
		
	}
}
