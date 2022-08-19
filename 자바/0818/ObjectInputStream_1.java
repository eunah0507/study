package ja_0818;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjectInputStream_1 {
	public static void main(String[] args)  throws Exception{
		
		String str, date_str;
		Date date;
		
       FileInputStream fis = new FileInputStream("c:\\java22\\수업정리\\0727.txt");
	   ObjectInputStream  ois = new ObjectInputStream(fis);
       
	   System.out.println(ois.readInt());
	   
	   str = (String)ois.readObject();
	   
	   System.out.println("\n"+str);
	   
	   date = (Date) ois.readObject();
	   
	   date_str = (date.getYear()+1990)+" 년";
	   date_str = (date.getMonth()+1)+" 월";
	   date_str = (date.getDate())+" 일";
	   
	   System.out.println(date_str);
	   ois.close();
		}

}
