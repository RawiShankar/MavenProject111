package com.assignment.first;

public class EmployeImp {
	public static void main(String[] args) {
		Employee e1 = new Employee("hello");
		Employee e2 = e1;
		e1.setName("reddy");
		System.out.println(e2.getName());
	}
}
