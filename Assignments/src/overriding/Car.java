package overriding;

public class Car extends Vehicle {

	public void accelerate(long mph) {
		System.out.println("Acceleration is " + mph + " kmph");
	}

	public void run(String ans) {
		System.out.println("Vehicle is running" + ans);
	}

	public void stop(String ans) {
		System.out.println("Vehicle has stopped" + ans);
	}

	public static void main(String args[]) {
		Car c;
		c = new Car();
		c.accelerate(67);
		c.run("Fast");
	}

}
