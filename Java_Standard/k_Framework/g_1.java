package Java_Standard.k_Framework;

import java.util.TreeSet;

public class g_1 {
	public static void main(String [] args) {
			TreeSet set = new TreeSet();
			
			String from = "b";
			String to = "d";
			
			set.add("abc"); set.add("bloom"); set.add("rat");
			set.add("car"); set.add("cheer"); set.add("got");
			set.add("zoo"); set.add("doors"); set.add("tom");
			set.add("hoe"); set.add("chair"); set.add("lee");
			
			System.out.println(set);
			System.out.println("range serach : from " + from + "to" + to);
			System.out.println("result1 : " + set.subSet(from,  to));
			System.out.println("result2 : " + set.subSet(from,  to+"zzz"));
		}
	}

