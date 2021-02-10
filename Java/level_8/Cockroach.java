///// Description /////
/*
Beginner Series #4 Cockroach

The cockroach is one of the fastest insects. Write a function which takes its speed in km per
hour and returns it in cm per second, rounded down to the integer (= floored).

For example:

cockroachSpeed(1.08) == 30
Note! The input is a Real number (actual type is language dependent) and is >= 0. The result
should be an Integer.
*/

///// Implementation /////
import java.lang.*;

public class Cockroach{
  public int cockroachSpeed(double x){
    double x2 = Math.floor(x * 27.778); // Rounds Down
    int answer = (int) x2; // Converts to int
    return answer;
  }
}