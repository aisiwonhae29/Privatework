package Java_Standard.k_Framework;

import java.util.HashMap;
import java.util.Scanner;

public class h_HashM {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1234");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id & pw 입력");
			System.out.print("id : ");
			String id = s.nextLine().trim();
			
			System.out.print("pasword : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id 잘못됨");
				continue;
			}
			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호 달러 임마");
			}else {
				System.out.println("id 비번 일치");
				break;
			}
		}
		
	}

}
