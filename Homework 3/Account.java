/*
 * Programming Project 3 - Account.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 17, 2018
 */


/* 
 * Represents a bank account with basic services such as deposit and withdraw 
 * this account class implements the Lockable interface to lock the account
 */

import java.text.NumberFormat;

public class Account implements Lockable {
	
	private int key;
	private boolean lock;
	
	/* sets up an account by defining its owner, account number, and initial balance */
	public Account (String owner, long account, double initial) {
		lock = false;
	    name = owner;
	    acctNumber = account;
	    balance = initial;
	}
	
	/* sets a new key and locks the object */
	public void setKey (int key)  {
		lock = true;
		this.key = key;
	}
	
	/* locks the object if user enters the right key */
	public void lock(int key) {
		if (this.key == key) {
			lock = true;
		}
	}
		
	/* unlocks the object if the user enters the right key */
	public void unlock(int key) {
		if (this.key == key) {
			lock = false;
		}
	}
	
	/* returns the state of the lock */
	public boolean locked() {
		if (lock == false) {
			return false;
		} else {
			return true;
		}
	}
	
	private final double RATE = 0.035;  /* interest rate of 3.5% */

	private long acctNumber;
	private double balance;
	private String name;



	/* deposits the specified amount into the account and returns the new balance */
	public double deposit (double amount) {
		if (locked()) {	
			System.out.println("You cannot deposit since you have not entered the right pin");
		} else {
			balance = balance + amount;
		}
		return balance;
	}


	/*  
	 * withdraws the specified amount from the account,
	 * applies the fee, and returns the new balance. 
	 */
	public double withdraw (double amount, double fee) {
		if (locked()) {	
			System.out.println("You cannot withdraw since you have not entered the right pin");
		} else {
			balance = balance - amount - fee;
		}
		return balance;
	}

	/* adds interest to the account and returns the new balance */
	public double addInterest () {
		balance += (balance * RATE);
		return balance;
	}

	/* returns the current balance of the account */
	public double getBalance () {
		if (locked()) {	
			System.out.println("You cannot get your balance since you have not entered the right pin");
			return 0;
		} else {
			return balance;
		}
	}

	/* returns a one-line description of the account as a string */
	public String toString () {
		if (locked()) {	
			return "Cannot access this account information because you did not enter the right pin"; 
		} else {
			NumberFormat fmt = NumberFormat.getCurrencyInstance();
			return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
		}
	}
}
