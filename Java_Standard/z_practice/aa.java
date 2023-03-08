package Java_Standard.z_practice;
enum A{
	a,b,c,d;
	
	private static final A[] bb = A.values();
}

public class aa {
	public static void main(String[] args) {
		A c = A.a;
		System.out.println(c.ordinal());
	}
}

