/*
 * Programming Project 9 - Book.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 14, 2018
 */

/* This program inherits the attributes of the ReadingMaterial class */

public class Book extends ReadingMaterial {
	
	private int pages;
	private String author, mainCharacter;
	
	/* constructor initializes a book */
	public Book (String tittle, String isbn, String author, int pages) {
		super(tittle, isbn);
		this.author = author;
		this.pages = pages;
		
	}
	
	/* sets/changes the main character of the book */
	public void setMainCharacter (String character) {
		mainCharacter = character;
	}
	
	/* prints some information about the book */
	public void getMainCharacter () {
		System.out.println(mainCharacter + " is the main character of this book. \n");
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nNumber of pages: " + pages;
		return result;
	}
}
