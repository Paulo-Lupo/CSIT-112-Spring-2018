/*
 * Programming Project 9 - TechJournal.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 14, 2018
 */

/* This program inherits the attributes of the ReadingMaterial class */

public class TechJournal extends ReadingMaterial {
	
	private int pages, publicationNum;
	private String mainWriter;
	
	/* constructor initializes a technical journal */
	public TechJournal(String tittle, String isbn, int pages, int publicationNum) {
		
		super(tittle, isbn);
		this.pages = pages;
		this.publicationNum = publicationNum;
	}
	
	/* sets/changes the main writer of the technical journal */
	public void setMainWritter(String writer) {
		mainWriter = writer;
	}
	
	/* prints some information about the technical journal */
	public void getMainWritter () {
		System.out.println(mainWriter + " is the main writer of this Technical Journal.\n");
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nNumber of pages: " + pages + "\tNumber of publications: " + publicationNum;
		return result;
	}
}
