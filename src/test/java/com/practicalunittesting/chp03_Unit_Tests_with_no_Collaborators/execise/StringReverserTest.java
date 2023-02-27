package com.practicalunittesting.chp03_Unit_Tests_with_no_Collaborators.execise;

import static org.junit.Assert.*;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RunWith(JUnitParamsRunner.class)
public class StringReverserTest {

	private static Object[] reverse() {
		return new Object[]{
				new Object[]{"abc", "cba"},
				new Object[]{"abc1", "1cba"},
				new Object[]{"", ""},
				new Object[]{"ab cd", "dc ba"},
				new Object[]{"<--", "--<"},
				new Object[]{"12345", "54321"},
		};
	}

	@Test
	@Parameters(method = "reverse")
	public void test(String input, String expected) {
		StringReverser reverser = new StringReverser();

		String actual = reverser.reverse(input);

		assertEquals(expected, actual);
	}
}
