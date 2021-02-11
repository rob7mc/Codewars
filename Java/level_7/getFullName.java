///// Description /////
/*
FIXME: Get Full Name

The code provided is supposed return a person's Full Name given their first and last names.

But it's not working properly.

Notes

The first and/or last names are never null, but may be empty.

Task

Fix the bug so we can all go home early.
*/

///// Implementation /////
public class getFullName {

  private String firstName;
  private String lastName;
  
  public Dinglemouse(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  public String getFullName() {
    // Sees if first name is not null, if true returns first name, if false returns empty string
    firstName = firstName!=null ? firstName : "";
    // Sees if last name is not null, if true returns last name, if false returns empty string
    lastName = lastName!=null ? lastName : "";
    // Trim removes the leading & trailing white spaces
    return (firstName + " " + lastName).trim();
  }
  
}