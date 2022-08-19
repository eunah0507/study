package ja_0818;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_1 {
	public static void main(String[] args)  throws IOException{
		
		File tFile = new File("c:\\java22\\수업정리\\0727.txt");
		FileOutputStream fos = new FileOutputStream(tFile);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(99);
		dos.writeByte(7);
		dos.writeShort(100);
		dos.writeInt(100);
		dos.writeLong(1000);
		dos.writeFloat(89.345f);
		dos.writeDouble(4567.4322);
		dos.flush();
		/*버퍼에 남은 출력 스트림 출력
		 * flush()메소드를 호출하지 않으면 버퍼로만 출력되기 때문에
		 * 실제로 도착지점에는 아무런 데이터를 받지 못하는 경우가 발생할 수 있다.
		 */
	   System.out.println("0727.txt에"+dos.size()+"byte저장");
	   dos.close();
		
	}

}
