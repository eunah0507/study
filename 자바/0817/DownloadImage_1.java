package ja_0817;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;

public class DownloadImage_1 {

	public static void main(String[] args) throws Exception{
		
//		String website = "http://www.oracle.com/us/hp07-bg121314-openworld-2x-2280475.jpg";
//		String website = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png";
		String website = "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png";
		
		System.out.println("" + website + "사이트에서 이미지를 다운로드 합니다.");
		
		URL url = new URL(website);
		byte[] buffer = new byte[2048];
		
	
//		try(InputStream in = url.openStream(); OutputStream out = new FileOutputStream("fonfon_1.jpg");) {
		
		try {
			InputStream in = url.openStream();
			OutputStream out = new FileOutputStream("korea_4.jpg");
			int length = 0;
			
			while((length = in.read(buffer)) != -1) 
			{
				System.out.println(""+length +"바이트 만큼 읽었음~~");
				out.write(buffer, 0, length);
			}
			
			in.close();
			out.close();
		} 
		catch (Exception e) 		
		{
			System.out.println("예외 : "+e.getMessage());
		}
	}
}
