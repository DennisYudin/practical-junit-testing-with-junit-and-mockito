package com.practicalunittesting.chp03_Unit_Tests_with_no_Collaborators.money;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@RunWith(JUnitParamsRunner.class)
public class MoneyIAETest {
	private final static int VALID_AMOUNT = 5;
	private final static String VALID_CURRENCY = "USD";

	private static Object[] getInvalidAmount() {
		return new Object[]{-12387, -5, -1};
	}

	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "getInvalidAmount")
	public void constructorShouldThrowIAEForInvalidAmount(int invalidAmount) {
		new Money(invalidAmount, VALID_CURRENCY);
	}

	private static Object[] getInvalidCurrency() {
		return new Object[]{null, ""}; //TODO was fixed in JUnitParams version 1.1.1
		// does not work with $(null, ""); - maybe fixed in newer JUnitParams
//		return new String[][]{{null}, {""}}; <- that's why was use such approach
	}

	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "getInvalidCurrency")
	public void constructorShouldThrowIAEForInvalidCurrency(String invalidCurrency) {
		new Money(VALID_AMOUNT, invalidCurrency);
	}
}
