package ja_0817;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileReader_1 { //BufferedReader쓰는 방법

	public static void main(String[] args) throws Exception{
		
		int i = 0;
		
		String file;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("읽어올 파일 이름을 입력하세요 ! ");
		file = read.readLine();
		
		System.out.println(file + "\n 문서 내용 \n*************");
		
		FileReader frr = new FileReader(file);
		
		while((i= frr.read()) != -1)//데이터가 없을 떄가지 읽는다 (데이터 들어있으면 무조건 출력)
		{
			System.out.print((char) i); // => 문자로 바꿔서 출력
		}
		frr.close();
		
	}
}
