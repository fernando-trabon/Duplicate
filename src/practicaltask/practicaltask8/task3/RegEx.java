package practicaltask.practicaltask8.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	
	public static boolean check(String name) {
		String pattern = "[a-zA-Z_0-9]{3,15}";
		String text = name;
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		return m.matches();
	}

	public static void main(String[] args) {
		String[] array = {"Ev", "Marlon", "Dirty Garry", "Maroon_5", "Quentin*"};
		for (String s: array) {
			System.out.println(s + " - " + check(s));
		}
	}

}
