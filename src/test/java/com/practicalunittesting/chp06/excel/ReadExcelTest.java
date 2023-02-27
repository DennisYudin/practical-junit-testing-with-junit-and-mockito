package com.practicalunittesting.chp06.excel;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.loader.LoaderType;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@RunWith(DataDrivenTestRunner.class)
public class ReadExcelTest {

	@Test
	@DataLoader(
			filePaths = {"com/practicalunittesting/chp06/excel/financial.xls"},
			loaderType = LoaderType.EXCEL)
	public void shouldCalculateDiscount(@Param(name="value") String value,
										@Param(name="discount")String discount) {
		double expected = Double.parseDouble(discount);
		double actual = DiscountCalculator.calculateDiscount(Double.parseDouble(value));
		assertEquals(expected, actual, 0.0001);
	}
}
