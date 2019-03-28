/*
 * Programming Project 9 - PlayerStats.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 14, 2018
 */

/* Class given by the Professor. It is used as the parent of multiple classes */

//********************************************************************
//  PlayerStats.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 9.4 
//********************************************************************

public abstract class PlayerStats
{
   protected String player, team;
   protected int score;

   //-----------------------------------------------------------------
   //  Sets up this stat object with the specified info.
   //-----------------------------------------------------------------
   public PlayerStats (String playerName, String teamName)
   {
      player = playerName;
      team = teamName;
      score = 0;
   }

   //-----------------------------------------------------------------
   //  Returns the score.
   //-----------------------------------------------------------------
   public int getScore()
   {
      return score;
   }

   //-----------------------------------------------------------------
   //  Updates the score as appropriate depending on the sport.
   //-----------------------------------------------------------------
   public abstract void score();

   //-----------------------------------------------------------------
   //  Returns a description of this stats object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = "Player: " + player;
      result += "\nTeam: " + team;
      result += "\nScore: " + score;
      return result;
   }
}
