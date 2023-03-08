package Java_Standard.k_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class a_collectionF {

	public static void main(String[] args) {
		ArrayList A = new ArrayList(10);
		A.add(new Integer(5));
		A.add(new Integer(4));
		print(A,A);
		
		Collections.sort(A);
		System.out.println(A);
		A.set(0, "AA");
		System.out.println(A);
	}
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println(list1);
		System.out.println(list2);
		System.out.println();
	}

}
