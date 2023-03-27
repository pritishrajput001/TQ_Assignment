package overriding;

public class Employee extends Programmer {

	public void workingHours(int workHours) {
		this.workHours = workHours;
		System.out.println("Working hours are " + workHours);
	}

	public static void main(String args[]) {
		Employee e1 = null;
		e1.workingHours(9);

		Programmer p1 = new Programmer();
		p1.workingHours(8);
	}
}