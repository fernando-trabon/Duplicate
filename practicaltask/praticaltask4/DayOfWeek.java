package javaCore.practicaltask.praticaltask4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfWeek {

	public static void main(String[] args) throws NumberFormatException, IOException {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    
	    int dayOfWeek;
	    System.out.println("Input a day of week");
	    dayOfWeek = Integer.parseInt(reader.readLine());
	    
	    switch (dayOfWeek) {
	    case 1:
	    	System.out.println("Понеділок" + " Понедельник" + " Monday");
	    	break;
	    case 2:
	    	System.out.println("Вівторок" + " Вторник" + " Tuesday");
	    	break;
	    case 3:
	    	System.out.println("Середа" + " Среда" + " Wednesday");
	    	break;
	    case 4:
	    	System.out.println("Четвер" + " Четверг" + " Thursday");
	    	break;
	    case 5:
	    	System.out.println("П*ятниця" + " Пятниця" + " Friday");
	    	break;
	    case 6:
	    	System.out.println("Субота" + " Суббота" + " Saturday");
	    	break;
	    case 7:
	    	System.out.println("Неділя" + " Воскресенье" + " Sunday");
	    	break;
	    default:
	    	System.out.println("You inputted wrong number!");
	    
	    }
	    
	}

}
