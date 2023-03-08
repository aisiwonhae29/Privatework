package Java_Standard.j_Date;

import java.util.Calendar;

public class a_1 {

	public static void main(String[] args) {
		final int[] TIME_UNIT = {3600 ,60 ,1};
		final String[] TIME_UNIT_NAME = {"시간","분","초"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
	
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		long difference = Math.abs(time2.getTimeInMillis()-time1.getTimeInMillis());
		System.out.println(difference);
		
		String tmp ="";
		
		for (int i=0 ; i<TIME_UNIT.length; i++) {
			
		}
	}

}
