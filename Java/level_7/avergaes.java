///// Description /////
/*
Averages of numbers

Write a method, that gets an array of integer-numbers and return an array of the 
averages of each integer-number and his follower, if there is one.

Example:

Input:  [ 1, 3, 5, 1, -10]
Output:  [ 2, 4, 3, -4.5]

If the array has 0 or 1 values or is null, your method should return an empty array.
*/

///// Implementation /////
public class averages{
  public static double[] averages(int[] numbers){
    // Check for null first so it can throw exception then if the length is 0 or 1 and return an empty array if either of these are satisfied
    if(numbers == null || numbers.length == 0 || numbers.length == 1){
      return new double[0];
    }
    else{
      double answer[] = new double[numbers.length-1];
      for(int i=0; i<numbers.length-1; i++){
          answer[i] = (double)(numbers[i] + numbers[i+1])/2;
      }
      return answer;
    }
  }
}