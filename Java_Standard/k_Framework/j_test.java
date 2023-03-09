package Java_Standard.k_Framework;

import java.util.*;

public class j_test {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);

		HashSet set = new HashSet(list);
		TreeSet tset = new TreeSet(set);
		Stack stack = new Stack();
		stack.addAll(tset);

		while (!stack.empty())
			System.out.println(stack.pop());
//	 	스택은 선이선입선출
		
//		set은 중복 불허용 , TreeSet은 자동 정렬
//		set > [3,6,2,7]		// tset > [2,3,6,7]
//		7, 6, 3, 2 순으로 나오지 않을까 예상
	}

}
