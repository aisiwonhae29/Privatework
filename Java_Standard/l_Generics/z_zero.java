package Java_Standard.l_Generics;

import java.util.ArrayList;

public class z_zero {

	public static void main(String[] args) {
		
	}
	static <T extends Car> void start(){
		System.out.println("ready to run");
	}
}


class elcetric_Car extends Car{}

class  Car<T>{
	ArrayList<T> car = new ArrayList<T>();
	T getC(int i) {return car.get(i);}
	
}

class AA<T>{
	
}