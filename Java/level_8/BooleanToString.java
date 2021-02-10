///// Description /////
/*
Convert a Boolean to a String

Implement a function which convert the given boolean value into its string representation.
*/

///// Implementation /////
public class BooleanToString {
  public static String convert(boolean b){
    if(b == true) {
      return "true";
    } else {
      return "false";
    }
  }
}