package com.containmentassign;

public class EmployeeTest {
	public static void main(String args[]) {
		MyDate m1 = new MyDate(12, "August", 2007);
		MyDate m2 = new MyDate(28, "June", 2005);
		MyDate m3 = new MyDate(2, "February", 2003);

		Department2 d1 = new Department2(222, "Sales");
		Department2 d2 = new Department2(330, "Marketing");
		Department2 d3 = new Department2(445, "HR");

		Employee e1 = new Employee(11, "Suresh Agarwal", 123000, d3, m3);
		Employee e2 = new Employee(22, "Ramanuj Shetty", 77000, d2, m1);
		Employee e3 = new Employee(32, "Sohail Khan", 79000, d1, m2);
		Employee e4 = new Employee(56, "Sagar Taliram", 85000, d2, m2);
		Employee e5 = new Employee(12, "Pawan Gaikwad", 76000, d1);

		System.out.println(e1);
		System.out.println("========================================");
		System.out.println(e2);
		System.out.println("========================================");
		System.out.println(e3);
		System.out.println("========================================");
		System.out.println(e4);
		System.out.println("========================================");
		System.out.println(e5);

	}

}
