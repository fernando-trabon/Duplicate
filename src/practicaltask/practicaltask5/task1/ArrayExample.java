package practicaltask.practicaltask5.task1;

public class ArrayExample {

	public static void main(String[] args) {

		int[] intArray = { 5, -9, 18, 2, -23, 8, -38, -12, -9, -4 };
		int max = intArray[0];
		int sum = 0;
		int amountN = 0, amountP = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > max) {
				max = intArray[i];
			}
			if (intArray[i] > 0) {
				sum += intArray[i];
				amountP++;
			} else {
				amountN++;
			}

		}
		System.out.println("The biggest number - " + max);
		System.out.println("The sum of positive numbers - " + sum);
		System.out.println("The amount negative numbers - " + amountN);
		if (amountP == amountN) {
			System.out.println("The positive numbers = the negative numbers");
		} else if (amountP > amountN) {
			System.out.println("More positive numbers");
		} else {
			System.out.println("More negative numbers");
		}

	}

}
