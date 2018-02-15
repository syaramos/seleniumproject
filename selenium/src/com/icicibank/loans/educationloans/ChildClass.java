package com.icicibank.loans.educationloans;

public class ChildClass extends AbstractClass{
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.n1();
		obj.n2();
	}

	@Override
	public void n2() {
		System.out.println("override method");
		
	}
}
