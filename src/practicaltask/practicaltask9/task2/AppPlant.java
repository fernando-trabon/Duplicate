package practicaltask.practicaltask9.task2;

import java.util.Arrays;

public class AppPlant {

	public static void main(String[] args) {
		Plant[] plants = new Plant[5];
		try {
			plants[0] = new Plant(2, "red", "STREPTOPHYTA");
			plants[1] = new Plant(3, "white", "CHLOROPHYTA");
			plants[2] = new Plant(1, "white", "STREPTOPHYTA");
			plants[3] = new Plant(2, "green", "STREPTOPHYTA");
			plants[4] = new Plant(4, "red", "CHLOROPHYTA");
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage() + "\n");
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(plants));
	}
}
