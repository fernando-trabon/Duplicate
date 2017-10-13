package practicaltask.practicaltask4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountryContinent {
	static public enum Continent {
		EUROPE, ASIA, AFRICA, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Continent c = Continent.ASIA;

		System.out.println("Please, input country name: ");
		String countryName = reader.readLine();
		switch (countryName) {
		case "Norway":
		case "Ukraine":
		case "Great Britain":
		case "Spain":
		case "Germany":
		case "France":
		case "Poland":
				c= Continent.ASIA;
			//System.out.println("This country is in " + Continent.EUROPE + ".");
			break;
		case "China":
		case "Japan":
		case "India":
			System.out.println("This country is in " + Continent.ASIA + ".");
			break;
		case "Egypt":
		case "Algeria":
		case "Libya":
		case "Angola":
		case "Mali":
		case "Niger":
			System.out.println("This country is in " + Continent.AFRICA + ".");
			break;
		case "USA":
		case "Canada":
		case "Mexico":
			System.out.println("This country is in " + Continent.NORTH_AMERICA + ".");
			break;
		case "Brazil":
		case "Columbia":
		case "Argentina":
		case "Chile":
		case "Ecuador":
		case "Panama":
			System.out.println("This country is in " + Continent.SOUTH_AMERICA + ".");
			break;
		case "Australia":
			System.out.println("This country is in " + Continent.AUSTRALIA + ".");
			break;
		default:
			System.out.println("You inputted wrong country name!");
				System.exit(0);

		}
		System.out.println(c);

	}

}
