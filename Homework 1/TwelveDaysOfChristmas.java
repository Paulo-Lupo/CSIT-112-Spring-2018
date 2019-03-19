/*
 * Programming Project 1 - TwelveDaysOfChristmas.java
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 1, 2018
 */

/* Prints the song Twelve Days Of Christmas using the switch statement */

public class TwelveDaysOfChristmas {
	public static void main(String[] args) {
		for (int verse = 1; verse <= 12; verse ++) {
		
			String ss = "";
			/* changes the ordinal number ending (1st, 2nd, 3rd, 4-12th) */
			switch (verse) {
			case 1:
				ss = verse + "st";
				break;
			case 2: 
				ss = verse + "nd";
				break;
			case 3: 
				ss = verse + "rd";
				break;
			default:
				ss = verse + "th";
				break;
			}
			
			/* prints the first phrase of the song at each iteration */
			System.out.println("On the " + ss + " day of Christmas, my true love sent to me");
			
			/* prints the verses repeatedly using a switch statement without "break" */
			switch (verse) {
			case 12:
				System.out.println("Twelve drummers drumming,");
			case 11:
				System.out.println("Eleven pipers piping,");
			case 10:
				System.out.println("Ten lords a leaping,");
			case 9:
				System.out.println("Nine ladies dancing,");
			case 8:
				System.out.println("Eight maids a-milking,");
			case 7:
				System.out.println("Seven swans a-swimming,");
			case 6:
				System.out.println("Six geese a-laying,");
			case 5: 
				System.out.println("Five gold rings,");
			case 4: 
				System.out.println("Four calling birds,");
			case 3:
				System.out.println("Three French hens,");
			case 2:
				System.out.println("Two turle doves, and");
			case 1:
				System.out.println("A partridge in a pear tree.");
			} // end 2nd switch
		} // end for
	}
}
