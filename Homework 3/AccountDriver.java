/*
 * Programming Project 3 - AccountDriver.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 17, 2018
 */

/* 
 * Test Driver class for the Account class.
 * Creates some bank accounts and requests various services 
 */
import java.util.Scanner;

public class AccountDriver {
	public static void main (String[] args) {
		/* Creates three Account Objects */
		Account acct1 = new Account ("Ted Murphy", 72354, 102.56);
		Account acct2 = new Account ("Jane Smith", 69713, 40.00);
		Account acct3 = new Account ("Edward Demsey", 93757, 759.32);
      
		/* Creates a pin to each account */
		acct1.setKey(123);
		acct2.setKey(222);
		acct3.setKey(321);
      
		/* creates a scanner object and asks the user to enter the pin for the accounts */
		Scanner scan = new Scanner(System.in);
      
		System.out.print("Enter the pin for Murphy's account: ");
		int x = scan.nextInt();
		System.out.print("Enter the pin for the Smith's account: ");
		int y = scan.nextInt();
		System.out.print("Enter the pin for the Demsey's account: ");
		int z = scan.nextInt();
		System.out.println();
      
		/* attempts to unlock the accounts */
		acct1.unlock(x);
		acct2.unlock(y);
		acct3.unlock(z);

		/* attempts to deposit and withdraw */
		double smithBalance = acct2.deposit (500.00);
		System.out.println ("Smith balance after deposit: " + smithBalance);
		System.out.println ("Smith balance after withdrawal: " + acct2.withdraw (430.75, 1.50));
      
		/* prints out all of the accounts */
		System.out.println ("\nAccounts Summary:");
		System.out.println (acct1);
		System.out.println (acct2);
		System.out.println (acct3);
	}
}
