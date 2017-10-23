package practicaltask.practicaltask8.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Surname {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input surname name patronymic");
		String text = reader.readLine();
		String[] array = text.split(" ");
		System.out.println(array[0] + " " + array[1].charAt(0) + "." + array[2].charAt(0) + ".");
		System.out.println(array[1]);
		System.out.println(array[2] + " " + array[1] + " " + array[0]);
	}

}
