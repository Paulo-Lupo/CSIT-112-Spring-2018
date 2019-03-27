/*
 * Programming Project 8 - MonetaryCoin.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 2, 2018
 */

/* This program inherits attributes of the Coin class */

public class MonetaryCoin extends Coin {

	/* creates a integer variable to store the coin value */
	private int coinValue;
	
	/* 
	 * constructor assigns coin value and calls the flip method 
	 * inherited from the parent class
	 */
	public MonetaryCoin (int coinValue)
	{
		this.coinValue = coinValue;
		flip();
	}
	
	/* returns the coin value */
	public int getvalue() 
	{
		return coinValue;
	}
}
