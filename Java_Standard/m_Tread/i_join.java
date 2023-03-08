package Java_Standard.m_Tread;

public class i_join {
	static long startTime = 0;
	public static void main(String[] args) {
		Threadi_1 th1 = new Threadi_1();
		Threadi_2 th2 = new Threadi_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		try {
			th1.join();
			th2.join();
		}catch(InterruptedException e) {}
		
		System.out.print("소요시간 : " + (System.currentTimeMillis()-i_join.startTime));
	}
}

class Threadi_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) 
			System.out.print(new String("-"));
	}
}
class Threadi_2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) 
			System.out.print(new String("|"));
	}
}