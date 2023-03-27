package overriding;

public class Company {
	String address;

	public void address(String address) {
		this.address = address;
		System.out.println("Address is " + address);

	}

}
