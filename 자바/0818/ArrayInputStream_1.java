package ja_0818;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ArrayInputStream_1 {
	public static void main(String[] args) {
		
		byte[] inSrc  = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		//ByteArrayInputStream  : 바이트 배열에 데이터를 입출력하는데 사용되는 스트림
		
		input  = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0;
		
		while ((data = input.read()) != -1) {
			output.write(data);// input에 있는 data를 읽어서 output에 작성
		}
		/*
		 * input.read() : 이 입력 스트림에서 데이터의 다음 바이트를 읽습니다.
		 *                값 byte는 0에서 255사이의 int로 변환됩니다.
		 *                스트림의 끝에 도달하여 사용할 수 있는 바이트가 없으면 값 -1이 반환됩니다.
		 */
		outSrc = output.toByteArray();

		System.out.println("Input Source : "+Arrays.toString(inSrc));
		System.out.println("Output Source : "+Arrays.toString(outSrc));
		
	}

}
