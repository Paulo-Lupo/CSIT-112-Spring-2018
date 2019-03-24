import java.util.Scanner;

public class NumCounter2525 {

	public static void main(String args[]) {
		
		// Initializes the scanner object and an array
		int[] numCounter = new int[51];
		Scanner scan = new Scanner(System.in);
		
		// Initializes x as 0 so it can enter the loop
		int x = 0;
		
		// Checks if the number entered is inside of the range
		while (x >= -25 && x <= 25 ) {
			
			// Asks the user for an input inside of the range
			System.out.print("Enter a number greater than or equals to -25 and less than or equals to 25: ");
			x = scan.nextInt();
			
			// Counts how many times each number is entered if it is inside of the range
			if (x >= -25 && x <= 25 )  
			{		
				numCounter[x+25]++;
			} 
			else 
			{
				System.out.println("You have entered a number outside of the range.");
			}
		}
		
		// Prints out all the numbers with more than one occurrences
		System.out.println("\nNumber of occurency for each input in the range: ");
		System.out.println();
		for (int i = 0; i <= 50; i++) 
		{
			if (numCounter[i] == 0) 
			{
				
			} 
			else 
			{	
				// If statements organizes the output to look a little nicer
				if (i<=15)
					System.out.println((i-25) + ": " + numCounter[i]);
				else if (i>=16 && i <= 24)
					System.out.println(" " + (i-25) + ": " + numCounter[i]);
				else if (i>=25 && i<=34)
					System.out.println("  " + (i-25) + ": " + numCounter[i]);
				else
					System.out.println(" " + (i-25) + ": " + numCounter[i]);
			}
		}
			
	}
}