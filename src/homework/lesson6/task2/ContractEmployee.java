package homework.lesson6.task2;

public class ContractEmployee extends Employee implements Payable {
	private String federalTaxIdmember;
	private double hourlyRate;
	private int hours;
	
	// Getters and setters
	
	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public String getName() {
		return name;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public int getHours() {
		return hours;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
		public ContractEmployee(String employeeID, String name, String federalTaxIdmember, double hourlyRate, int hours) {
		super(employeeID, name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.hourlyRate = hourlyRate;
		this.hours = hours;
	}

	@Override
	public double calculatePay() {
		return this.hours * this.hourlyRate;
		
	}

	@Override
	public String toString() {
		return "EmployeeID = " + employeeID + ", name = " + name + ", The average monthly wage = "
				+ hourlyRate*hours;
	}
	
	
}
