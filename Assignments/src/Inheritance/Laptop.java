package Inheritance;

/*Create Class Laptop which has variables noOfUSBPort, processorSpeed of
type int. Create getter, setter methods for the variables. In main method,
1> create Laptop object 2> set values of variables noOfUSBPort,
processorSpeed using setter methods. 3> print variables noOfUSBPort,
processorSpeed using getter methods.*/

public class Laptop {
	int noOfUsbPort;
	float procSpeed;

	public int getNoOfUsbPort() {
		return noOfUsbPort;
	}

	public void setNoOfUsbPort(int noOfUsbPort) {
		this.noOfUsbPort = noOfUsbPort;
	}

	public float getProcSpeed() {
		return procSpeed;
	}

	public void setProcSpeed(float procSpeed) {
		this.procSpeed = procSpeed;
	}

	public static void main(String args[]) {
		Laptop l1 = new Laptop();
		l1.setNoOfUsbPort(4);
		l1.setProcSpeed(3.1f);
		System.out.println("No of USB ports are " + l1.getNoOfUsbPort());
		System.out.println("Processor speed in MhZ is " + l1.getProcSpeed());

	}

}
