package Java_Standard.j_Date;

import java.util.Calendar;

public class a_Cal {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar today1 = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MILLISECOND));
		
		final String[] A= {"","일","월","화","수","목","금","토","일"};
		today.set(2019, 3, 29);
	}

}
