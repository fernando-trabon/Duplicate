package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class App {

	public static void main(String[] args) throws IOException {
//		String s1 = "IT";
//		String s2 = "IT Academy";
//		
//		System.out.println(s2.contains(s1));
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("Surname, name and patronymic");
//		String s3 = sc.readLine();
//		 
//		String words[] = s3.split(" ");		
//
//		System.out.println("Surname and initials");
//		System.out.println(words[0]+" "+words[1].charAt(0)+". "+words[2].charAt(0)+".");
//		
//		System.out.println("Name:"+ words[1]);
//		
//		System.out.println("Name: "+words[1]+",middle name: "+words[2]+", lastname: "+words[0]);
		StringBuffer name = new StringBuffer();
		for (int i=0; i<5; i++){
			System.out.println("Input user name");
			name.delete(0,name.length());
			name.append(sc.readLine());	
			System.out.println("Valit? "+valid(name.toString()));
		}
	}
	
	public static boolean valid(String name){
		String pattern = "\\w{3,15}$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(name);
		
		return m.matches();
	}
}
