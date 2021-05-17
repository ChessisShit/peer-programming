
public class Runner {

	public static void main(String[] args) {
		
		System.out.println(dogo (5));

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
	
	
	public static String dogo(int input) {
		String output = "";
		for (int x = 1; x <= 100; x++)
		{	
		if (x != input) {
			
			if (x % 10 == 2) {
			
				output += x + "nd, ";
						
			} else if (x % 10 == 3)  {
				
				output += x + "rd, ";
				
				
			} else {
				output += x + "th, ";
			}
			
			
			
		}
					
		}
	return output.substring(0, output.length()-2);
	}
	
}
