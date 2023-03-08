package Java_Standard.m_Tread;

public class f_sleep {
	public static void main(String[] args) {
		Threadf_1 th1 = new Threadf_1();
		Threadf_2 th2 = new Threadf_2();
		th1.start(); th2.start();
		
		try{
			th1.sleep(2000);
		}catch(InterruptedException e) {}
	System.out.println("<<main 종료>>");
	}
}

class Threadf_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) System.out.print("-");
		System.out.print("<<th1 종료>>");
	}
}
class Threadf_2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) System.out.print("|");
		System.out.print("<<th2 종료>>");
	}
}