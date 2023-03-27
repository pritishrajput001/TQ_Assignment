package overriding;

public class BigKid extends Kid {
	public void readbook() {

	}

	public void readbook(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Big kid details");
	}

	public static void main(String args[]) {
		BigKid b;
		b = new BigKid();
		b.readbook(12, "Prathamesh");
	}

}
