package practicaltask.practicaltask10;

public class MyThread implements Runnable {
	
	public MyThread() {
		super();
	}

	@Override
	public void run() {
		String str = "Hello, World";
		for (int i = 0; i < 5; i++) {
			System.out.println(str);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
