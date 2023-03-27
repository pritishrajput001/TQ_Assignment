package overriding;

public class Pulsar extends Bike {

	public void bikeInfo(String color, int speed) {
		this.color = color;
		this.speed = speed;
		System.out.println("Bike details are: coloe is" + color + "speed is " + speed);
	}

	public static void main(String args[]) {
		Pulsar p;
		p = new Pulsar();
		p.bikeInfo("Red", 180);

	}

}
