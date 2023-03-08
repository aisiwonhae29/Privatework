package Java_Standard.i_LangC;

public class exam {
	public static int count(String src, String target) {
		int count = 0;
		int pos = 0;
		while(!(src.indexOf(target,pos)==-1)) {
			count++;
			pos=src.indexOf(target,pos)+1;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(count("1211341115","A"));
		System.out.println("1");
	}
}
