package Java_Standard.i_LangC;

public class a {
	public static void main(String []args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다");
		else
			System.out.println("다름");
	}
	
}


class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
}