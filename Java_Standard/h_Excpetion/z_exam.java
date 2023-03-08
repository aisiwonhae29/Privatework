package Java_Standard.h_Excpetion;

import java.util.Scanner;

public class z_exam {

	public static void main(String[] args) {
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count =0;
		
		do {
			count++;
			System.out.print("1 to 100 input number : ");
			try {
				input = new Scanner(System.in).nextInt();
			}catch(Exception e) {
				System.out.println("Invalid result try Again");
				continue;
			}
			
			if(answer > input) {
				System.out.println("more bigger");
			}else if(answer < input) {
				System.out.println("more smaller");
			}else {
				System.out.println("Correct!");
				System.out.println("Try count : " + count);
				break;
			}
		}while(true);
	}
}
