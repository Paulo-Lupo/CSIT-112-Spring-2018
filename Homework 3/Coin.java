/*
 * Programming Project 3 - Coin.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 17, 2018
 */

/*
 * Represents a coin with two sides that can be flipped.
 * This coin class implements the Lockable interface to lock the coins.
 */

public class Coin implements Lockable {
	private int key;
	private boolean lock;
	
	/* sets up the coin by flipping it initially. */
	public Coin () {
		lock = false;
		flip();
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
	
	private final int HEADS = 0;
	private final int TAILS = 1;

	private int face;



	/* flips the coin by randomly choosing a face value */
	public void flip () {
		if (!locked()) {
			face = (int) (Math.random() * 2);
		}
	}

	/* returns true if the current face of the coin is heads */
	public boolean isHeads () {
		return (face == HEADS);
	}

	/* returns the current face of the coin as a string */
	public String toString() {	
		if (locked()) {	
			return "You did not enter the right key";
		} else {
			String faceName;

			if (face == HEADS)
				faceName = "Heads";
			else
				faceName = "Tails";

			return faceName; 
		}
	}
}
