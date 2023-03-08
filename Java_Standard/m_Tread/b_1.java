package Java_Standard.m_Tread;

public class b_1 {
	static long startTime =0;
	public static void main(String[] args) {
		Threadb_1 th1 = new Threadb_1();
		th1.start();
		startTime=System.currentTimeMillis();
		
		for(int i=0; i<300; i++)
			System.out.printf("%s", new String("-"));
		System.out.print("소요시간1:"+(System.currentTimeMillis()-b_1.startTime));
	}

}

class Threadb_1 extends Thread{
	public void run() {
		for(int i=0;i<300;i++)
			System.out.printf("%s", new String("|"));
		
		System.out.print("소요시간2:"+(System.currentTimeMillis()-b_1.startTime));
	}
}
