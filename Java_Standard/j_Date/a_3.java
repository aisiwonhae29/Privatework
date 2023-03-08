package Java_Standard.j_Date;

import java.util.Calendar;

public class a_3 {

	public static void main(String[] args) {
		
		if(args.length !=2) {
			System.out.println("Usage : java a_3 2019 9");
			return;
		}
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK =0;
		int END_DAY=0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();

		sDay.set(year, month-1, 1);
		eDay.set(year, month,1);
		
		eDay.add(Calendar.DATE, -1);
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("    " + args[0]+"년 " + args[1]+"월");
		
		
	}

}
