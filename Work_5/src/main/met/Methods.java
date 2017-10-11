package main.met;

import java.io.BufferedReader;
import java.io.IOException;

import main.emp.Employee;

public class Methods {
	
	public int biggest(int[] numbers){
		int max = numbers[0];
		for(int i = 0; i<numbers.length; i++){
			if (numbers[i]>max){
				max = numbers[i];
			}
		}
		return max;
	}	

	public int sumpos(int[] numbers){
		int sum = 0;
		for (int i = 0; i<numbers.length; i++){
			if (numbers[i]>0){
				sum += numbers[i];
			}
		}
		return sum;
	}

	public int amountneg(int[] numbers){
		int lich = 0;
		for (int i = 0; i<numbers.length; i++){
			if (numbers[i]<0) lich++;
		}
		return lich;
	}
		
	public String whatvalmore(int[] numbers){
		return (amountneg(numbers)>5)? "Negative":"Positive";
	}

	public void empofdep(BufferedReader sc) throws NumberFormatException, IOException{
		System.out.println("------------------------------");
		Employee work[] = new Employee[5];
		
		for (Integer i = 0; i<5; i++){
			work[i] = new Employee(i.toString(),i+1,i+1);
		}
		
		work[3].setDepnum(2);
		 
		System.out.println("What department number");
		int num = Integer.parseInt(sc.readLine());
		
		for (int i = 0; i<5; i++){
			if(work[i].getDepnum() == num) empwrite(work[i]);
			System.out.println();			
		}
		System.out.println();
		System.out.println("Arranging all by salary");
		System.out.println();
		arrangesalary(work);
	}
	
	public void empwrite(Employee e){
		System.out.println("Name: " + e.getName());
		System.out.println("Department: " + e.getDepnum());
		System.out.println("Salary: " + e.getSalary());
		System.out.println();
	}
	
	public void arrangesalary(Employee[] work){
		for (int i = 0; i<work.length-1; i++){
			for (int j = i+1; j<work.length; j++){
				if (work[i].getSalary()<work[j].getSalary()){
					change(work, i, j);
				}
			}
		}
		wridearr(work);
	}
	
	public void change(Employee[] work, int i, int j){
		Employee e = new Employee();
		e = work[i];
		work[i] = work[j];
		work[j] = e;
	}
	
	public void wridearr(Employee[] work){
		for (int i=0; i<work.length; i++){
			empwrite(work[i]);
		}
	}
}
