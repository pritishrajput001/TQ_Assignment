package overriding;

public class Ebay extends Company {
	public void address(String address) {
		this.address = address;
		System.out.println("Address of ebay is " + address);
	}

	public static void main(String args[]) {
		Ebay e;
		e = new Ebay();
		e.address("Sambhajinagar");
	}

}
