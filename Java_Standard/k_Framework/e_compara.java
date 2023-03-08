package Java_Standard.k_Framework;

import java.util.Arrays;
import java.util.Comparator;

public class e_compara {
	public static void main(String [] args) {
		String [] strArr = {"cat","Dog","lion","tiger"};
		
		System.out.println("strArr="+Arrays.toString(strArr));
		
		Arrays.sort(strArr);
		System.out.println("strArr="+Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr="+Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending());
		System.out.println("strArr="+Arrays.toString(strArr));
		
		System.out.println((int)(Math.random()*10));
	}

}

class Descending implements Comparator{
	public int compare(Object o1, Object o2){
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2)*-1;
		}
		return -1;
	}
}
	