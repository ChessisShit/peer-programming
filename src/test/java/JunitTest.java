import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTest {

	@Test
	public void reverseFactorialTest() {
		assertEquals(Runner.reverseFactorial(120), "5!");
		assertEquals(Runner.reverseFactorial(150), "NONE");
	}
	
}
