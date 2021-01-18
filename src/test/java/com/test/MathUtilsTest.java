package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
	
	static MathUtils mathUtils;
	
	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}
	
	@Test
	@DisplayName("Testing add method")
	void testAdd() {
		assertEquals(2, mathUtils.add(1, 1),()->"should return sum "+2+"but not returned");
	}
	@Test
	void testComputeCircleArea() {
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10),"This is the test case for area method");
	}
	@Test
	void testDivide() {
		assertEquals(1, mathUtils.divide(1, 1),"This is the test case for divide method");
	}
	
	@Test
	void testDivideThrowsException() {
		assertThrows(ArithmeticException.class, () -> new MathUtils().divide(1,0),"Divide by zero should throw");
	}
	
	@Test
	@Disabled
	@DisplayName("TDD method,Dont Run")
	void testTdd() {
		assertEquals(2, mathUtils.add(1, 1),"This is the test case for add method");
	}
}
