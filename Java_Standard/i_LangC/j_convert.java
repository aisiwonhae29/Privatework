package Java_Standard.i_LangC;

public class j_convert {
	public static void main(String args[]) {

		int i = new Integer("100").intValue();
		int i2 = Integer.parseInt("100");
		int i3 = Integer.valueOf("100");
		
		String s = "1100";
		int a = Integer.parseInt(s , 2 );
		System.out.println(a);
	}

}

class j_1{
}