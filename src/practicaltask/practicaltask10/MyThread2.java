package practicaltask.practicaltask10;

public class MyThread2 implements Runnable {

	public MyThread2() {
		super();
	}

	@Override
	public void run() {
		String str = "Peace in the peace";
		for (int i = 0; i < 5; i++) {
			System.out.println(str);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
