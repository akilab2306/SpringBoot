package com.webapp.demo1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
@DisplayName("MathCalculation")
@SpringBootTest
class SpringJunitApplicationTests {

private MathsCals mathsCals;
TestInfo testinfo;
TestReporter testreporter;
	
	
	@BeforeEach
	void initEach(TestInfo testinfo,TestReporter testreporter) {
		this.testinfo=testinfo;
		this.testreporter=testreporter;
		mathsCals = new MathsCals();
		
		testreporter.publishEntry("Running"+ testinfo.getDisplayName());
		
	}

	@Nested
	@DisplayName("Add method")
	class AddTest {
		@Test
		@DisplayName("Add method for positive Numbers")
		void testAddingTwoPositives() {
			assertEquals(2, mathsCals.add(1, 1), 
					"Add method should return the sum of two numbers");
		}
		
		@DisplayName("Add method for Negative Numbers")
		@Test
		void testAddingTwoNegatives() {
			assertEquals(-2, mathsCals.add(-1, -1), 
					"Add method should return the sum of two numbers");
		}
		
		@Test
		@DisplayName("Add method for positive & Negative Numbers")
		void testAddingAPositiveAndANegative() {
			assertEquals(0, mathsCals.add(-1, 1), 
					"Add method should return the sum of two numbers");
		}
	}
	
	@Test 
	@DisplayName("method for Multiply Numbers")
	void testMultiply() {
		assertAll(
				() -> assertEquals(0, mathsCals.multiply(1, 0)),
				() -> assertEquals(1, mathsCals.multiply(1, 1)),
				() -> assertEquals(6, mathsCals.multiply(2, 3))
				);
	}
	
	@Test 
	@DisplayName(" method for circle")
	void computeCircleArea() {
		assertEquals(314.1592653589793, mathsCals.computeCircleArea(10), 
				"Should return right circle area");
	}
	
	@Test
	@DisplayName(" method for Divide Numbers")
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mathsCals.divide(1, 0), 
				"Divide should throw ArithmeticException when denominator is zero");
	}
	
}