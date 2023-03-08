package Java_Standard.i_LangC;

public class d {	
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
	}
}

class Card{
	String kind;
	int number;
	
	Card(){
		this("Spade", 1);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return kind + " 이거시여";
	}
}