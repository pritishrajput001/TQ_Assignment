package overriding;

public class Shape {

	public void draw() {
		System.out.println("Shape is drawing...");

	}

}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle is drawn");

	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("Rectangle is drawn");
	}
}

class Square extends Shape {
	public void draw() {
		System.out.println("Square is drawn");
	}

	public static void main(String args[]) {
		Circle c1 = new Circle();
		c1.draw();

		Rectangle r1 = new Rectangle();
		r1.draw();

		Square s1 = new Square();
		s1.draw();
	}
}
