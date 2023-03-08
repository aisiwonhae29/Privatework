package Java_Standard.l_Generics;

import java.util.ArrayList;

class Product{}
class Tv extends Product{}
class Audio extends Product{}

public class a_generics {

	public static void main(String[] args) {
		ArrayList<Product> ProductList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		
		ProductList.add(new Tv());
		ProductList.add(new Audio());
		
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		printAll(ProductList);
		
	}
	public static void printAll(ArrayList<Product> list) {
		for (Product p : list)
			System.out.println(p.toString());
	}

}
