package Java_Standard.j_Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class exam_2 {
	static int paycheckCount(Calendar from, Calendar to) {
		int monDiff=0;
		while(!(from.get(Calendar.DAY_OF_YEAR)==to.get(Calendar.DAY_OF_YEAR))) {
			if(from.get(Calendar.DATE )==21) {
				++monDiff;
			}
			from.add(Calendar.DATE, 1);
		}
		if(to.get(Calendar.DATE )==21) {
		monDiff++;
		}
		return monDiff;
	}
	static void printResult(Calendar from, Calendar to) {
		Date fromDate = from.getTime();
		Date toDate = to.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print(sdf.format(fromDate)+"~" + sdf.format(toDate) + ";");
		System.out.println(paycheckCount(from, to));
		
		System.out.println(fromDate.equals(toDate));
	}
	public static void main(String[] args) {
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();
		
		fromCal.set(2020,0, 1);
		toCal.set(2020,0, 1);
		printResult(fromCal, toCal);
		
		Date fromDate = fromCal.getTime();
		Date toDate = toCal.getTime();

		System.out.println(fromCal.get(Calendar.MILLISECOND));
		System.out.println(toCal.get(Calendar.MILLISECOND));
		
	}

}
