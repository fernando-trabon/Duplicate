package homework.lesson4;

public class Check {
	public static enum HTTPError {
		BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND, METHOD_NOT_ALLOWED
	}
	
	
	public static String checkRange(float firstNumber, float secondNumber, float thirdNumber) {
		if ((firstNumber > (-5)) && (firstNumber < 5) && (secondNumber > (-5)) && (secondNumber < 5)
				&& (thirdNumber > (-5)) && (thirdNumber < 5)) {
			return "True";
		} else {
			return "False";
		}

	}

	public static int[] minMaxNumbers(int firstNumber, int secondNumber, int thirdNumber) {
		int min = firstNumber;
		int max = firstNumber;
		if (secondNumber > max) {
			max = secondNumber;
		}
		if (thirdNumber > max) {
			max = thirdNumber;
		}
		if (secondNumber < min) {
			min = secondNumber;
		}
		if (thirdNumber < min) {
			min = thirdNumber;
		}
		int array [] = {min, max};
		// if (firstNumber > secondNumber) {
		// if (secondNumber > thirdNumber) {
		// max = firstNumber;
		// min = thirdNumber;
		// } else if (thirdNumber > firstNumber) {
		// max = thirdNumber;
		// min = secondNumber;
		// } else {
		// max = firstNumber;
		// min = secondNumber;
		// }
		// } else if (secondNumber < thirdNumber) {
		// max = thirdNumber;
		// min = firstNumber;
		// } else if (firstNumber > thirdNumber) {
		// max = secondNumber;
		// min = thirdNumber;
		// } else {
		// max = secondNumber;
		// min = firstNumber;
		// }
		
		return array;
	}

	public static HTTPError nameOfHttpError(String numberHTTPError) {
		HTTPError nameHTTPError = null;
		switch (numberHTTPError) {
		case "400":
			nameHTTPError = HTTPError.BAD_REQUEST;
			break;
		case "401":
			nameHTTPError = HTTPError.UNAUTHORIZED;
			break;
		case "402":
			nameHTTPError = HTTPError.PAYMENT_REQUIRED;
			break;
		case "403":
			nameHTTPError = HTTPError.FORBIDDEN;
			break;
		case "404":
			nameHTTPError = HTTPError.NOT_FOUND;
			break;
		case "405":
			nameHTTPError = HTTPError.METHOD_NOT_ALLOWED;
		}
		return nameHTTPError;
	}

}
