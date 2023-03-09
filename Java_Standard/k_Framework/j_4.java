package Java_Standard.k_Framework;

import java.util.*;

public class j_4 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add("가");
		a.add("마");
		a.add("나");
		a.add("라");
		a.add("바");
		a.add("사");
		a.add("다");
		
		
		
		for (int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println();
		
		Integer[] arr = new Integer[10];
		Arrays.setAll(arr, (i)->(int)(Math.random()*45));
		
		
		Collections.sort(a, new AA()) ;
	
		
		System.out.println();
		
		for (int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
	}

}
class AA implements Comparator{
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable ) {
			Comparable c1= (Comparable) o1;
			Comparable c2= (Comparable) o2;
			return c1.compareTo(c2);
		}
		return -1 ;
	}
}
