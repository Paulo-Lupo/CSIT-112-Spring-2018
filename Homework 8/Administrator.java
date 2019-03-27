/*
 * Programming Project 8 - Administrator.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 2, 2018
 */

/* This program inherits the attributes of the HospitalEmployee class */

public class Administrator extends HospitalEmployee {
	
	/* child's constructor calls the Parent's constructor */
	public Administrator(String name, int number)
	{
		super(name, number);
	}
	
	/* Method defines a service provided by an Administrator */
	public String overiview() 
	{
		return "It is the administrator's job to overview all the activities in the hospital.";
	}
}
