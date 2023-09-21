package junittesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	Calculator c = new Calculator();

	@Before
	public void show() {
		System.out.println("WELCOME");
	}

	@Test
	public void testAdd() {
		System.out.println(c.add(10, 20));
	}

	@Test
	public void testSub() {
		System.out.println(c.sub(20, 10));
	}

	@Test
	public void testMul() {
		System.out.println(c.mul(5, 2));
	}

	@After
	public void shows() {
		System.out.println("THANK YOU");
	}
}
