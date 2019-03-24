/*
 * Programming Project 3 - Lockable.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 17, 2018
 */

/* This interface contains abstract methods to lock and unlock an object */

public interface Lockable {
	/* sets the object's key */
	public void setKey(int key);

	/* locks the object if the proper key is provided */
	public void lock(int key);
	
	/* unlocks the object if the proper key is provided */
	public void unlock(int key);
	
	/* returns true it the object is locked, else returns false */
	public boolean locked();
}
