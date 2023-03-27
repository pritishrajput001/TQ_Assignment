package Inheritance;

//Single
public class First {
	int num1, num2, sum, mul, div;

	public void accept() {
		num1 = 12;
		num2 = 44;
	}

}

class Addition extends First {
	public void cal() {
		sum = num1 + num2;
		mul = num1 * num2;
		div = num2 / num1;

	}

	public void show() {
		System.out.println(sum);
		System.out.println(mul);
		System.out.println(div);

	}

	public static void main(String args[]) {
		Addition a = new Addition();
		a.accept();
		a.cal();
		a.show();
	}
}
