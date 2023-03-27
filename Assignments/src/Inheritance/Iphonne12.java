package Inheritance;

public class Iphonne12 {
	void makeCalls() {
		System.out.println("Calling functionality.......");
	}

}

class Iphone13 extends Iphonne12 {
	void unlockByFaceId() {
		System.out.println("Unlocking phone by faceid ");
	}
}

class Iphone14 extends Iphone13 {
	void supportFor5G() {
		System.out.println("5G Supported");
	}

	public static void main(String args[]) {
		Iphone14 ip = new Iphone14();
		ip.makeCalls();
		ip.unlockByFaceId();
		ip.supportFor5G();
	}
}
