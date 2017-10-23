package practicaltask.practicaltask8.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubstringSecond {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input the first line: ");
		String str1 = reader.readLine();
		System.out.println("Input the second line: ");
		String str2 = reader.readLine();
		System.out.println(str2.contains(str1));
	
	}
}
