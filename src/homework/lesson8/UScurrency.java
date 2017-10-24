package homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UScurrency {
	public static void check(String input) {
		String pattern = "\\$(\\d*)\\.(\\d{2})?";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(input);
		while (m.find()) {
			System.out.println(input.substring(m.start(), m.end()));
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//String s = "My per - $3453.45 ddfsdfs  $4546 4$454.344 sfs 3453.56";
		System.out.println("Input line: ");
		check(reader.readLine());
	}
}
