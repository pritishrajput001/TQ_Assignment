package Inheritance;

//Single
public class Salary {
	float nsal, bonus, bsal = 12856.5f;

}

class NetSalary extends Salary {
	void cal() {
		bonus = bsal * 1.1f;
		nsal = bsal + bonus;

	}

	void display() {
		System.out.println("Net salary= " + nsal);
	}

	public static void main(String args[]) {
		NetSalary n = new NetSalary();
		n.cal();
		n.display();
	}
}
