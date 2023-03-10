package Java_Standard.k_Framework;

import java.util.*;

public class j_3 {

	public static void main(String[] args) {
		Set set = new HashSet();
		int[][] board = new int [5][5];
		String ac ;
		
		for (int i=0; set.size()<25; i++) {
			ac= ((int) (Math.random()*30)+1+"");
			System.out.println(ac);
			set.add(ac);
		}
		
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.println((board[i][j] < 10 ? " " : " ") + board[i][j]);
			}
			System.out.println();
		}
	}

}


