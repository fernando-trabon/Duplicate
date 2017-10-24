package homework.lesson6.task1;

public class AppBird {

	public static void main(String[] args) {
		Bird[] arr = { new Eagle("Black and white", 2),
				new Swallow("Black and white", 4), 
				new Penguin("Black", 3),
				new Kiwi("Gray", 3) };

		for (Bird b : arr) {
			System.out.println(b.toString() +  "  The ability to fly = " + b.fly());
		}
	}
}
