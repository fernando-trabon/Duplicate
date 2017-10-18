package main.Interface.base;

import main.Interface.CalculatePay;

public  abstract class Employee implements CalculatePay{

	private String employeed;
	private Payment payment;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public String getEmployeed() {
		return employeed;
	}

	public void setEmployeed(String employeed) {
		this.employeed = employeed;
	}
		
	public enum Payment{
		hourly, fixed
	}
		
}
