package Main;

import Interface.Animal;
import Interface.animals.Cat;
import Interface.animals.Dog;
import c_abs.Person;
import c_abs.first.Staff;
import c_abs.first.Student;
import c_abs.first.second.Cleaner;
import c_abs.first.second.Teacher;

public class Example {

	public static void main(String[] args) {
//		Animal animals[] = new Animal[5];
//		
//		for (int i = 0; i<5; i++){
//			if (i%2 == 0){
//				animals[i] = new Dog();
//			}else{
//				animals[i] = new Cat();
//			}
//		}
//		
//		for (int i = 0; i<animals.length; i++){
//			System.out.println((i+1));
//			System.out.println("Voice: " + animals[i].voice());
//			System.out.println("Feed: " + animals[i].feed());
//			}
	
		Person personal[] = new Person[3]; 
			personal[0] = new Student("Vasya");
			personal[1] = new Cleaner("Petya");
			personal[2] = new Teacher("Ihor");
			
		for (int i = 0; i<3; i++){
			personal[i].print();
			if (personal[i] instanceof Staff){
				System.out.println("Staff, Salary: " + ((Staff)personal[i]).salary());
			}
			System.out.println();
		}
	}
}
	
