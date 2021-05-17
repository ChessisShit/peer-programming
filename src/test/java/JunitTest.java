

import static org.junit.Assert.assertEquals;

public class JunitTest {

	public void reverseFactorialTest() {
		assertEquals(Runner.reverseFactorial(120), "5!");
		assertEquals(Runner.reverseFactorial(1), "1!");
		assertEquals(Runner.reverseFactorial(150), "NONE");
	}
	
}
