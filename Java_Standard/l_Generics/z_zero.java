package Java_Standard.l_Generics;

import java.util.ArrayList;

public class z_zero {

	public static void main(String[] args) {
		ArrayList<? extends good> A = new ArrayList<baby>();
		
	}

}

class good{
	
}

class baby extends good{
	String name;
	baby (String name){ this.name = name;}
	
	public String toString(){
		return name;
	}
}
