import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaculateTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public final void testAdd() {
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
				
		int expected = 5555;
		System.out.println("This is the testcase for Add");
		assertEquals(expected,actual);
		
	}
	@Test
	public final void testSubtract() {
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
				
		int expected = 3087;
		System.out.println("This is the testcase for Subtract");
		assertEquals(expected,actual);
	}
	@Test
	public final void testMultiply() {
		int a = 10;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a,b);
				
		int expected = 100;
		System.out.println("This is the testcase for Mutiply");
		assertEquals(expected,actual);
	}
	@Test
	public final void testDivide() {
		int a = 100;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
				
		int expected = 10;
		System.out.println("This is the testcase for Divide");
		assertEquals(expected,actual);
		
	}

}
