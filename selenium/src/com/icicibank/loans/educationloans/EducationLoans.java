package com.icicibank.loans.educationloans;

public class EducationLoans implements FirstInterface{
	int a= 3, b=4, result;
	public void add() {
		result = a+b;
		System.out.println("Addition value is:"+result);
	}
	public static void main(String[] args) {
		System.out.println("Selenium");
		
		EducationLoans obj = new EducationLoans();
		obj.add();
		obj.sub();
		EducationLoans obj1 = new EducationLoans();
		obj1.add();
	}
	@Override
	public void sub() {
		
		System.out.println("Hi I am implementing a sub method.");
		
	}

}
