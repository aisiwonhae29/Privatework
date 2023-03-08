package Java_Standard.j_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class b_1 {

	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yy년 MM일 dd일");
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2019년 11월 23일");
			System.out.println(df2.format(d));
		}catch(Exception e) {
			System.out.println(22);
		}
	}

}
