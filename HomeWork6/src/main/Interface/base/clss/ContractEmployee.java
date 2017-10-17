package main.Interface.base.clss;

import main.Interface.base.Employee;

public class ContractEmployee extends Employee {

	private String federalTaxIdmember;
	private double hourlyrate;
	
	public double getHourlyrate() {
		return hourlyrate;
	}

	public void setHourlyrate(double hourlyrate) {
		this.hourlyrate = hourlyrate;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	
	public ContractEmployee(String name, String federalTaxIdmember, double sal) {
		super.setEmployeed("Yes");
		this.setName(name);
		this.setPayment(Payment.hourly);
		this.setHourlyrate(sal);
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public double calculatePay() {
		return hourlyrate*21*8;
	}

	@Override
	public void print() {
		System.out.println("Name: "+this.getName());
		System.out.println("Federal Tax Id member: "+this.getFederalTaxIdmember());
		System.out.println("Payment: "+this.calculatePay());
		
	}

}
