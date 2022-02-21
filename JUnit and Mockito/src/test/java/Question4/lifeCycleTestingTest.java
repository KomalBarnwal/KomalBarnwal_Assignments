package Question4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class lifeCycleTestingTest {	
	static lifeCycleTesting evaluate;
	@BeforeAll
	static void setup() {
		System.out.println("hook @BeforeAll executed");
		evaluate = new lifeCycleTesting();
	}

	@BeforeEach
	void setupThis() {
		System.out.println("hook @BeforeEach executed");
	}

	@Test
	void addTest() {
		System.out.println("Execute test case 01");
		assertEquals(10, evaluate.add(3,7),"return sum of two numbers");
	}
	
	@Test
	void subTest() {
		System.out.println("Execute test case 02");
		assertEquals(4, evaluate.sub(6,2),"return difference of two numbers");
	}
	
	@Test
	void testAreaOfCircle() {
		System.out.println("Execute test case 03");
		assertEquals(314.1592653589793, evaluate.AreaOfCircle(10.00), "Should return are of circle");
	}
	
	@AfterEach
	void tearThis() {
		System.out.println("hook @AfterEach executed");
	}
	
	@AfterAll
	void tear() {
		System.out.println("hook @AfterAll executed");
	}

}
