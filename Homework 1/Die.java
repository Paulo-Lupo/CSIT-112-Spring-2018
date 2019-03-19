/*
 * Programming Project 1 - Die.java
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 1, 2018
 */

/* 
 * The program bellow was given by the professor and 
 * is used to create a single die that can be rolled
 */

//********************************************************************
//  Die.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 5.10 and 5.17 and 6.5
//
//  Represents one die (singular of dice) with faces showing values
//  between 1 and the number of faces on the die.
//********************************************************************

public class Die
{
   private final int MAX = 6;  // maximum face value

   private int faceValue;  // current value showing on the die

   //-----------------------------------------------------------------
   //  Constructor: sets the initial face value.
   //-----------------------------------------------------------------
   public Die()
   {
      faceValue = 1;
   }

   //-----------------------------------------------------------------
   //  Rolls the die and returns the result.
   //-----------------------------------------------------------------
   public int roll()
   {
      faceValue = (int) (Math.random() * MAX) + 1;

      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Face value mutator.
   //-----------------------------------------------------------------
   public void setFaceValue (int value)
   {
      faceValue = value;
   }

   //-----------------------------------------------------------------
   //  Face value accessor.
   //-----------------------------------------------------------------
   public int getFaceValue()
   {
      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this die.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = Integer.toString(faceValue);

      return result;
   }
}
