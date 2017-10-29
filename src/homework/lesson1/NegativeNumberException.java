package homework.lesson1;

// My Exception wich search throws exception if we inputing negative number
// SkrypetsO

public class NegativeNumberException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeNumberException() {
		super();
	}

	public NegativeNumberException(String message) {
		super(message);
	}

}
