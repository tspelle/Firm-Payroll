//********************************************************************
//  StaffMember.java       Author: Lewis/Loftus
//
//  Represents a generic staff member.
//********************************************************************

abstract public class StaffMember
{
  protected String name;
  protected String address;
  protected String phone;

  //----------------------------------------------------------
  //  Constructor: Sets up this staff member using passed data
  //----------------------------------------------------------
  public StaffMember(String empName, String empAddress, String empPhone)
  {
    name = empName;
    address = empAddress;
    phone = empPhone;
  }

  //-----------------------------------------------------------
  //  Returns a string including the basic employee information
  //-----------------------------------------------------------
  public String toString()
  {
    String result = "Name: " + name + "\n";

    result += "Address: " + address + "\n";
    result += "Phone: " + phone;

    return result;
  }

  //----------------------------------------------------------------------
  //  Derived classes must define the pay method for each type of employee
  //----------------------------------------------------------------------
  public abstract double pay();

} // end of class