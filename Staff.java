/**********************************************************************
 * Class: CS111B - Object-Oriented Programming Methodologies in Java
 * Description: 	This class represents the personnel staff of a 
 * 					particular business. It creates a payroll through
 * 					polymorphic call. Data is fictitious test data.
 * Due Date:		November 2
 * Name:			Thierry Spelle
 * Name of File: 	Staff.java
 * Lab 
 **********************************************************************///********************************************************************

public class Staff
{
  private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
      staffList = new StaffMember[8];				// modified size of array from 6 to 8

      staffList[0] = new Executive("Sam", "123 Main Line", "555-0469",
    		  					  			  "123-45-6789", 2423.07);

      staffList[1] = new Employee("Carla", "456 Off Line", "555-0101",
    		  								  "987-65-4321", 1246.15);
      
      staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000",
    		  									"010-20-3040", 1169.23);

      staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690",
    		  									"958-47-3625", 10.55);

      staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
      
      staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");
      
      //new code
      staffList[6] = new Commission("Mary", "100 Friend Road", // added employee
    		  						"555-9876", "123-98-5438", 6.25, 0.2);
      
      staffList[7] = new Commission("Joe", "200 Pal Place",		// added employee
    		  						"555-6666", "999-99-1111", 9.75, 0.15);
      // end of new code

      ((Executive)staffList[0]).awardBonus(500.00);

      ((Hourly)staffList[3]).addHours(40);
      
      // new code
      ((Commission)staffList[6]).addHours(35);		// add hours and commission
      ((Commission)staffList[6]).addSales(400);		// to this employee
      
      ((Commission)staffList[7]).addHours(40);		// add hours and commission
      ((Commission)staffList[7]).addSales(950);		// to this employee
      // end of new code
   }

   //-----------------------------------------------------------------
   //  Pays all staff members.
   //-----------------------------------------------------------------
   public void payday ()
   {
      double amount;

      for (int count=0; count < staffList.length; count++)
      {
         System.out.println(staffList[count]);

         amount = staffList[count].pay();  			// polymorphic call

         if (amount == 0.0)
            System.out.println("Thanks!");
         else
            System.out.println("Paid: " + amount);

         System.out.println("-----------------------------------");
      }
   }
}
