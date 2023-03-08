package Java_Standard.i_LangC;

public class b{
	public static void main(String[] args) {
		Person p1=new Person(11L);
		Person p2=new Person(11L);
		
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람입니다");
		else
			System.out.println("다른사람임");
	}
}

class Person{
	long id;
	
	public boolean equals (Object obj) {
		if(obj instanceof Person)
			return id ==((Person)obj).id;
		else
			return false;
	}
	
	Person(long id){
		this.id = id;
	}

}
