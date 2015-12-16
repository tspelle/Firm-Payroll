//********************************************************************
//  Executive.java       Author: Lewis/Loftus
//
//  Represents an executive staff member, who can earn a bonus.
//********************************************************************

public class Executive extends Employee
{
  private double bonus;

  //------------------------------------------------------
  //  Constructor: Sets up this executive with passed data
  //------------------------------------------------------
  public Executive(String empName, String empAddress, String empPhone,
                   String socSecNumber, double rate)
  {
    super(empName, empAddress, empPhone, socSecNumber, rate);

    bonus = 0;  					// bonus to be awarded
  }

  //-----------------------------------------------
  //  Awards the specified bonus to this executive.
  //-----------------------------------------------
  public void awardBonus(double execBonus)
  {
    bonus = execBonus;
  }

  //-------------------------------------------------------------
  //  Computes and returns the pay for an executive, which is the
  //  regular employee payment plus a one-time bonus.
  //--------------------------------------------------------------
  public double pay()
  {
    double payment = super.pay() + bonus;

    bonus = 0;

    return payment;
  }
  
} // end of class