import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTest {

	@Test
	public void reverseFactorialTest() {
		assertEquals(Runner.reverseFactorial(120), "5!");
		assertEquals(Runner.reverseFactorial(150), "NONE");
	}
	
	@Test
	public void dogoTest() {
		assertEquals(Runner.dogo(5), "1th, 2nd, 3rd, 4th, 6th, 7th, 8th, 9th, 10th, 11th, 12nd, 13rd, 14th, 15th, 16th, 17th, 18th, 19th, 20th, 21th, 22nd, 23rd, 24th, 25th, 26th, 27th, 28th, 29th, 30th, 31th, 32nd, 33rd, 34th, 35th, 36th, 37th, 38th, 39th, 40th, 41th, 42nd, 43rd, 44th, 45th, 46th, 47th, 48th, 49th, 50th, 51th, 52nd, 53rd, 54th, 55th, 56th, 57th, 58th, 59th, 60th, 61th, 62nd, 63rd, 64th, 65th, 66th, 67th, 68th, 69th, 70th, 71th, 72nd, 73rd, 74th, 75th, 76th, 77th, 78th, 79th, 80th, 81th, 82nd, 83rd, 84th, 85th, 86th, 87th, 88th, 89th, 90th, 91th, 92nd, 93rd, 94th, 95th, 96th, 97th, 98th, 99th, 100th");
	}
	
	@Test
	public void goldilocksTest() {
		assertEquals(Runner.goldilocks(100, 80, new int[]{10,20,30,100,200}, new int[]{10,20,30,50,200})[0] , 4);
		assertEquals(Runner.goldilocks(100, 80, new int[]{10,20,30,50,200}, new int[]{10,20,30,50,200}).length , 0);
	}
	
	@Test
	public void calculatorTest() {
		assertEquals(Runner.calculator(new int [] {2, 4, 8}),"2, 4, 8\n8, 2, 4\n"); 
		assertEquals(Runner.calculator(new int [] {6, 4, 9}), "");
	
	}
	
}
