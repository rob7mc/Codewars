///// Description /////
/*
Return Negative

In this simple assignment you are given a number and have to make it negative. 
But maybe the number is already negative?

Example:

Kata.makeNegative(1); // return -1
Kata.makeNegative(-5); // return -5
Kata.makeNegative(0); // return 0

Notes:

The number can be negative already, in which case no change is required.
Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
*/

///// Implementation /////
public class makeNegative {
  public static int makeNegative(final int x) {
    int answer = x;
    if(x < 0){return answer;}
    else if(x == 0){return answer;}
    else{
      answer = x*-1;
      return answer;
    }
  }
}