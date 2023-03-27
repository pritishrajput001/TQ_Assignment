package overriding;

public class Vehicle {
	long mph;
	String ans;

	public void accelerate(long mph) {
		System.out.println("Acceleration is " + mph + " kmph");
	}

	public void run(String ans) {
		System.out.println("Vehicle is running" + ans);
	}

	public void stop(String ans) {
		System.out.println("Vehicle has stopped" + ans);
	}

}
