package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitFunctions junitstrings = new jUnitFunctions();
		String result = junitstrings.AddStrings("hello", "world");
		assertEquals("helloworld", result);
	}

}
