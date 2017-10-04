package main.work;

public class Employee {
	private String Name;
	private int Rate;
	private int Hours;
	private static double totalSum = 0;
	
	public static double gettotalSum(){
		return totalSum;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public void setName(String name) {
		this.Name = name;
	}
	
	public int getRate() {
		return this.Rate;
	}
	
	public void setRate(int rate) {
		this.Rate = rate;
	}
	
	public int getHours() {
		return this.Hours;
	}
	
	public void setHours(int hours) {
		this.Hours = hours;
	}

	public Employee(String name, int rate, int hours) {
		this.Name = name;
		this.Rate = rate;
		this.Hours = hours;
		//totalSum = totalSum+rate;
	}

	public Employee(String name, int rate) {
		this.Name = name;
		this.Rate = rate;
		//totalSum = totalSum+rate;
	}
	
	public double salary(){
		totalSum = totalSum + (double)this.getRate()*this.getHours();
		return (double)this.getRate()*this.getHours();
	}
	
	@Override
	public String toString(){
		return "Employee:"+this.getName()+",rate:"+this.getRate()+", hours"+this.getHours();
	}
	
	public void changeRate(int rate){
		totalSum = totalSum - this.getRate();
		this.setRate(rate);
		//totalSum = totalSum+rate;
	}
	
	public double bonuses(){
		return this.salary()*0.1;
	}
	
}
