package ja_0817;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Date;

public class FileOutputStream_1 { //메모장 파일X 주로 그림,음악파일!

	public static void main(String[] args) throws Exception {
		
		String file, str;
		
		Date date = new Date();
		
		str = "파일 생성시간 \r\n" +date +"\r\n";
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("파일 이름 : ");
		file = read.readLine();
		
		System.out.println("저장한 문자열 입력 : ");
		str += read.readLine();
		
		byte[] byte_str = str.getBytes(); //str길이 만큼 byte배열 만들기
		
		FileOutputStream fos = new FileOutputStream(file); //** //바이트 단위로 저장8비트
		fos.write(byte_str);//**
		
//		FileWriter fww = new FileWriter(file);
//		fww.write(ch_str); //이렇게 표현했던 걸 **로도 표현 가능해 //유니코드로 저장 16비트
	
		fos.close();
		
		System.out.println(file +"파일 저장 성공!!!!!");
		
	}
}
