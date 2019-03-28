/*
 * Programming Project 9 - Novel.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 14, 2018
 */

/* This program inherits the attributes of the ReadingMaterial class */

public class Novel extends ReadingMaterial {

	private int pages;
	private String author, mainCharacter;
	
	/* constructor initializes a novel */
	public Novel (String tittle, String isbn, String author, int pages) {
		
		super(tittle, isbn);
		this.author = author;
		this.pages = pages;
	}
	
	/* sets/changes the main character of the novel */
	public void setMainCharacter (String character) {
		mainCharacter = character;
	}
	
	/* prints some information about the novel */
	public void getMainCharacter () {
		System.out.println(mainCharacter + " is the main character of this novel. \n");
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nNumber of pages: " + pages + "\tAuthor: " + author;
		return result;
	}
}
