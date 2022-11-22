package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.AddNumber(200, 200);
		assertEquals(400, result);
	}

}
