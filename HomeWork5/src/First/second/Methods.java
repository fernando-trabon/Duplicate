package First.second;

import java.io.BufferedReader;
import java.io.IOException;

import Main.car.Car;

public class Methods {

	public int daymonths(BufferedReader sc) throws IOException {
		int month_days[ ]  = {31, 28, 31, 30, 31, 30, 
				31, 31, 30, 31, 30, 31} ;
		System.out.println("Enter number of month:");
		int num = Integer.parseInt(sc.readLine());
		return month_days[--num];
	}
	
	public int sumpos(BufferedReader sc) throws IOException {
		int num[];
		num = new int[10];
		
		for (int i = 0; i<10; i++) {
			System.out.println("Enter " + (i+1) + " number");
			num[i] = Integer.parseInt(sc.readLine());
		}
		
		if (firstpos(num)) {
			return sum(num);
		}else {
			return prod(num);
		}
	}
	
	private boolean firstpos(int[] numbers) {
		
		boolean ans = true;
		
		for (int i = 0; i<5; i++) {
			if (numbers[i]<0) ans = false;
		}
		
		return ans;
	}
	
	private int sum(int[] num) {
		int sum = 0;
		for (int i = 0; i<(num.length/2); i++) {
			sum += num[i];
		}
		return sum;
	}
	
	private int prod(int[] num) {
		int prod = 1;
		for (int i = 4; i<num.length; i++) {
			prod = prod*num[i];
		}
		return prod;
	}
	
	public void finder(BufferedReader sc) throws IOException{
		int[] numbers = new int[5];
		
		for (int i =0; i<numbers.length; i++) {
			System.out.println("Enter number");
			numbers[i] = Integer.parseInt(sc.readLine());
			}
		
		System.out.println("Position of second positive number: " + findpos(numbers));
		
		minpos(numbers);		
	}
	
	private int findpos(int[] numbers) {
		int lich = 0;
		
		int returner = -1;
		for (int i = 0; i<numbers.length; i++) {
			if (numbers[i]>0 && ++lich == 2) {returner = i;}
			}
		
		if (returner == -1) {
			System.out.println("No two positive numbers");
			System.exit(0);
		}
		return ++returner;
		
	}
	
	private void minpos(int[] numbers) {
		int min = numbers[0];
		int lich = 0;
		
		for (int i =0; i<numbers.length; i++) {
			if (numbers[i]<min) {
				min = numbers[i];
				lich = i+1;
			}
		}
		
		System.out.println("Min=" + min);
		System.out.println("His position: " + lich);
	}

	public int enteringint(BufferedReader sc) throws IOException {	
		int pr = 1;
		int r;
		do {
			System.out.println("Enter number");
			r = Integer.parseInt(sc.readLine());
			if (r>0) {
				pr = pr*r;
			}else {
				System.out.println("You enter negative");
			}
		}while (r>0);
		return pr;
	}

	public void cars(BufferedReader sc) throws IOException{
		Car cars[] = new Car[4];
		
		for (int i = 0; i<4; i++) {
			cars[i] = new Car(Integer.toString(i), i, i);
		}
		
		cars[3].setYearofproduction(1);

		System.out.println("Enter year of interest");
		yearofint(cars, Integer.parseInt(sc.readLine()));
		
		System.out.println();
		System.out.println("Display cars ordered by years");
		carorderer(cars);
		carout(cars);
	}
	
	private void yearofint(Car[] cars, int year) {
		System.out.println("--------------------------------");
		for (int i =0; i<cars.length; i++) {
			if (cars[i].getYearofproduction() == year) {
				carout(cars, i);
			}
		}
	}

	private void carorderer(Car[] cars) {
		Car o = new Car();
		for (int i = 0; i<cars.length-1; i++) {
			for (int j = i+1; j<cars.length; j++) {
				if(cars[i].getYearofproduction()>cars[j].getYearofproduction()) {
					o = cars[i];
					cars[i] = cars[j];
					cars[j] = o;
				}
			}
		}
	}

	private void carout(Car[] cars) {
		System.out.println("--------------------------------");
		for (int i = 0; i<cars.length; i++) {
			carout(cars, i);
		}
	}
	
	private void carout(Car[] cars, int i) {
			System.out.println("Type: " + cars[i].getType());
			System.out.println("Year of production: " + cars[i].getYearofproduction());
			System.out.println("Engine capacity: " + cars[i].getEngcap());
			System.out.println("--------------------------------");
		}	
}
