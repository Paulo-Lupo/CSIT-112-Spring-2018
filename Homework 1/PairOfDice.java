/*
 * Programming Project 1 - PairOfDice.java
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 1, 2018
 */

/* 
 * The program bellow was given by the professor 
 * It is used to created a pair of dice which 
 * is simply two Die objects
 */

//********************************************************************
//  PairOfDice.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 4.8
//********************************************************************

public class PairOfDice
{
   private Die die1, die2;

   //-----------------------------------------------------------------
   //  Creates two six-sided Die objects, both with an initial
   //  face value of one.
   //-----------------------------------------------------------------
   public PairOfDice()
   {
      die1 = new Die();
      die2 = new Die();
   }

   //-----------------------------------------------------------------
   //  Rolls both dice and returns the combined result.
   //-----------------------------------------------------------------
   public int roll()
   {
      return die1.roll() + die2.roll();
   }

   //-----------------------------------------------------------------
   //  Returns the current combined dice total.
   //-----------------------------------------------------------------
   public int getTotalFaceValue()
   {
      return die1.getFaceValue() + die2.getFaceValue();
   }

   //-----------------------------------------------------------------
   //  Returns the current value of the first die.
   //-----------------------------------------------------------------
   public int getDie1FaceValue()
   {
      return die1.getFaceValue();
   }

   //-----------------------------------------------------------------
   //  Returns the current value of the second die.
   //-----------------------------------------------------------------
   public int getDie2FaceValue()
   {
      return die2.getFaceValue();
   }

   //-----------------------------------------------------------------
   //  Returns the string representation of this pair of dice.
   //-----------------------------------------------------------------
   public String toString()
   {
      return "Die 1: " + die1.getFaceValue() + "   Die 2: " +
             die2.getFaceValue();
   }
}
