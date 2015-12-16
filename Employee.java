//********************************************************************
//  Employee.java       Author: Lewis/Loftus
//
//  Represents a general paid employee.
//********************************************************************

public class Employee extends StaffMember
{
   protected String socialSecurityNumber;
   protected double payRate;
   
   //-----------------------------------------------------
   //  Constructor: Sets up this employee with passed data
   //------------------------------------------------------
   public Employee(String empName, String empAddress, String empPhone,
                   String socSecNumber, double rate)
   {
      super(empName, empAddress, empPhone);

      socialSecurityNumber = socSecNumber;
      payRate = rate;
   }

   //-----------------------------------------------------------------
   //  Returns information about an employee as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = super.toString();

      result += "\nSocial Security Number: " + socialSecurityNumber;

      return result;
   }

   //-----------------------------------------
   //  Returns the pay rate for this employee.
   //------------------------------------------
   public double pay()
   {
      return payRate;
   }
   
} // end of class
