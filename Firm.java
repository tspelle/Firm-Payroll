//********************************************************************
//  Firm.java       Author: Lewis/Loftus

//  Demonstrates polymorphism via inheritance.

//  Lab 9
//********************************************************************

public class Firm
{
  //-----------------------------------------------------------------
  //  Creates a staff of employees for a firm and pays them.
  //-----------------------------------------------------------------
  public static void main(String[] args)
  {
    Staff personnel = new Staff();

    personnel.payday();
  }
  
} // end of class
