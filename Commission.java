/**********************************************************************
 * Class: CS111B - Object-Oriented Programming Methodologies in Java
 * Description: 	This class is a subclass of Hourly(). It calls
 * 					the super constructor, and computes the payment
 * 					due the employee based on parameters passed from
 * 					Staff(). It defines the Pay method for this type
 * 					of employee.
 * Due Date:		November 2
 * Name:			Thierry Spelle
 * Name of File: 	Commission.java
 * Lab 9
 **********************************************************************/

public class Commission extends Hourly {
  protected double commission;			// commission received
  private double salesRate,				// commission rate
  				 empSales,				// total sales made
  				 payment;				// payment to employee
  
  //-------------
  // Constructor
  //-------------
  public Commission(String empName, String empAddress, String empPhone,
          		    String socSecNumber, double rate, double comRate) {

    super(empName, empAddress, empPhone, socSecNumber, rate);

	salesRate = comRate;  					// commission rate passed
  }
  
  //--------------------------
  // Sets the total sales made
  //--------------------------
  public void addSales(double totalSales) {
    empSales = totalSales;					// total sales passed
  }
  
  //---------------------------------------------------------
  // Method overriding the pay() method and adding commission
  //---------------------------------------------------------
  public double pay() {
	  commission = empSales * salesRate;	// compute commission
	  payment = super.pay() + commission;	// compute total payment

	  commission = 0;						// reset commission variable
	  empSales = 0;							// and total sales variable
	  						// hoursWorked gets reset in the super class
	  return payment;
  }
  
//-------------------------------------------------------
  //  Returns information about this employee as a string.
  //------------------------------------------------------
  public String toString()
  {
    String result = super.toString();			// concatenates a description
    											// of the hours worked with
    result += "\nTotal sales: " + empSales;		// the total of sales made

    return result;
  }
} // end of class