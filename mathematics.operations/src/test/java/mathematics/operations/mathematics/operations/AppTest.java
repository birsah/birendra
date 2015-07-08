package mathematics.operations.mathematics.operations;

import junit.framework.TestCase;

public class AppTest extends TestCase {
	/* Unit test for Addition when PASSED */

	public void testAddition() {
		int resultExpected = 26;
		int resultActual = mathematicaloperations.addition(22, 4);
		assertEquals(resultExpected, resultActual);
	} // end of method

	/* Unit test for Addition When FAILED */

	public void testFailAddition() {
		int resultExpected = 20;
		int resultActual = mathematicaloperations.addition(22, 4);
		assertEquals(resultExpected, resultActual);
	} // end of method

	// Unit test for Subtraction when PASSED //
	public void testSubstraction() {
		int resultExpected = 6;
		int resultActual = mathematicaloperations.substraction(102, 96);
		assertEquals(resultExpected, resultActual);
	} // end of method

	// Unit test for Subtraction when FAILED //
	public void testFailSubstraction() {
		int resultExpected = 5;
		int resultActual = mathematicaloperations.substraction(102, 96);
		assertEquals(resultExpected, resultActual);
	} // end of method

	/* Unit test for Multiplication when PASSED */

	public void testMultiplication() {
		int resultExpected = 24;
		int resultActual = mathematicaloperations.multiplication(3, 8);
		assertEquals(resultExpected, resultActual);
	} // end of method

	/* Unit test for Multiplication when FAILED */

	public void testFailMultiplication() {
		int resultExpected = 20;
		int resultActual = mathematicaloperations.multiplication(3, 8);
		assertEquals(resultExpected, resultActual);
	}// end of method

	// Unit test for Division when PASED//

	public void testDivision() {
		int resultExpected = 7;
		int resultActual = mathematicaloperations.division(35, 5);
		assertEquals(resultExpected, resultActual);
	}// end of method

	// Unit test for Division when FAILED//

	public void testFailDivision() {
		int resultExpected = 8;
		int resultActual = mathematicaloperations.division(35, 5);
		assertEquals(resultExpected, resultActual);
	}// end of method

}
