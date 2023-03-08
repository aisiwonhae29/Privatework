package Java_Standard.m_Tread;

import javax.swing.JOptionPane;

public class c_1 {

	public static void main(String[] args) {
		Threadc_1 th1 = new Threadc_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세유");
		System.out.println("입력한값은"+input+"여유");
	}
}

class Threadc_1 extends Thread{
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			}catch(Exception e) {}
		}
	}
}