/*
 * Programming Project 9 - Magazine.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 14, 2018
 */

/* This program inherits the attributes of the ReadingMaterial class */

public class Magazine extends ReadingMaterial {
	
	private int pages, stories;
	private String publisher;
	
	/* constructor initializes a magazine */
	public Magazine (String tittle, String isbn, int pages, int stories) {
		
		super(tittle, isbn);
		this.pages = pages;
		this.stories = stories;
	}
	
	/* sets/changes the number of stories in the magazine */
	public void setStoriesCount (int storiesNum) {
		stories = storiesNum;
	}
	
	/* prints some information about the magazine */
	public void getPublisher () {
		System.out.println(publisher + " is the publisher of this Magazine.\n");
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nNumber of pages: " + pages + "\tNumber of stories: " + stories;
		return result;
	}
}
