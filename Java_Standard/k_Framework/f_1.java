package Java_Standard.k_Framework;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class f_1 {

	public static void main(String[] args) {
		Set set =new HashSet();
		System.out.println(set.size());
		int s=0;
		for(int i=0; s<100 ; i++) {
			s+=i;
			int num=(int)(Math.random()*45)+1;
			System.out.println(s);
		}
		
		System.out.println(set.size());
		
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
	}

}
