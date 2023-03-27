package overriding;

public class Person {
	String readScript;

	public void readScript(String readScript) {
		System.out.println("Read the script" + readScript);
	}

}

class Actor extends Person {
	public void readScript(String readScript) {
		System.out.println("Read the script" + readScript);
	}

	public static void main(String args[]) {
		Actor a1 = new Actor();
		a1.readScript("Reading");

		Person p1 = new Person();
		p1.readScript("Cant read");
	}
}
