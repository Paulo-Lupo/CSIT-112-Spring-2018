/*
 * Programming Project 9 - Person.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 14, 2018
 */

/* Class given by the Professor. It is used as the parent of multiple classes */

//********************************************************************
//  Person.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 9.5 
//********************************************************************

public class Person
{
   private int age;
   private String location;

   //------------------------------------------------------------------
   //  Creates a person with the specified age and location.
   //------------------------------------------------------------------
   public Person(int personAge, String personLocation)
   {
      age = personAge;
      location = personLocation;
   }

   //------------------------------------------------------------------
   //  Returns a string summary of this person.
   //------------------------------------------------------------------
   public String toString()
   {
      return "Age: " + age + "\nLocation: " + location;
   }
}
