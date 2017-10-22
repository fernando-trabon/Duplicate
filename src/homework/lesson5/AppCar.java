package homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AppCar {
	
	// Sort array by yearOfProduction

		public static void arrayByYear(Car[] arrCar) {
			Car tmp;
			for (int i = 0; i < arrCar.length - 1; i++) {
				for (int j = i + 1; j < arrCar.length; j++) {
					if (arrCar[i].getYearOfProduction() > arrCar[j].getYearOfProduction()) {
						tmp = arrCar[i];
						arrCar[i] = arrCar[j];
						arrCar[j] = tmp;
					}
				}
			}

		}
		// Display cars with same model year

		public static void ModelYear(BufferedReader reader, Car[] array)
				throws NumberFormatException, IOException {
			System.out.println("Input model year: ");
			int num = Integer.parseInt(reader.readLine());
			int fg = 0;
			for (Car element : array) {
				if (element.getYearOfProduction() == num) {
					System.out.println(element.toString());
				} else {
					fg += 1;
				}
			}
			System.out.println(
					(fg == array.length) ? "We don't have the cars made in model year " + num : "End list");
		}
		
		// Display all cars

		public static void displayArr(Car[] arrCar) {
			for (Car element : arrCar) {
				System.out.println(element.printElement());
			}
		}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Car[] array = {new Car(Type.COUPE, 2011, 1.5),
				new Car(Type.LEAFTBACK, 2011, 2.3),
				new Car(Type.SEDAN, 2009 , 1.6),
				new Car(Type.UNIVERSAL, 2016, 4.4)				};
		
		ModelYear(reader, array);
		arrayByYear(array);
		displayArr(array);
	}

}
