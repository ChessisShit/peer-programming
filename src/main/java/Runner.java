
public class Runner {

	public static void main(String[] args) {
		
		for (int item: goldilocks(100, 80, new int[]{10,20,30,100,200}, new int[]{10,20,30,50,200})) {
			System.out.println(item);
		}

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
		for (int x = 1; x <= 100; x++){	
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
	
	public static int[] goldilocks(int weight, int temp, int[] chairs, int[] bowls) {
		
		int[] output = new int[0];
		
		for (int x = 0; x < chairs.length; x++) {
			if (chairs[x] >= weight && bowls[x] <= temp) {
				
				int[] oldList = output;
				output = new int[output.length+1];
				for (int y = 0; y < oldList.length; y++) {
					output[y] = oldList[y]; 
				}
				output[output.length-1] = x+1;
				
			}
		}
		return output;
	}
	
}
