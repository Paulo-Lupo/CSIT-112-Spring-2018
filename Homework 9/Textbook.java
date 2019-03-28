/*
 * Programming Project 9 - Textbook.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 14, 2018
 */

/* This program inherits the attributes of the ReadingMaterial class */

public class Textbook extends ReadingMaterial {
	
	private int pages;
	private String subject;
	
	/* constructor initializes a textbook */
	public Textbook(String tittle, String isbn, int pages) {
		
		super(tittle, isbn);
		this.pages = pages;
	}
	
	/* sets/changes the main subject of the textbook */
	public void setSubject (String subject) {
		this.subject = subject;
	}
	
	/* prints some information about the textbook */
	public void getSubject () {
		System.out.println(subject + " is the main subject of this book. \n");
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nNumber of pages: " + pages;
		return result;
	}
}
