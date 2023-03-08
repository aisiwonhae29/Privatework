package Java_Standard.k_Framework;

import java.util.HashSet;
import java.util.Objects;

public class f_2 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("add");
		set.add("add");
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		
		System.out.println(set);
		Person A = new Person("Tom",20);
		Person B = new Person("Tom",20);
		System.out.println(A.hashCode());
		System.out.println(B.hashCode());
	}

}

class Person{
	String name;
	int age;
	
	Person(){};
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +":"+age;
	}
	
	public boolean equals(Object obj) {
		Person p =(Person)obj;
		return (name ==p.name && p.age ==age);
	}
	public int hashCode() {
		return Objects.hash(name, age);
	}
}