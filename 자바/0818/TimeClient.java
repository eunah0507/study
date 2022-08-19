package ja_0818;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

public class TimeClient {
	public static void main(String[] args) {
		
		String server_ip;
		String server_str;
		Date date = null;
		int port = 7777;
		try {
			
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("서버 타임 시간 받아오기....");
			System.out.print("서버 아이피 입력 : ");
			
			server_ip  = read.readLine();
			
			Socket  client  = new Socket(server_ip, port);
			InputStream  is = client.getInputStream();
			ObjectInputStream  ois = new ObjectInputStream(is);
			date = (Date)ois.readObject();
			server_str = (String)ois.readObject();
			System.out.println("현재 시간: "+date+"\n전달된 내용 : "+server_str);
			ois.close();
			client.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
 }


/* 오류 : Address already in use: bind
 * 해결방법 : 서버 죽이기
 * 명령프롬프트 : netstat -ano  ->해당포트번호가 있는지 확인하고 있으면 PID번호 확인
 * 명령프롬프트 : taskkill /f /pid  PID번호
 */