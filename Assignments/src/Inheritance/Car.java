package Inheritance;

//Multilevel
public class Car {
	public Car() {
		System.out.println("Class car");
	}

	public void vehicleType() {
		System.out.println("Vehicle Type: Car");
	}

}

class Punch extends Car {
	public Punch() {
		System.out.println("Class Car");
	}

	public void brand() {
		System.out.println("Brand: Punch");
	}

	public void speed() {
		System.out.println("Max: 160 KPH");

	}
}

class Tiago extends Punch {
	public Tiago() {
		System.out.println("Punch model: Punch Max");
	}

	public void speed() {
		System.out.println("Max: 210KPH");
	}

	public static void main(String args[]) {
		Tiago tg = new Tiago();
		tg.vehicleType();
		tg.brand();
		tg.speed();
	}
}
