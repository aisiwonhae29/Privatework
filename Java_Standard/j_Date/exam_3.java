package Java_Standard.j_Date;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class exam_3 {

	public static void main(String[] args) throws Exception {
		Calendar birth = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		birth.set(2000, 01,01);
		
		SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd");
		Date b =birth.getTime();
		Date t = today.getTime();
		
		System.out.println("birth day = "+df.format(b));
		System.out.println("today = "+new SimpleDateFormat("yyyy-MM-dd").format(t));
		
		
	}

}
