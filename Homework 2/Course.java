/*
 * Programming Project 2 - Course.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 5, 2018
 */

/* 
 * Creates a Course object that have students added to it 
 * prints the average grade of enrolled students
 * and prints a list of all students enrolled in the class
 */

import java.util.ArrayList;

public class Course {
	
	private String courseName;
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private int studentNum;
	
	/* Constructor */
	public Course(String courseName) {
	
		this.courseName = courseName;
		studentNum = 0;	
	}
	
	/* Method to add an student to the course */
	public void addStudent(Student student) {  
		studentList.add(student);
		studentNum = studentNum+1;
	}
	
	/* Method to compute the average of all students' test score averages */
	public double average() {
		double total = 0;
		for (int i=0; i < studentNum; i++) {
			total = total + studentList.get(i).average();
		}
		return total/studentNum;
	}
	
	/* Method to print all students enrolled in the course */
	public String roll () {
		String result = "";
		System.out.println("Students enrolled in " + courseName + ":\n ");
		for (int i=0; i < studentNum; i++) {
			result = result + studentList.get(i).toString() + "\n";
		}
		
		return result;
	}
}
