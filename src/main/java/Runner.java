
public class Runner {

	public static void main(String[] args) {
		
		System.out.println(reverseFactorial(150));

	}
	
	public static String reverseFactorial(int number) {
		
		int counter = 0;
		while (number > 1) {
			counter++;
			
			if (number % counter != 0) {
				return "NONE";
			}
			number = number/counter;
			
		}
		
		return counter+"!";
		
	}
}
