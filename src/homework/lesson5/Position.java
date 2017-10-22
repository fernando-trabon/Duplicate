package homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Position {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] array = new int[5];
		System.out.println("Input 5 (int) numbers: ");
		SumFive.inputElements(reader, array);
		int minElement = array[0];
		int indexMinElement = 0;
		int indexSecPosElement = 0;
		int temp = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < minElement) {
				minElement = array[i];
				indexMinElement = i;
			}
			if (array[i] > 0) {
				temp++;
				if (temp == 2) {
					indexSecPosElement = i;
				}
			}
		}
		System.out.println((indexSecPosElement > 0) ? ("The index of second positive element " + indexSecPosElement)
				: "You don't have second positive element");
		System.out.println("Min element " + minElement + " and index " + indexMinElement);

	}
}
