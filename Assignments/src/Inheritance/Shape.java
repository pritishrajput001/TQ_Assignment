package Inheritance;

//Single
public class Shape {
	public int calculateArea(int length, int breadth) {
		return (length * breadth);
	}

}

class Rectangle extends Shape {
	public static void main(String args[]) {
		Rectangle rr = new Rectangle();
		System.out.println("Area of rectangle is " + rr.calculateArea(7, 8));
	}
}
