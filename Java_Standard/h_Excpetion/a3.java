package Java_Standard.h_Excpetion;

public class a3 {
	public static void main(String args[]) {
		try {
			install();
		}catch(InstallException4 e) {
			System.out.println("아아");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("아아이");
			e.printStackTrace();
		}
	}
	
	static void install() throws InstallException4{
		try {
			startInstall4();
			copyFiles4();
		}catch(SpaceException4 e) {
			InstallException4 ie = new InstallException4("설치 중 예외발생");
			ie.initCause(e);
			throw ie;
		}catch(MemoryException4 me) {
			InstallException4 ie = new InstallException4("설치 중 예외발생");
			ie.initCause(me);
			throw ie;
		}finally {
			deleteTempFiles4();
		}
	}
	
	static void startInstall4() throws SpaceException4, MemoryException4 {
		if (!enoughSpace4()) {
			throw new SpaceException4("설치할 공간이 부족합니다");
		}
		
		if(!enoughMemory4()) {
			throw new MemoryException4("메모리가 부족합니다.");
		}
	}
	
	static void copyFiles4() {}
	static void deleteTempFiles4() {}
	
	static boolean enoughSpace4() {
		return false;
	}
	
	static boolean enoughMemory4() {
		return true;
	}
}

class InstallException4 extends Exception{
	InstallException4(String msg){
		super(msg);
	}
}

class SpaceException4 extends Exception{
	SpaceException4(String msg){
		super(msg);
	}
}

class MemoryException4 extends Exception{
	MemoryException4(String msg){
		super(msg);
	}
}