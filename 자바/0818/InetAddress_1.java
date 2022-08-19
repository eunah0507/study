package ja_0818;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetAddress_1 {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress  addr1 = InetAddress.getByName("www.youngjin.co.kr");
		InetAddress  addr2 = InetAddress.getByName("192.168.20.11");
		InetAddress  addr3 = InetAddress.getLocalHost(); //본 컴퓨터의 주소와 이름
		
		System.out.println("==============================");
		System.out.println("addr1 : "+addr1.getHostAddress());
		System.out.println("addr1 : "+addr1.getHostName());
		
		System.out.println("addr2 : "+addr2.getHostAddress());
		System.out.println("addr2 : "+addr2.getHostName());
		
		System.out.println("addr3 : "+addr3.getHostAddress());
		System.out.println("addr3 : "+addr3.getHostName());
		
	}

}
