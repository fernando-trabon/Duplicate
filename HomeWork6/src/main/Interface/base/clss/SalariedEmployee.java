package main.Interface.base.clss;

import main.Interface.base.Employee;

public class SalariedEmployee extends Employee {

	private String socialSecurityNumber;
	private double fixedmonthlypayment;
	
	public double getFixedmonthlypayment() {
		return fixedmonthlypayment;
	}

	public void setFixedmonthlypayment(double fixedmonthlypayment) {
		this.fixedmonthlypayment = fixedmonthlypayment;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public SalariedEmployee(String name, String socialSecurityNumber, double sal) {
		super.setEmployeed("Yes");
		this.setName(name);
		this.setPayment(Payment.fixed);
		this.setFixedmonthlypayment(sal);
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public double calculatePay() {
		return fixedmonthlypayment;
	}

	@Override
	public void print() {
		System.out.println("Name: "+this.getName());
		System.out.println("Social Security Number: "+this.getSocialSecurityNumber());
		System.out.println("Payment: "+this.calculatePay());
		
		
	}


}
