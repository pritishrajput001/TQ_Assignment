package overriding;

public class Kid {
	int id;
	String name;

	void readBook() {

	}

	void readBook(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Kid details");

	}

}
