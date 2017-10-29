package practicaltask.practicaltask10;

public class Task1 {

	public static void main(String[] args) {
		String str = "I study Java";
		for (int i = 0; i < 10; i++) {
			System.out.println(str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Finish. You printed string \"I study Java \" ten times!");
	}

}
