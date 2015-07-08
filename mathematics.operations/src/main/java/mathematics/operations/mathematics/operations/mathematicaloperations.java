package mathematics.operations.mathematics.operations;

public class mathematicaloperations {
	/* Method for "ADDITION" Of two non-negative number */

	public static int addition(int num_1, int num_2) {
		int sum = 0;
		if (num_1 != 0 && num_2 != 0)
			sum = num_1 + num_2;
		return sum;
	}

	/*
	 * Method for "SUBSTRACTION" is illustrated when minuend is greater than or
	 * eqal to Subtrahend
	 */

	public static int substraction(int minuend, int subtrahend) {
		int difference = 0;
		if (minuend >= subtrahend)
			difference = minuend - subtrahend;
		return difference;
	}

	/* Method for "MULTIPLICATION" Of two non-negative number */

	public static int multiplication(int num_1, int num_2) {
		int product = 0;
		if (num_1 != 0 && num_2 != 0)
			product = num_1 * num_2;
		return product;
	}

	/* Method for "DIVISION" Of two non-negative number */

	public static int division(int dividend, int divisor) {
		int quotient = 0;
		if (dividend >= divisor && divisor != 0) {
			quotient = dividend / divisor;
		}
		return quotient;
	}

}
