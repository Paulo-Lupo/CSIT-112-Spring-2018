/*
 * Programming Project 3 - Task.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 17, 2018
 */

/* This program creates a task with a set priority and complexity */

public class Task implements Priority, Complexity {
	private String activity, importance, complex;
	private int priority, complexity;
	
	/* Constructor sets the type of activity, priority and complexity */
	public Task(String activity, int priority, int complexity) {
		this.priority = priority;
		this.activity = activity;
		this.complexity = complexity;
		
		if (priority == 1) {
			importance = "Very Important \t";
		} else if (priority == 2) {
			importance = "Fairly Important";
		} else if (priority == 3) {
			importance = "Important \t";
		} else if (priority == 4) {
			importance = "Slightly Important";
		} else if (priority == 5) {
			importance = "Not at all Important";
		}
		
		if (complexity == 1) {
			complex = "Very Easy";
		} else if (complexity == 2) {
			complex = "Fairly Easy";
		} else if (complexity == 3) {
			complex = "Medium";
		} else if (complexity == 4) {
			complex = "Slightly Hard";
		} else if (complexity == 5) {
			complex = "Very Hard";
		}
	}
	
	/* changes the priority */
	public void setPriority(int priority) {
		this.priority = priority;
		
		if (priority == 1) {
			importance = "Very Important";
		} else if (priority == 2) {
			importance = "Fairly Important";
		} else if (priority == 3) {
			importance= "Important";
		} else if (priority == 4) {
			importance = "Slightly Important";
		} else if (priority == 5) {
			importance = "Not at all Important";
		}
	}
	
	
	public int getPriority() {
		return priority;
	}
	
	/* changes the complexity */
	public void setComplexity(int complexity) {
		this.complexity = complexity;
		
		if (complexity == 1) {
			complex = "Very Easy";
		} else if (complexity == 2) {
			complex = "Fairly Easy";
		} else if (complexity == 3) {
			complex = "Medium";
		} else if (complexity == 4) {
			complex = "Slightly Hard";
		} else if (complexity == 5) {
			complex = "Very Hard";
		}
	}

	public int getComplexity() {
		return complexity;
	}
	
	/* prints out the priority and complexity */
	public String toString() {
		return activity + "\t Priority level: " + getPriority()+ "\t" + importance + "\t Complexity Level: " + getComplexity() + "\t" + complex;
	}
}
