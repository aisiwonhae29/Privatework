package Java_Standard.j_Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class exam_1 {
	public static void main(String[] args) {
		Calendar C = Calendar.getInstance();
		Date B = new Date();
		SimpleDateFormat bb= new SimpleDateFormat("yyyy/MM/dd");
		
		Scanner A = new Scanner(System.in);
		System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.");
		while (A.hasNextLine()) {
			
			try{
				B = bb.parse(A.nextLine());
				C.setTime(B);
				System.out.println(new SimpleDateFormat("E 요일").format(B));
				break;
			}catch(Exception e) {
				System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.");
			}
		}
	}

}
