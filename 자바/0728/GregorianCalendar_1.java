package ja_0728;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendar_1 {
	public static void main(String[] args) {
		
		GregorianCalendar gcal = new GregorianCalendar();
		
		prn("현재 날짜와 시간 \n");
		
		prn(gcal.get(Calendar.YEAR) + "년");
		prn((gcal.get(Calendar.MONTH) + 1 ) + "월");
		prn(gcal.get(Calendar.DATE) + "월");
		
		if (gcal.isLeapYear(gcal.get(Calendar.YEAR))) 
		{
			//isLeapYear() : 윤년이면 true 반환
			
			prn("\n 윤년입니다");
		}
		else
			prn("\n 윤년이 아닙니다");
	}
	
	private static void prn(String str)
	{
		System.out.println(str);
	}
}
