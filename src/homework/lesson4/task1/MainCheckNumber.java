package homework.lesson4.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import homework.lesson4.task1.Dog.Breed;

public class MainCheckNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Check range [-5, 5];

		System.out.println("Please, input three float numbers");
		float firstNumber = Float.parseFloat(reader.readLine());
		float secondNumber = Float.parseFloat(reader.readLine());
		float thirdNumber = Float.parseFloat(reader.readLine());
		System.out.println(Check.checkRange(firstNumber, secondNumber, thirdNumber) == "True"
				? "Yes, the numbers belong in the range [-5 , 5]. "
				: "No, the numbers no belong in the range [-5 , 5]");

		// Min and max value

		System.out.println("Please, input three integer numbers");
		int firstNumber1 = Integer.parseInt(reader.readLine());
		int secondNumber1 = Integer.parseInt(reader.readLine());
		int thirdNumber1 = Integer.parseInt(reader.readLine());
		int arrayPrint[] = Check.minMaxNumbers(firstNumber1, secondNumber1, thirdNumber1);
		System.out.println("Min value is " + arrayPrint[0]);
		System.out.println("Max value is " + arrayPrint[1]);

		// output HTTPError name

		System.out.println("Input the number of HTTP Error: ");
		String numberHTTPError = reader.readLine();
		System.out.println("Error name - " + Check.nameOfHttpError(numberHTTPError));

		// Dogs

		Dog dog1 = new Dog("Carl", Breed.DOBERMAN, 2);
		Dog dog2 = new Dog("Unga", Breed.ROTTWEILER, 7);
		Dog dog3 = new Dog("George", Breed.LABRADOR, 14);

		System.out.println(Dog.compareThreeDogs(dog1, dog2, dog3) == true ? "Min 2 dogs have some name."
				: "We don't have dogs with the same name.");
		Dog.theOldestDog(dog1, dog2, dog3);
	}

}
