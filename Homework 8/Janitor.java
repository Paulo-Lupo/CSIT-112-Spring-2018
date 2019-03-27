/*
 * Programming Project 8 - Janitor.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 2, 2018
 */

/* This program inherits the attributes of the HospitalEmployee class */

public class Janitor extends HospitalEmployee {
	
	/* child's constructor calls the Parent's constructor */
	public Janitor(String name, int number)
	{
		super(name, number);
	}
	
	/* method defines a service provided by a Janitor */
	public String cleaning() 
	{
		return "It is the janitor's job to keep the hospital clean.";
	}
}
