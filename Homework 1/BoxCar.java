/*
 * Programming Project 1 - BoxCar.java
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 1, 2018
 */

/*
 * This program rolls a pair of dice 1000 times
 * and counts the number of box cars.
 */

public class BoxCar {
	public static void main(String[] args) {
		
		// creates PairOfDice objects
		PairOfDice bc = new PairOfDice();
		int count = 0;
		
		for (int i=0; i < 1000; i++) {
			
			/* rolls the pair of dice */
			bc.roll();
			
			/* counts the number of box cars */
			if (bc.getTotalFaceValue() == 12) {
				count = count+1;
			}	
		}
		System.out.println("The total number of box cars that occur is: " + count);
	}
}
