package First.Threads;

public class NewThread extends Thread{
	private String message;
	
	public NewThread(String message) {
		this.message = message;
	}
	
    public void run( ) {
    	for (int i=0; i<5; i++) {
    		System.out.println(message);
    	}
    }

}
