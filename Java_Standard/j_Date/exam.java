package Java_Standard.j_Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class exam {
	public static void main(String[] args)  {
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 0, 1);
		Date today = new Date(cal.getTimeInMillis());

		SimpleDateFormat [] y= new SimpleDateFormat[12];
		SimpleDateFormat [] z= new SimpleDateFormat[12];
		for (int i=0; i<y.length; i++) {
		y[i]=new SimpleDateFormat("yyyy-MM-dd은 2번쨰 일요일입니다");
		z[i]=new SimpleDateFormat( "W/E");

		while (!(z[i].format(today).equals("2/일"))) {
			cal.add(Calendar.DATE, 1);
			today = new Date(cal.getTimeInMillis());
		}
		
		System.out.println(y[i].format(today));
		cal.add(Calendar.DATE, 1);
		today=cal.getTime();
		
		}
		
	}
}
