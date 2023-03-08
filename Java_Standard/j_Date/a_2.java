package Java_Standard.j_Date;

import java.util.Calendar;

public class a_2 {

	public static void main(String[] args) {
		Calendar time1 = Calendar.getInstance();
		time1.set(2019, 7, 11);
		
		System.out.println(toString(time1));
		System.out.println("= 1일 후 =");
		time1.add(Calendar.DATE, 1);
		System.out.println(toString(time1));
	
		System.out.println("= 6달 전 =");
		time1.add(Calendar.MONTH, 6);
		System.out.println(toString(time1));
		
		System.out.println("= 31일 후 =");
		time1.roll(Calendar.DATE, 31);
		System.out.println(toString(time1));
	
	
	}
	public static String toString(Calendar time) {
		return time.get(Calendar.YEAR)+"년 "+(time.get(Calendar.MONTH)+1)+"월 "+time.get(Calendar.DATE)+"일";
	}

}
