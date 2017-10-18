package main;

import main.bird.Bird;
import main.bird.birds.Eagle;
import main.bird.birds.Kiwi;
import main.bird.birds.Penguin;
import main.bird.birds.Swallow;
import main.Interface.base.Employee;
import main.Interface.base.clss.ContractEmployee;
import main.Interface.base.clss.SalariedEmployee;

public class App {

	public static void main(String[] args) {
		
		Bird birds[] = new Bird[4];
		
		birds[0] = new Eagle();
		birds[1] = new Swallow();
		birds[2] = new Penguin();
		birds[3] = new Kiwi();
		
		for (int i = 0; i<birds.length; i++) {
			System.out.println("----------------------------");
			System.out.println(birds[i].getClass().toString());
			System.out.println("Feathers: " + birds[i].getFeathers());
			System.out.println("Lay eggs: " + birds[i].getLayEggs());
			System.out.println("Can fly? " + birds[i].fly());
		}
		
		System.out.println("---------------------------");
		System.out.println();
		System.out.println("---------------------------");
				
		Employee workers[] = new Employee[4];
		
		workers[0] = new SalariedEmployee("1","111", 10000);
		workers[1] = new SalariedEmployee("2","222", 20000);
		workers[2] = new ContractEmployee("3","333", 50);
		workers[3] = new ContractEmployee("4","444", 100);
		
		Employee tmp;
		
		for (int i = 0; i<workers.length-1; i++) {
			for (int j = i+1; j<workers.length; j++) {
				if (workers[i].calculatePay() >= workers[j].calculatePay()) {
					tmp = workers[i];
					workers[i] = workers[j];
					workers[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i<workers.length; i++) {
			System.out.println("----------------");
			workers[i].print();
		}
	}

}
