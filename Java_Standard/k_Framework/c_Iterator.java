package Java_Standard.k_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class c_Iterator {
	public static void main(String [] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		System.out.println(it.next());
		System.out.println(list.get(0));
		System.out.println(it.next());
		System.out.println(list.get(0));
		System.out.println(it.next());
	}
}
