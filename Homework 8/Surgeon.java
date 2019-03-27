/*
 * Programming Project 8 - Surgeon.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 2, 2018
 */

/* This program inherits the attributes of the HospitalEmployee class */

public class Surgeon extends HospitalEmployee {
	
	/* child's constructor calls the Parent's constructor */
	public Surgeon(String name, int number)
	{
		super(name, number);
	}
	
	/* method defines a service provided by a Surgeon */
	public String surgery() 
	{
		return "It is the surgeon's job to do surgeries.";
	}
}
