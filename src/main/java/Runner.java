
public class Runner {

	public static void main(String[] args) {
		
		System.out.println(calculator(new int[] {2, 4, 8} ));
		
		

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

	
	public static String calculator(int [] input) {
		int[] inputExt = new int[input.length * 2];
		for (int y = 0; y < 2; y++) {
			for (int x= 0; x< input.length; x++) {
				inputExt[x+(y*input.length)] = input[x];
			}
		}
		
		String output = "";
		for (int x = 0; x < input.length; x++) {
			if (inputExt[0+x] + inputExt[1+x] == inputExt[2+x]) {
				output += inputExt[0+x]+", " + inputExt[1+x]+", "+inputExt[2+x] + "\n";
			}
			if (inputExt[0+x] - inputExt[1+x] == inputExt[2+x]) {
				output += inputExt[0+x]+", " + inputExt[1+x]+", "+inputExt[2+x]+ "\n";		
			}
			if (inputExt[0+x] * inputExt[1+x] == inputExt[2+x]) {
				output += inputExt[0+x]+", " + inputExt[1+x]+", "+inputExt[2+x] + "\n";
			}
			if (inputExt[0+x] / inputExt[1+x] == inputExt[2+x]) {
				output += inputExt[0+x]+", " + inputExt[1+x]+", "+inputExt[2+x]+ "\n";
			}
		}
		return output;
	}
	
	
	
	
}













