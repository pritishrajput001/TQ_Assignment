package overriding;

public class Bike {
	String color;
	int speed;

	public void bikeInfo(String color, int speed) {
		this.color = color;
		this.speed = speed;
		System.out.println("Bike details are: coloe is" + color + "speed is " + speed);
	}

}
